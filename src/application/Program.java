package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessMatch chessMath = new ChessMatch();
		UI.printBoard(chessMath.getPieces());
	}

	
}
