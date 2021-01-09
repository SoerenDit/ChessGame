package main.java.chess.visual;

import main.java.chess.framework.Game;
import main.java.chess.view.BoardView;
import main.java.chess.view.ChessDrawing;
import minidraw.framework.Drawing;
import minidraw.framework.DrawingEditor;
import minidraw.framework.DrawingView;
import minidraw.framework.Factory;

import javax.swing.*;

public class ChessFactory implements Factory {

    private Game game;
    public ChessFactory(Game g) { game = g; }

    public DrawingView createDrawingView( DrawingEditor editor ) {
        DrawingView view =
                new BoardView(editor, game);
        return view;
    }

    public Drawing createDrawing( DrawingEditor editor ) {
        return new ChessDrawing( editor, game );
    }

    public JTextField createStatusField( DrawingEditor editor ) {
        JTextField f = new JTextField("SWEA template code");
        f.setEditable(false);
        return f;
    }
}
