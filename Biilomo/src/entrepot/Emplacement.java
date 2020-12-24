package entrepot;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 * 
 */
public class Emplacement {

	/**
	 * Indique la disponibilité d'un emplacement
	 */
	private boolean isDisponible;
	
	/**
	 * Constructeur par défaut de la classe Emplacement
	 */
	public Emplacement() {
		this.isDisponible= true;
	}
	
	/**
	 * Retourne une description textuelle de l'objet Emplacement
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * Retourne l'attribut isDiponible
	 * @return boolean
	 */
	public boolean getIsDisponible() {
		return this.isDisponible;
	}
	
	/**
	 * Affecte la valeur true à l'attribut isDisponible
	 */
	public void setDisponible() {
		this.isDisponible= true;
	}
	
	/**
	 * Affecte la valeur false à l'attribut isDisponible
	 */
	public void setIndisponible() {
		this.isDisponible= false;
	}
	
	@Override
	public String toString() {
		if(this.isDisponible == true) {
			return "Disponible";
		}
		return "Indisponible";
	}
}
