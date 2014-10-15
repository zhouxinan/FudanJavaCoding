
public class ChessBoardByTiger {
	public static void main(String[] args) {
		drawT(1,4);
		drawT(13,9);
		drawT(10,13);
		drawT(4,1);
	}
	public static void drawT(int start,int end) {
		int MAXLENGTH=51;
		for (int i=start;(i-start)*(i-end)<=0;i=i+(end-start)/Math.abs(end-start)) {
			for (int j=0;j<(MAXLENGTH-(i*2-1))/2;j++) {
				System.out.print("  ");
			}
			for (int j=0;j<i;j++) {
				System.out.print("**  ");
			}
			System.out.println();
		}
	}
}
