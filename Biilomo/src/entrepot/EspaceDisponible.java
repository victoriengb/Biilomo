package entrepot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class EspaceDisponible {

	public static final int placeDisponibleMax= 4;
	/**
	 * Espace disponible dans un emplacement (utile quand l'emplacement est vide)
	 */
	
	private int placeDisponible;
	
	/**
	 * Espace disponible sur la partie droite d'un emplacement (utile quand la partie gauche est occupé)
	 */
	
	private int placeDisponibleDroite;
	
	/**
	 * Espace disponible sur la partie gauche d'un emplacement (utile quand la partie droite est occupé)
	 */
	
	private int placeDisponibleGauche;
	
	/**
	 * Constructeur par défaut de la classe EspaceDisponible
	 */
	public EspaceDisponible() {
		this.placeDisponible = EspaceDisponible.placeDisponibleMax;
		this.placeDisponibleGauche= 0;
		this.placeDisponibleDroite= 0;
	}
	
	/**
	 * Remet les valeurs des attributs à leur valeur initiale
	 */
	public void resetPlaceDisponible() {
		this.placeDisponible= 4;
		this.placeDisponibleGauche= 0;
		this.placeDisponibleDroite= 0;
	}
	
	/**
	 * Met la place disponible globale à zéro parce qu'elle est partitionnée
	 */
	public void setPlaceDisponibleToZero() {
		this.placeDisponible= 0;
	}
	
	/**
	 * Libère de la place sur la partie gauche d'un emplacement
	 * @param placeSupplementaire
	 */
	public void incrementerPlaceDisponibleGauche(int placeSupplementaire) {
		this.placeDisponibleGauche+= placeSupplementaire;
	}
	
	/**
	 * retire de la place sur la partie gauche d'un emplaceement
	 * @param placeOccuppee
	 */
	public void decrementerPlaceDisponibleGauche(int placeOccuppee) {
		this.placeDisponibleGauche-= placeOccuppee;
	}

	/**
	 * Libère de la place sur la partie droite d'un emplacement
	 * @param placeSupplementaire
	 */
	public void incrementerPlaceDisponibleDroite(int placeSupplementaire) {
		this.placeDisponibleDroite+= placeSupplementaire;
	}
	
	/**
	 * retire de la place sur la partie droite d'un emplaceement
	 * @param placeOccuppee
	 */
	public void decrementerPlaceDisponibleDroite(int placeOccuppee) {
		this.placeDisponible-= placeOccuppee;
	}
	
	/**
	 * Indique si on a assez d'espace pour stocker un lot à un emplacement
	 * @param volume
	 * @return {@link Boolean}
	 */
	public boolean isEnoughPlaceDisponible(int volume) {
		if(this.placeDisponible >= volume) {
			return true;
		}
		return false;
	}

	/**
	 * Indique si on a assez d'espace pour stocker un lot sur la partie gauche d'un emplacement
	 * @param volume
	 * @return {@link Boolean}
	 */
	public boolean isEnoughPlaceDisponibleGauche(int volume) {
		if(this.placeDisponibleGauche >= volume) {
			return true;
		}
		return false;
	}
	
	/**
	 * Indique si on a assez d'espace pour stocker un lot sur la partie droite d'un emplacement
	 * @param volume
	 * @return {@link Boolean}
	 */
	public boolean isEnoughPlaceDisponibleDroite(int volume) {
		if(this.placeDisponibleDroite >= volume) {
			return true;
		}
		return false;
	}
	/**
	 * Retourne une description textuelle des objets EspaceDisponible
	 * @see java.lang.Object#toString()
	 * 
	 */
	
	@Override
	public String toString() {
		return "Espace Disponible Globale: " + this.placeDisponible + "\nEspace Disponible à Droite" + 
		this.placeDisponibleDroite + "\nEspace Disponible à Gauche" + this.placeDisponibleGauche;
	}
}
