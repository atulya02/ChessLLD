public abstract class PawnPiece extends Piece{
    CellPosition currentPosition;
    Color color;


    public abstract void possibleMoves(CellPosition start);
    public abstract void validateMove(CellPosition start);
    public abstract boolean move(CellPosition start, CellPosition end);
}
