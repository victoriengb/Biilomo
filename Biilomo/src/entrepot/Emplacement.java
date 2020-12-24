package entrepot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 * 
 */
public class Emplacement {

	private EspaceDisponible espace;
	
	/**
	 * Constructeur par d�faut de la classe Emplacement
	 */
	public Emplacement() {
		espace= new EspaceDisponible();
	}
	
	/**
	 * Permet de r�cup�rer l'attribut espace
	 * @return {@link EspaceDisponible}
	 */
	public EspaceDisponible getEspace() {
		return this.espace;
	}
}
