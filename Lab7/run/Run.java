package run;

import game.Mine;

public class Run {
	public static void main(String[] args){	
		Mine mine = new Mine();
		mine.readInput();
		mine.process();
		mine.printOut();	
	}
}
