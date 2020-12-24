package entrepot_lot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class EspaceOccuppeLot {

	/**
	 * Indique l'espace occup� par le lot � droite de sa case d'origine (la case la plus � gauche)
	 */
	private int placeOccuppeDroite;
	
	/**
	 * Constructeur par d�faut de la classe EspaceOccuppeLot
	 * 
	 */
	public EspaceOccuppeLot() {	
		this.placeOccuppeDroite= 0;
	}
	
	/**
	 * Constructeur param�tr�
	 * @param placeOccuppeGauche
	 * @param placeOccuppeDroite
	 */
	public EspaceOccuppeLot(int placeOccuppeDroite) {
		this.placeOccuppeDroite= placeOccuppeDroite;
	}
	
	/**
	 * Permet de mettre � jour l'attribut placeOccuppeDroite
	 * @param placeOccuppeDroite
	 */
	public void setPlaceOccuppeDroite(int placeOccuppeDroite) {
		this.placeOccuppeDroite= placeOccuppeDroite;
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
		return "Espace Occupe � Droite de la case d'origine: " + this.placeOccuppeDroite;
	}
}
