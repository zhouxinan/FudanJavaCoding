package lab6;

public class Cantor {
	public static int factorial(int number){
		int ans=1;
		for (int i=number;i>1;i--){
			ans=ans*i;
		}
		return ans;
	}
	public static void main(String[] args){
		System.out.println(factorial(5));
		System.out.println(cantorExpansion("321"));
		System.out.println(cantorExpansion("357412968"));
		System.out.println(cantorInverseOperation(5,96));
		System.out.println(cantorInverseOperation(9,98885));
		System.out.println(cantorInverseOperation(9,456));
	}
	public static int cantorExpansion(String arrangement){
		int length=arrangement.length();
		boolean[] isUsed=new boolean[length+1];
		int sum=0;
		for (int i=0;i<length;i++){
			int number=Integer.parseInt(arrangement.charAt(i)+"");
			int count=0;
			for (int j=1;j<number;j++){
				if (!isUsed[j]){
					count++;
				}
			}
			isUsed[number]=true;
			sum+=count*factorial(length-i-1);
		}
		sum++;
		return sum;
	}
	public static String cantorInverseOperation(int n,int x){
		int temp=x-1;
		String ans="";
		int i=n-1;
		boolean[] isUsed=new boolean[n+1];
		while(temp!=0){
			int quotient=temp / factorial(i);
			int remainder=temp % factorial(i);
			temp=remainder;
			int count=0;
			for (int j=1;j<=n;j++){
				if (!isUsed[j]){
					if (count<quotient){
						count++;
					}else{
						ans+=j;
						isUsed[j]=true;
						break;
					}
				}
			}
			i--;
		}
		for (int j=1;j<=n;j++){
			if (!isUsed[j]){
				ans+=j;
			}
		}
		return ans;
	}
}
