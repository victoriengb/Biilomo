package entrepot_lot;

import entrepot_lot_enums.NomPiece;

/**
 * 
 * @author GBAGUIDI Victorien
 * @version 1.0
 *
 */
public class Piece {

	/**
	 * Nom de la Pi�ce
	 */
	NomPiece nomPiece;
	
	/**
	 * Poids de la Pi�ce
	 */
	Double poids;
	
	/**
	 * Prix d'un paquet standard de la Piece
	 */
	Double prix;
	
	/**
	 * Constructeur param�tr� de la classe Pi�ce
	 * @param nomPiece
	 * @param poids
	 * @param prix
	 */
	public Piece(NomPiece nomPiece, Double poids, Double prix) {
		
		this.nomPiece= nomPiece;
		this.poids= poids;
		this.prix= prix;
	}
	
	/**
	 * Affecte une nouvelle valeur � l'attribut nomPiece
	 * @param nomPiece
	 */
	public void setNomPiece(NomPiece nomPiece) {
		this.nomPiece= nomPiece;
	}
	
	/**
	 * Affecte une nouvelle valeur � l'attribut poids
	 * @param poids
	 */
	public void setPoids(double poids) {
		this.poids= poids;
	}

	/**
	 * Affecte une nouvelle valeur � l'attribut prix
	 * @param prix
	 */
	public void setPrix(double prix) {
		this.prix= prix;
	}
	
	/**
	 * Renvoie le Nom d'une pi�ce
	 * @return {@link NomPiece}
	 */
	public NomPiece getNomPiece() {
		return this.nomPiece;
	}
	
	/**
	 * Renvoie le prix d'un paquet de Pi�ces
	 * @return double
	 */
	public double getPrix() {
		return this.prix;
	}
	
	/**
	 * Renvoie le poids d'un paquet de pi�ces
	 * @return double
	 */
	public double getPoids() {
		return this.poids;
	}
	
	/**
	 * Retourne une description textuelle des objets Piece
	 * @see java.lang.Object#toString()
	 * 
	 */
	
	@Override
	public String toString() {
		return "Nom de la piece: " + this.nomPiece + 
				"\n Poids de la piece: " + this.poids + "\n Prix de la piece: " + this.prix;
	}
}
