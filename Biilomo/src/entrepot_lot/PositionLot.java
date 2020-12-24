package entrepot_lot;

/** 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class PositionLot {
	
	/**
	 * indique la case � partir de laquelle est stock� le lot (la case la plus � gauche)
	 */
	private int abscisse;
	
	/**
	 * indique la rang�e o� est stock� le lot
	 */
	private int ordonnee;
	
	/**
	 * Constructeur par d�faut de la classe PositionLot (affecte des coordonn�es inexistantes)
	 */
	public PositionLot() {
		this.abscisse= -1;
		this.ordonnee= -1;
	}
	/**
	 * Constructeur param�tr� de la classe PositionLot
	 * @param abscisse
	 * @param ordonne
	 * 
	 */
	public PositionLot(int abscisse, int ordonnee) {
		this.abscisse= abscisse;
		this.ordonnee= ordonnee;
	}
	
	/**
	 * Permet de modifier la position de l'objet
	 * @param abscisse
	 * @param ordonnee
	 */
	public void setPosition(int abscisse, int ordonnee) {
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
	 * Permet de modifier l'ordonn�e de l'objet
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
		return "Rangee: " + this.ordonnee + "\t Case de d�part: " + this.abscisse;
	}
}
