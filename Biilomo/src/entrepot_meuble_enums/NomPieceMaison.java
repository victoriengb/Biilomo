package entrepot_meuble_enums;

public enum NomPieceMaison {
	salon, chambre_a_coucher, salle_a_manger, cuisine, salle_de_bains, hall, buanderie, grenier, sous_sol, balcon;
	
	public void getNomPieceMaison() {
		switch(this) {
		case salon:
			System.out.println("salon");
		case chambre_a_coucher:
			System.out.println("chambre_a_coucher");
		case salle_a_manger:
			System.out.println("salle_a_manger");
		case cuisine:
			System.out.println("cuisine");
		case salle_de_bains:
			System.out.println("salle_de_bains");
		case hall:
			System.out.println("hall");
		case buanderie:
			System.out.println("buanderie");
		case grenier:
			System.out.println("grenier");
		case sous_sol:
			System.out.println("sous_sol");
		case balcon:
			System.out.println("balcon");
		defaut:
			System.out.println("null");
		}
	}
}
