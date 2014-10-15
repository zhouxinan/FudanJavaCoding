package cell;

public class Cell {
	private int status;
	private boolean visit;

	public static void test(){
		
	}

	public Cell() {
		this.setStatus(0);
		this.setVisit(false);
	}
	
	public Cell(int s) {
		this.setStatus(s);
		this.setVisit(false);
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public boolean isVisit() {
		return visit;
	}

	public void setVisit(boolean visit) {
		this.visit = visit;
	}

}
