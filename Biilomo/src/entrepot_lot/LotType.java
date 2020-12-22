package entrepot_lot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */

public abstract class LotType {

	/**
	 * Volume d'un lot en mèetre cube (N.B: le volume est également le nombre de paquet de Pieces contenu dans le lot)
	 */
	protected int volume;
	
	/**
	 * Type de Pièce contenu dans le lot
	 */
	protected Piece piece;
	
	/**
	 * Constructeur paramétré de la classe LotType
	 * @param volume
	 * @param piece
	 */
	public LotType(int volume, Piece piece) {
		this.volume= volume;
		this.piece= piece;
	}
	
	/**
	 * Permet de retirer un certain volume de pièces d'un lot
	 * @param volume
	 */
	
	public void decrementerVolume(int volume) {
		
		/*
		 * FAIRE UNE EXCEPTION POUR S'ASSURER QUE LE PARAMETRE EST STRICTEMENT POSITIF PUIS
		 * SUPPRIMER LE COMMENTAIRE
		 */
		this.volume-= volume;
	}
	
	/**
	 * Retourne une description textuelle des objets LotType
	 * @see java.lang.Object#toString()
	 * 
	 */
	
	@Override
	public String toString() {
		return "Volume: " + this.volume + "\nPiece" + this.piece;
	}
}
