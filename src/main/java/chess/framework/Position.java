package main.java.chess.framework;

public class Position {
    private int row;
    private int column;

    public Position(int column, int row) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (o.getClass() != Position.class) { return false; }
        Position other = (Position) o;
        return row==other.row && column ==other.column;
    }

   public int hashCode() {
        // works ok for positions up to columns == 479
        return 479*row+column;
    }
}
