package main.java.chess.framework;

public interface Chess {
    void moveUnit(Position from, Position to);

    String getPieceAt(Position position);

    String getWinner();
}
