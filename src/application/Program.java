package application;

import boardgame.model.entities.Board;
import boardgame.model.entities.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
