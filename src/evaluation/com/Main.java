package evaluation.com;

public class Main {

	public static void main(String[] args) {
		Client c1=new Client(1, "Bouyrhajden", "Oumaima");
		Client c2=new Client(1, "Bouyrhajden", "Oumaima");
		
		Voiture v1 = new Voiture("A-111", "Dacia", 300, 5);
		Voiture v2 = new Voiture("B-222", "Renault", 400, 7);
		
		System.out.println(v1.calculerCout(3)); 
		System.out.println(v2.calculerCout(2));
		
		Moto m1 = new Moto("M-134", "Yamaha", 150, 125);
		
		Vehicule[] vehicules = new Vehicule[3];
		vehicules[0] = v1;
		vehicules[1] = v2;
		vehicules[2] = m1;
		
		for (Vehicule v : vehicules) {
		    v.afficherDetails();
		}
		
		Location l1 = new Location(c1, v1, 3);
		Location l2 = new Location(c1, v2, 2);
		Location l3 = new Location(c2, m1, 6);
		
		Location[] locations=new Location[3];
		locations[0]=l1;
		locations[1]=l2;
		locations[2]=l3;
		
		double total=0;
		 for (Location l : locations) {
	            l.afficherRecapitulatif();
	            total += l.calculerMontant();
	            System.out.println();
	        }
		System.out.println("Montant total de toutes les locations :"+total);
	}
}
