package entrepot_meuble;

import java.util.Set;
import java.util.TreeMap;

import entrepot_lot.LotType;
import entrepot_meuble_enums.NomMeuble;
import entrepot_meuble_enums.NomPieceMaison;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 * @param <E> 
 * 
 */
public class Meuble <E extends LotType>{
	
	/**
	 * TreeMap: 
	 * 		Clé: Lot 
	 * 		Valeur: Volume Nécessaire
	 */
	TreeMap <E, Integer> lotsRequis;
	
	/**
	 * Nom du meuble
	 */
	NomMeuble nomMeuble;
	
	/**
	 * nom de la pièce où est censé être installé le meuble
	 */
	NomPieceMaison nomPieceMaison;
	
	/**
	 * Nombre de pas de temps requis pour construire le meuble
	 */
	int dureeConstruction;
	
	/**
	 * Constructeur paramétré de la classe Meuble
	 * @param nomMeuble
	 * @param nomPieceMaison
	 * @param dureeConstruction
	 */
	public Meuble(NomMeuble nomMeuble, NomPieceMaison nomPieceMaison, int dureeConstruction) {
		this.nomMeuble= nomMeuble;
		this.nomPieceMaison= nomPieceMaison;
		this.dureeConstruction= dureeConstruction;
		this.lotsRequis= new TreeMap <E, Integer>();
	}
	
	/**
	 * Permet d'ajouter les lots requis et leur volume pour la construction du meuble
	 * @param lot
	 * @param volumeRequis
	 */
	public void ajoutLotEtVolumeLot(E lot, int volumeRequis) {
		this.lotsRequis.put(lot, volumeRequis);
	}
	
	/**
	 * Retourne une description textuelle de l'objet Meuble
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Nom Meuble: " + this.nomMeuble + "\n Pièce Maison: " + this.nomPieceMaison + 
				"Liste de lots requis: " + this.listeLots();
	}
	
	/**
	 * Retourne la liste des lots requis pour construire le meuble ainsi que leur volume
	 * @return String
	 */
	public String listeLots() {		
		
		String listeLots = "";
		
		Set<E> cles= this.lotsRequis.keySet();
		
		for(E lot:cles) {
			listeLots+= "Lot Requis: " + lot + "\tVolume Requis: " + this.lotsRequis.get(lot) + "\n";
		}
		return listeLots;
	}
}
