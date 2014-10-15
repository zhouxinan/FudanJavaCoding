package game;

import java.util.Scanner;

public class Mine {
	private int num1;
	private int num2;
	private String[][] map;
	private int[][] nums;
	
	public Mine(){
		map = new String[18][18];
		nums = new int[18][18];
		int temp = 0;
		for(int i=0;i<18;i++){
			for(int j=0;j<18;j++){
				nums[i][j] = 100;
				map[i][j] = " ";
			}
		}
		for(int i=1;i<17;i++){
			for(int j=1;j<17;j++){
				temp = (int)(14*Math.random())+1;
				if(temp%5==1){
					map[i][j] = "@";
				}else{
					map[i][j] = "L";
				}
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void readInput() {
		boolean pass = false;
		Scanner in;
		String inS;
		while(!pass){
			System.out.println("请输入地雷的坐标位置：");
			in = new Scanner(System.in);
			inS = in.nextLine();
			String[] tempS = inS.split(","); //提示用
			if(tempS.length==2){
				num1 = Integer.parseInt(tempS[0]);
				num2 = Integer.parseInt(tempS[1]);
				if(num1==-1&num2==-1){
					pass = true;
					printOut();
				}else if(num1>=1&num1<=16&&num2>=1&num2<=16){
					pass = true;
				}else{
					System.out.println("输入的坐标越界，请重新输入！");
				}
			}else{
				System.out.println("输入的格式不对，请重新输入！");
			}
		}
	}

	public void process() {
		if("@".equals(map[num1][num2])){
			System.out.println("@@我踩地雷了@@");
			num1 = -1;
			num2 = -1;
		}else{
			nums[num1][num2] = calculate(num1,num2);
		}
	}

	public void printOut() {
		if(num1==-1&&num2==-1){
			for(int i=1;i<17;i++){
				for(int j=1;j<17;j++){
					nums[i][j] = calculate(i,j);
					if("@".equals(map[i][j])){
						System.out.print("@ ");
					}else{
						System.out.print(nums[i][j]+" ");
					}		
				}
				System.out.println();
			}
			System.exit(0);
		}else{
			for(int i=1;i<17;i++){
				for(int j=1;j<17;j++){
					if(nums[i][j]==100){
						System.out.print("Q ");
					}else if(nums[i][j]==0){
						System.out.print("  ");
					}else{
						System.out.print(nums[i][j]+" ");
					}	
				}
				System.out.println();
			}
		}
	}
	
	public int calculate(int a,int b) {
		int count = 0;
		for(int i=a-1;i<=a+1;i++){
			for(int j=b-1;j<=b+1;j++){
				if("@".equals(map[i][j])){
					count++;
				}
			}
		}
		return count;
	}
}
