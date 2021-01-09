package main.java.chess.view;

import main.java.chess.framework.Game;
import minidraw.framework.*;
import minidraw.standard.*;

import java.awt.*;

public class BoardView extends StdViewWithBackground {
    private Game game;

    public BoardView(DrawingEditor editor, Game game) {
        super(editor, "C:\\Users\\Soeren\\Desktop\\Git\\ChessGame\\src\\main\\resource\\chessboard");
        this.game = game;
    }

    public void drawBackground(Graphics g) {
        // draw the background graphics from the superclass
        super.drawBackground(g);
    }
}
