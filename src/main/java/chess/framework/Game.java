package main.java.chess.framework;

import main.java.chess.view.ChessDrawing;

public interface Game {
    void moveUnit(Position from, Position to);

    String getPieceAt(Position position);

    String getWinner();

    void addObserver(ChessDrawing chessDrawing);
}
