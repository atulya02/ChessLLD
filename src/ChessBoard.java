import java.util.List;

public abstract class ChessBoard {
    List<List<Cell>> board;

    public abstract void reset();
    public abstract void update(Move move);

}
