package main.java.chess.framework;

public interface Game {
    void moveUnit(Position from, Position to);

    String getPieceAt(Position position);

    String getWinner();

}
