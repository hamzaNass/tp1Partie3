//*********************************************************************
//
// Programmeur : Maxime Dery et Hamza Nassime
// Date : 30 mars 2019
// Fichier : Taxe.java
//
//*********************************************************************

public class Taxe {
	public final static double TPS = 1.05;
	public final static double TVQ = 1.09975;

	public static double ajouterTaxes(double prix) {

		prix *= TPS * TVQ;

		return prix;
	}
}
