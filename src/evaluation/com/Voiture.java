package evaluation.com;

public class  Voiture extends Vehicule{

	private int nbPlaces;
	public Voiture(String immatriculation, String marque, double tarifJournalier, int nbPlaces) {
		super(immatriculation,marque,tarifJournalier);
		this.nbPlaces=nbPlaces;
	}
	
	@Override
	public double calculerCout(int nbJours) {
		double cout;
		if(nbPlaces<=5) {
			cout=tarifJournalier * nbJours;
			return cout;
		}else {
			cout=(tarifJournalier + 50) * nbJours;
			return cout;
		}
	}
}
