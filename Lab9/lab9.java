import java.io.*;
import java.util.Scanner;
import java.lang.Character;

public class lab9 {
	public static String ans3 ="";
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("lab9.txt"));
		String str = in.next();
		System.out.println(str);
		in.close();
		
		PrintWriter out1 = new PrintWriter(new File("lab9-1.txt"));
		PrintWriter out2 = new PrintWriter(new File("lab9-2.txt"));
		PrintWriter out3 = new PrintWriter(new File("lab9-3.txt"));
	    
		String str1 = reverseString(str);
		System.out.println(str1);
		out1.write(str1);
		out1.close();
		
		String str2 = convertCase(str);
		System.out.println(str2);
		out2.write(str2);
		out2.close();
		
		countWord(str);
		System.out.println(ans3);
		out3.write(ans3);
		out3.close();
	}
	
	public static String reverseString(String str){
		int length = str.length();
		StringBuffer ans = new StringBuffer();
		for(int i=length-1;i>=0;i--){
			ans.append(str.charAt(i));
		}
		return ans.toString();
	}
	
	public static String convertCase(String str){
		int length = str.length();
		StringBuffer ans = new StringBuffer();
		for(int i=0;i<length;i++){
			if(Character.isUpperCase(str.charAt(i))==true){
				ans.append(Character.toLowerCase(str.charAt(i)));
			}
			if(Character.isLowerCase(str.charAt(i))==true){
				ans.append(Character.toUpperCase(str.charAt(i)));
			}
		}
		return ans.toString();
	}
	
	public static void countWord(String str){
		int[] counts = new int[26];
		StringBuffer ans = new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))==true){
				ans.append(Character.toLowerCase(str.charAt(i)));
			}
		}
		str = ans.toString();
		for(int i=0;i<str.length();i++){
			if(Character.isLetter(str.charAt(i))){
				counts[str.charAt(i)-'a']++;
			}
		}
		for(int i=0;i<26;i++){
			if(counts[i]!=0){
				ans3 += (char)('a'+i)+":"+counts[i]+"; ";
			}
		}
	}
	
}
