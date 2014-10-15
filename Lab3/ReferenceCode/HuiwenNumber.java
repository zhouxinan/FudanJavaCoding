import java.util.Scanner;


public class HuiwenNumber {
	public static void main(String[] args){
		System.out.println("Please input the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if ((number>=10000)|(number<0)){
			System.out.println("Too large or too small");
		}else{
			if (number>=1000){
				int first=Integer.parseInt((number+"").charAt(0)+"");
				int second=Integer.parseInt((number+"").charAt(1)+"");
				int third=Integer.parseInt((number+"").charAt(2)+"");
				int last=Integer.parseInt((number+"").charAt(3)+"");
				if ((first==last)&&(second==third)){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
			if ((number>=100)&&(number<=999)){
				int first=Integer.parseInt((number+"").charAt(0)+"");
				int third=Integer.parseInt((number+"").charAt(2)+"");
				if (first==third){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
			if ((number>=10)&&(number<=99)){
				int first=Integer.parseInt((number+"").charAt(0)+"");
				int second=Integer.parseInt((number+"").charAt(1)+"");
				if (first==second){
					System.out.println("Yes");
				}else{
					System.out.println("NO");
				}
			}
			if (number<10){
				System.out.println("Yes");
			}
		}
	}
}
