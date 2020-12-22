package entrepot_lot;

/** 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class PositionLot {
	
	/**
	 * indique la case à partir de laquelle est stocké le lot
	 */
	private int abscisse;
	
	/**
	 * indique la rangée où est stocké le lot
	 */
	private int ordonnee;
	
	/**
	 * Constructeur de la classe PositionLot
	 * @param abscisse
	 * @param ordonne
	 * 
	 */
	public PositionLot(int abscisse, int ordonnee) {
		this.abscisse= abscisse;
		this.ordonnee= ordonnee;
	}
	
	/**
	 * Permet de modifier l'abscisse de l'objet
	 * @param abscisse
	 * 
	 */
	public void setAbscisse(int abscisse) {
		this.abscisse= abscisse;
	}
	
	/**
	 * Permet de modifier l'ordonnée de l'objet
	 * @param ordonnee
	 * 
	 */
	public void setOrdonnee(int ordonnee) {
		this.ordonnee= ordonnee;	
	}
	
	/**
	 * Retourne une description textuelle de l'objet PositionLot
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Rangee: " + this.ordonnee + "\t Case de départ: " + this.abscisse;
	}
}
