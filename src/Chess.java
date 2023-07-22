import java.util.List;

public abstract class Chess {
    ChessBoard board;
    List<Player> players;
    List<Move> moves;
    GameStatus gameStatus;

    Player currentPlayer;

    public abstract void changeTurn();
    public abstract void playerMove(CellPosition start, CellPosition end, Piece piece);
    public abstract void endGame();



}
