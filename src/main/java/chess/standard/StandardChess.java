package main.java.chess.standard;

import main.java.chess.framework.Chess;
import main.java.chess.framework.Pieces;

import java.util.HashMap;
import java.util.Map;

import static main.java.chess.framework.Pieces.PAWN;

/*
Iteration 1
A chess board with 16 white pawns and 16 black pawns, all being able to move forward 1 step at the time,
until they meet an opponent pawn.
White wins after 10 turns.

 */
public class StandardChess implements Chess {
    Map<String, String> board;

    public static void main(String[] args) {
        // write your code here
    }

    public StandardChess() {
        board = new HashMap<>();
        board.put("a2", PAWN);
    }

    @Override
    public void moveUnit(String from, String to) {
        if (isMoveValid(from, to)) {
            String piece = board.get(from);
            board.remove(from);
            board.put(to, piece);
        }
    }

    private boolean isMoveValid(String from, String to) {
        String piece = board.get(from);

        if (piece == null) return false;

        

        return true;
    }

    @Override
    public String getPieceAt(String position) {
        return board.get(position);
    }
}
