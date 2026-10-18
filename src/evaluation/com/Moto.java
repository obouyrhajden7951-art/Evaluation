package evaluation.com;

public class Moto extends Vehicule {
	private int cylindree;
	
	public Moto(String immatriculation, String marque, double tarifJournalier, int cylindree) {
		super(immatriculation, marque, tarifJournalier);
		this.cylindree = cylindree;
	}
	
	@Override
	public double calculerCout(int nbJours) {
		double cout;
		if(nbJours<5) {
			cout=tarifJournalier*nbJours;
		}else {
			cout=(tarifJournalier*nbJours)-(tarifJournalier*nbJours)*0.1;
		}
		return cout;
		
	}
	
}
