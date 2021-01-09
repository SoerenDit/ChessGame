package main.java.chess.view;

import main.java.chess.framework.Game;
import main.java.chess.framework.GameObserver;
import main.java.chess.visual.ChessFactory;
import minidraw.framework.*;
import minidraw.standard.StandardDrawing;

import java.util.Iterator;
import java.util.List;

public class ChessDrawing implements Drawing, GameObserver {

    protected Drawing delegate;

    /**
     * the Game instance that this CivDrawing is going to render units
     * from
     */
    protected Game game;

    public ChessDrawing(DrawingEditor editor, Game game) {
        super();
        this.delegate = new StandardDrawing();
        this.game = game;
        // register this unit drawing as listener to any game state
        // changes...
        game.addObserver(this);
        // ... and build up the set of figures associated with
    }

    @Override
    public void clearSelection() {
        delegate.clearSelection();
    }

    @Override
    public List<Figure> selection() {
        return null;
    }

    @Override
    public void addToSelection(Figure figure) {

    }

    @Override
    public void removeFromSelection(Figure arg0) {
        delegate.removeFromSelection(arg0);
    }


    @Override
    public void toggleSelection(Figure arg0) {
        delegate.toggleSelection(arg0);
    }

    @Override
    public void figureChanged(FigureChangeEvent arg0) {
        delegate.figureChanged(arg0);
    }

    @Override
    public void figureRemoved(FigureChangeEvent arg0) {
        delegate.figureRemoved(arg0);
    }

    @Override
    public void figureRequestRemove(FigureChangeEvent arg0) {
        delegate.figureRequestRemove(arg0);
    }

    @Override
    public void figureRequestUpdate(FigureChangeEvent arg0) {
        delegate.figureRequestUpdate(arg0);
    }

    @Override
    public void removeDrawingChangeListener(DrawingChangeListener arg0) {
        delegate.removeDrawingChangeListener(arg0);
    }

    @Override
    public Figure findFigure(int arg0, int arg1) {
        return delegate.findFigure(arg0, arg1);
    }

    @Override
    public void requestUpdate() {

    }

    @Override
    public Figure add(Figure figure) {
        return null;
    }

    @Override
    public Iterator<Figure> iterator() {
        return delegate.iterator();
    }

    @Override
    public void lock() {
        delegate.lock();
    }

    @Override
    public Figure remove(Figure arg0) {
        return delegate.remove(arg0);
    }

    @Override
    public void unlock() {
        delegate.unlock();
    }

    @Override
    public void addDrawingChangeListener(DrawingChangeListener drawingChangeListener) {

    }

    @Override
    public void figureInvalidated(FigureChangeEvent figureChangeEvent) {

    }
}
