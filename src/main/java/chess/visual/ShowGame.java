package main.java.chess.visual;

import main.java.chess.framework.Game;
import main.java.chess.standard.StandardGame;
import minidraw.framework.DrawingEditor;
import minidraw.standard.MiniDrawApplication;

public class ShowGame {

    public static void main(String[] args) {
        Game game = new StandardGame();

        DrawingEditor editor =
                new MiniDrawApplication( "Move any unit using the mouse",
                        new ChessFactory(game) );
        editor.open();
        editor.showStatus("Try to play SemiCiv haha (you can't)");

        //editor.setTool( new CompositionTool(editor, game));
    }
}
