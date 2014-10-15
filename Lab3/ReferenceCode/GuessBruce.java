import java.util.Scanner;

public class GuessBruce {
	public static void main(String[] args){
		System.out.println("Please guess Bruce's Iq:");
		Scanner sc=new Scanner(System.in);
		int bruceIq=sc.nextInt();
		if (bruceIq>=70){
			System.out.println("别开玩笑了");
		}else{
			if (bruceIq>=50){
				System.out.println("猜得太高了");
			}else{
				if (bruceIq>=25){
					System.out.println("猜得有点高");
				}else{
					if (bruceIq>=0){
						System.out.println("就差一点就猜对了");
					}else{
						System.out.println("恭喜你，符号对了");
					}
				}
			}
		}
	}
}
