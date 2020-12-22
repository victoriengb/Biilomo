package entrepot_lot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class Lot extends LotType {

	/**
	 * Dernier ID d'un lot
	 */
	private static int countId= 1;
	
	/**
	 * Id d'un lot
	 */
	private int id;
	
	/**
	 * Contructeur paramétré de la classe Lot
	 * @param volume
	 * @param piece
	 */
	public Lot(int volume, Piece piece) {
		
		super(volume, piece);
		this.id= countId;
		countId++;
	}
	
	/**
	 * Retourne une description textuelle des objets Lot
	 * @see java.lang.Object#toString()
	 * 
	 */
	
	@Override
	public String toString() {
		return "Id: " + this.id + "\nVolume Lot: " + this.volume + "\nPiece" + this.piece;
	}
}
