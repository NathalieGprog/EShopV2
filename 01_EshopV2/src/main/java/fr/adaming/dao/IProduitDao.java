package fr.adaming.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import fr.adaming.entite.Categorie;
import fr.adaming.entite.Produit;

public interface IProduitDao extends IGeneriqueDao<Produit> {
	
	public void ajouter(Produit t);
	public Collection<Produit> obtenirTous();
	public void modifier(Produit t);
	public void supprimer(Produit t);
	public Produit obtenirUn(int id);
	public Map<Produit,Categorie> obtenirCategorieDuProduit();
	public int obtenirCleEtrangere(int id);
	public List<Produit> obtenirProduitParCategorie();
}