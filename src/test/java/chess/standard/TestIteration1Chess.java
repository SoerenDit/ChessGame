package test.java.chess.standard;

import main.java.chess.framework.Position;
import main.java.chess.standard.StandardChess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static main.java.chess.framework.Pieces.PAWN;
import static main.java.chess.framework.Player.WHITE;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestIteration1Chess {
    private StandardChess game;

    @BeforeEach
    public void setup() {
        game = new StandardChess();
    }


    @Test
    public void shouldBeWhitePawnAtA2() {
        Position a2 = new Position(0,1);
        assertThat(game.getPieceAt(a2),is(PAWN));
    }

    @Test
    public void shouldNotBeWhitePawnAtA3() {
        Position a3 = new Position(0,2);
        assertThat(game.getPieceAt(a3),is(nullValue()));
    }

    @Test
    public void shouldMoveWhitePawnFroma2Toa3() {
        Position a2 = new Position(0,1);
        Position a3 = new Position(0,2);
        game.moveUnit(a2,a3);
        assertThat(game.getPieceAt(a2),is(nullValue()));
        assertThat(game.getPieceAt(a3),is(PAWN));
    }

    @Test
    public void pawnsCanOnlyMoveOneSquare() {
        Position a2 = new Position(0,1);
        Position a3 = new Position(0,2);
        Position a5 = new Position(0,4);
        game.moveUnit(a2,a3);
        game.moveUnit(a3,a5);
        assertThat(game.getPieceAt(a3),is(PAWN));
        assertThat(game.getPieceAt(a5),is(nullValue()));
    }

    @Test
    public void pawnsCanOnlyMoveStraight() {
        Position a2 = new Position(0,1);
        Position b3 = new Position(1,2);
        game.moveUnit(a2,b3);
        assertThat(game.getPieceAt(b3),is(nullValue()));
    }

    @Test
    public void whiteShouldWinWhenReachingEndRow() {
        game.moveUnit(new Position(0,1), new Position(0,2));
        game.moveUnit(new Position(0,2), new Position(0,3));
        game.moveUnit(new Position(0,3), new Position(0,4));
        game.moveUnit(new Position(0,4), new Position(0,5));
        game.moveUnit(new Position(0,5), new Position(0,6));
        assertThat(game.getWinner(),is(nullValue()));
        game.moveUnit(new Position(0,6), new Position(0,7));
        assertThat(game.getWinner(),is(WHITE));

    }


}
