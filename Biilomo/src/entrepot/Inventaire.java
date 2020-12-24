package entrepot;

import java.util.ArrayList;
import java.util.TreeMap;

import entrepot_lot.EspaceOccuppeLot;
import entrepot_lot.Lot;
import entrepot_lot.LotStock;
import entrepot_lot.LotType;
import entrepot_lot.PositionLot;
import entrepot_lot_enums.NomPiece;

/**
 * 
 * @author GBAGUIDI Victorien
 *
 * @param <E>
 */
public class Inventaire <E extends LotType> {

	ArrayList <LotStock> stock;
	TreeMap <Integer, E> lotsStockes;
	Emplacement[][] emplacements;
	
	public Inventaire() {
		this.stock= new ArrayList<LotStock>();
		this.lotsStockes= new TreeMap<Integer, E>();
		this.emplacements= new Emplacement[20][20];
	}
	
	/**
	 * Renvoie la position contenant les coordonnées de la case la plus à gauche de l'emplacement d'un lot
	 * @param volume
	 * @return {@link PositionLot}
	 */
	public PositionLot getPositionEmplacementDisponible(int volume) {
		int l= this.emplacements.length;
		int c= this.emplacements[0].length;
		
		for(int i=0 ; i < l ; i++) {
			for(int j=0 ; j < c ; j++) {
				EspaceDisponible espaceEmplacement= this.emplacements[i][j].getEspace();
				if(espaceEmplacement.isEnoughPlaceDisponible(volume)) {
					return new PositionLot(j, i);
				}
				else if()
			}
		}
	}
	
	/**
	 * Ajoute un lot à l'inventaire
	 * @param lot
	 */
	public void ajoutLot(Lot lot) {
		//NomPiece nomPieceLot= lot.getPiece().getNomPiece();
		//int volume= lot.getVolume();
		lot.setPositionLot(this.getPositionEmplacementDisponible(lot.getVolume()));;
	}
	
	/**
	 * Retire un lot de l'inventaire
	 * @param lot
	 */
	public void sortirLot(Lot lot) {
		
	}
	
	/**
	 * Retire un volume de pièces d'un lot de l'inventaire
	 * @param lot
	 */
	public void sortirVolumeLot(Lot lot) {
		
	}
	
	/**
	 * Déplace le lot permettant d'optimiser l'espace disponible dans l'inventaire
	 */
	public void deplacerLotOptimal() {
		
	}
	
	/**
	 * Retourne une description textuelle des objets Inventaire
	 * @see java.lang.Object#toString()
	 * 
	 */
	
	@Override
	public String toString() {
		
	}
}
