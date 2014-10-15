public class ChessBoard {

	//true:increase; false:decrease
	private static void printScreen(int len, int row, boolean flag) {
		int delta = (flag)?1:-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < (13 - len); j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <len; j++) {
				System.out.print("**  ");
			}
			System.out.println();
			len += delta;
		}
	}
	
	public static void main(String args[]) {
		printScreen(1, 4, true);
		printScreen(13, 5, false);
		printScreen(10, 4, true);
		printScreen(4, 4, false);
	}
}