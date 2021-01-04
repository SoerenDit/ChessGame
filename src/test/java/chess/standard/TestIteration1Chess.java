package test.java.chess.standard;

import main.java.chess.standard.StandardChess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static main.java.chess.framework.Pieces.PAWN;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestIteration1Chess {
    private StandardChess game;

    @BeforeEach
    public void setup() {
        game = new StandardChess();
    }

    @Test
    public void shouldWork() {
        assertThat(1, is(1));
    }

    @Test
    public void shouldBeWhitePawnAtA2() {
        assertThat(game.getPieceAt("a2"),is(PAWN));
    }

    @Test
    public void shouldNotBeWhitePawnAtA3() {
        assertThat(game.getPieceAt("a3"),is(nullValue()));
    }

    @Test
    public void shouldMoveWhitePawnFroma2Toa3() {
        game.moveUnit("a2","a3");
        assertThat(game.getPieceAt("a2"),is(nullValue()));
        assertThat(game.getPieceAt("a3"),is(PAWN));
    }

    @Test
    public void pawnsCanOnlyMoveOneSquare() {
        game.moveUnit("a2","a3");
        game.moveUnit("a3","a5");
        assertThat(game.getPieceAt("a3"),is(PAWN));
        assertThat(game.getPieceAt("a5"),is(nullValue()));
    }



}
