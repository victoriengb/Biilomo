package entrepot_lot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class EspaceOccuppeLot {

	/**
	 * Indique l'espace occupé par le lot à gauche de sa case d'origine
	 */
	private int placeOccuppeGauche;
	
	/**
	 * Indique l'espace occupé par le lot à droite de sa case d'origine
	 */
	private int placeOccuppeDroite;
	
	/**
	 * Constructeur par défaut de la classe EspaceOccuppeLot
	 * 
	 */
	public EspaceOccuppeLot() {	
		this.placeOccuppeDroite= 0;
		this.placeOccuppeGauche= 0;
	}
	
	/**
	 * Constructeur paramétré
	 * @param placeOccuppeGauche
	 * @param placeOccuppeDroite
	 */
	public EspaceOccuppeLot(int placeOccuppeGauche, int placeOccuppeDroite) {
		this.placeOccuppeDroite= placeOccuppeDroite;
		this.placeOccuppeGauche= placeOccuppeGauche;
	}
	
	/**
	 * Permet de mettre à jour l'attribut placeOccuppeGauche
	 * @param placeOccuppeGauche
	 */
	public void setPlaceOccuppeGauche(int placeOccuppeGauche) {
		this.placeOccuppeGauche= placeOccuppeGauche;
	}
	
	/**
	 * Permet de mettre à jour l'attribut placeOccuppeDroite
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
		return "Espace Occupe à Droite de la case d'origine: " + this.placeOccuppeDroite + 
				"\t Espace Occupe à Gauche de la case d'origine: " + this.placeOccuppeGauche;
	}
}
