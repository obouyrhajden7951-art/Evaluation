package evaluation.com;

public class Location {
	private int nbJours;
	private Client  Client;
	private Vehicule Vehicule;
	
	public Location(Client client, Vehicule vehicule , int nbJours) {
		this.Client = client;
		this.Vehicule = vehicule;
		this.nbJours = nbJours;
	}
	public double calculerMontant() {
		return this.Vehicule.calculerCout(nbJours);
	}
	 public void afficherRecapitulatif() {
	        System.out.println("Client : " + Client);
	        Vehicule.afficherDetails();
	        System.out.println("Durée : " + nbJours + " jours");
	        System.out.println("Montant total : " + calculerMontant() + " DH");
	    }

	
}
