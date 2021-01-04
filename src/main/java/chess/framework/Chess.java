package main.java.chess.framework;

public interface Chess {
    void moveUnit(String from, String to);

    String getPieceAt(String position);
}
