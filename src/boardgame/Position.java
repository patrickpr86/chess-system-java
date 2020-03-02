package boardgame;

public class Position {

	private int row;
	private int column;

	public Position(int row, int collor) {
		this.row = row;
		this.column = collor;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollor() {
		return column;
	}

	public void setCollor(int collor) {
		this.column = collor;
	}
	
	
	@Override
	public  String toString() {
		return row + ", " + column;
	}

}
