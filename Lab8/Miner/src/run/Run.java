package run;

import mine.Mine;

public class Run {
	
	public static void main(String args[]) {
		Mine mine = new Mine(10, 8);
		mine.initialize();
		mine.printAll();
		
		while(true) {
			mine.readInput();
			mine.process();
			mine.printOut();
		}
	}

}
