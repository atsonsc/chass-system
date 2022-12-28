package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position() {
	}

	public Position(int row, int collum) {
		this.row = row;
		this.column = collum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollum() {
		return column;
	}

	public void setCollum(int collum) {
		this.column = collum;
	}

	@Override
	public String toString() {
		return "Position -  row: " + row + " ," + " collum: " + column ;
	}
	
	

}
