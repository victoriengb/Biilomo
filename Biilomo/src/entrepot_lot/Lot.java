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
	private Integer id;
	
	/**
	 * Indique l'espace occupé par le lot à droite et à gauche de sa case initiale
	 */
	private EspaceOccuppeLot espaceOccuppe;
	
	/**
	 * Indique la position du lot dans l'inventaire
	 */
	private PositionLot positionLot;
	
	/**
	 * Contructeur paramétré de la classe Lot
	 * @param volume
	 * @param piece
	 */
	public Lot(int volume, Piece piece) {
		
		super(volume, piece);
		this.espaceOccuppe= new EspaceOccuppeLot();
		this.positionLot= new PositionLot();
		this.id= countId;
		countId++;
	}
	
	/**
	 * Renvoie l'attribut espaceOccuppe
	 * @return {@link EspaceOccuppeLot}
	 */
	public EspaceOccuppeLot getEspaceOccuppe() {
		return this.espaceOccuppe;
	}
	
	/**
	 * Renvoie l'attribut positionLot
	 * @return {@link PositionLot}
	 */
	public PositionLot getPositionLot() {
		return this.positionLot;
	}
	
	/**
	 * Affecte une nouvelle position au lot
	 * @param position
	 */
	public void setPositionLot(PositionLot position) {
		this.positionLot= position;
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
