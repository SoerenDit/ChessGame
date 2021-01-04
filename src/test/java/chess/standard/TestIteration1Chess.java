package test.java.chess.standard;

import main.java.chess.standard.StandardChess;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestIteration1Chess {

    @Test
    public void shouldWork() {
        StandardChess standardChess = new StandardChess();
        assertThat(1,is(1));
    }

}
