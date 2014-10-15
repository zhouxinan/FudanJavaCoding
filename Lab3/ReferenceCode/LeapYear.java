import java.util.Scanner;


public class LeapYear {
	public static void main(String[] args){
		System.out.println("Please input the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if (year<=0){
			System.out.println("Invalid input");
		}else{
			if ((year %4 ==0 && year %100 !=0)||(year %400==0)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
