package mine;

import java.util.Scanner;

import cell.Cell;

public class Mine {
	private int mineNum;
	private int length;
	private Cell[][] data;
	
	private int nowX, nowY;
	private int alreadyOpened;
	private Scanner scanner;
	
	public Mine() {
		this.setLength(10);
		this.setMineNum(10);
		this.data = new Cell[10][10];
		this.alreadyOpened = 0;
	}
	
	public Mine(int num, int l) {
		this.setLength(l+2);
		this.setMineNum(num);
		this.data = new Cell[l+2][l+2];
		this.alreadyOpened = 0;
	}
	
	public void initialize() {
		for (int i = 0; i < this.length; i++) 
			for (int j = 0; j < this.length; j++)
				this.data[i][j] = new Cell();
		
		int x, y;
		for (int k = 0; k < this.mineNum; k++) {
			do {
				x = (int)Math.floor(Math.random()*(this.length-2)) + 1;
				y = (int)Math.floor(Math.random()*(this.length-2)) + 1;
			} while (data[x][y].getStatus() < 0);
			data[x][y].setStatus(-1);
			for (int i = x-1; i < x+2; i++)
				for (int j = y-1; j < y+2; j++)
					if (data[i][j].getStatus() >= 0)
						data[i][j].setStatus(data[i][j].getStatus()+1);
		}
		
		for (int i = 0; i < this.length; i++) {
			data[i][0].setVisit(true);
			data[i][this.length-1].setVisit(true);
			data[0][i].setVisit(true);
			data[this.length-1][i].setVisit(true);
		}

		scanner = new Scanner(System.in);
	}
	
	public void readInput() {
		System.out.println("Please input the location:");
		nowX = scanner.nextInt();
		nowY = scanner.nextInt();
		//scanner.close();
	}
	
	public void process() {
		open(nowX, nowY);
	}
	
	public void open(int x, int y) {
		if (data[x][y].getStatus() < 0) {
			System.out.println("BOOM!!!!!!!!!!");
			System.exit(0);
		}
		data[x][y].setVisit(true);
		this.alreadyOpened++;
		if (this.alreadyOpened+this.mineNum == (this.length-2)*(this.length-2)) {
			this.printOut();
			System.out.println("YOU WIN!!!!!!!");
			System.exit(0);
		}
		if (data[x][y].getStatus() > 0)
			return;
		for (int i = x-1; i < x+2; i++)
			for (int j = y-1; j < y+2; j++)
				if (!data[i][j].isVisit())
					open(i, j);
	}
	
	public void printOut() {
		for (int i = 1; i < this.length; i++)
			System.out.print("--");
		System.out.println();
		for (int i = 1; i < this.length-1; i++) {
			System.out.print("|");
			for (int j = 1; j < this.length-1; j++) {
				if (data[i][j].isVisit())
					if (data[i][j].getStatus() == 0)
						System.out.print("  ");
					else System.out.print(data[i][j].getStatus() + " ");
				else System.out.print("@ ");
			}
			System.out.println("|");
		}
		for (int i = 1; i < this.length; i++)
			System.out.print("--");
		System.out.println();
	}
	
	public void printAll() {
		for (int i = 1; i < this.length-1; i++) {
			for (int j = 1; j < this.length-1; j++) {
				if (data[i][j].getStatus() == -1)
					System.out.print("* ");
				else System.out.print(data[i][j].getStatus() + " ");
			}
			System.out.println();
		}
	}
	
	public int getMineNum() {
		return mineNum;
	}

	public void setMineNum(int mineNum) {
		this.mineNum = mineNum;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
