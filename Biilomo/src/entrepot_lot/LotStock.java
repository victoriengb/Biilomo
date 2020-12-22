package entrepot_lot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class LotStock extends LotType{

	/**
	 * Constructeur paramétré de la classe LotType
	 * @param volumeTotalLot
	 * @param piece
	 */
	public LotStock(int volumeTotalLot, Piece piece) {
		super(volumeTotalLot, piece);
	}

	/**
	 * Retourne une description textuelle des objets LotStock
	 * @see java.lang.Object#toString()
	 * 
	 */
	
	@Override
	public String toString() {
		return "Volume Total (stock): " + this.volume + "\nPiece" + this.piece;
	}
}
