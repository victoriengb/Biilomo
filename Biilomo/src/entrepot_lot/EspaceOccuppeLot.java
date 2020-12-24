package entrepot_lot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class EspaceOccuppeLot {

	/**
	 * Indique l'espace occup� par le lot � gauche de sa case d'origine
	 */
	private int placeOccuppeGauche;
	
	/**
	 * Indique l'espace occup� par le lot � droite de sa case d'origine
	 */
	private int placeOccuppeDroite;
	
	/**
	 * Constructeur par d�faut de la classe EspaceOccuppeLot
	 * 
	 */
	public EspaceOccuppeLot() {	
		this.placeOccuppeDroite= 0;
		this.placeOccuppeGauche= 0;
	}
	
	/**
	 * Constructeur param�tr�
	 * @param placeOccuppeGauche
	 * @param placeOccuppeDroite
	 */
	public EspaceOccuppeLot(int placeOccuppeGauche, int placeOccuppeDroite) {
		this.placeOccuppeDroite= placeOccuppeDroite;
		this.placeOccuppeGauche= placeOccuppeGauche;
	}
	
	/**
	 * Permet de mettre � jour l'attribut placeOccuppeGauche
	 * @param placeOccuppeGauche
	 */
	public void setPlaceOccuppeGauche(int placeOccuppeGauche) {
		this.placeOccuppeGauche= placeOccuppeGauche;
	}
	
	/**
	 * Permet de mettre � jour l'attribut placeOccuppeDroite
	 * @param placeOccuppeDroite
	 */
	public void setPlaceOccuppeDroite(int placeOccuppeDroite) {
		this.placeOccuppeDroite= placeOccuppeDroite;
	}
	
	public void decrementerPlaceOccuppeGauche(int volume) {
		this.placeOccuppeGauche-= volume;
	}
	
	public void decrementerPlaceOccuppeDroite(int volume) {
		this.placeOccuppeDroite-= volume;
	}
	
	/**
	 * Retourne une description textuelle des objets EspaceOccuppeLot
	 * @see java.lang.Object#toString()
	 * 
	 */
	@Override
	public String toString() {
		return "Espace Occupe � Droite de la case d'origine: " + this.placeOccuppeDroite + 
				"\t Espace Occupe � Gauche de la case d'origine: " + this.placeOccuppeGauche;
	}
}
