package lab4;

public class multiplicationTable {
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				if(j*i>9){
					System.out.print(j+" * "+i+" = "+j*i+"  ");
				}
				else{
					System.out.print(j+" * "+i+" = "+j*i+"   ");
				}
			}
			System.out.println();
		}
	}
}
