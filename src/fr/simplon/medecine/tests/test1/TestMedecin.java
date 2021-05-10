package fr.simplon.medecine.tests.test1;

import fr.simplon.medecine.model.Adresse;
import fr.simplon.medecine.model.MedecinGeneraliste;

public class TestMedecin {

	public static void main(String[] args) {
		System.out.println("__________________________ Médecins ______________________________");
		
		Adresse adresse1 = new Adresse("1 bis", 4, "","rue de Dampierre", 78460, "Chevreuse"  );
	
		
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", adresse1);
		MedecinGeneraliste edmond = new MedecinGeneraliste("Bosapin", "Edmond", "+33 2 17 18 19 20", adresse1);
		MedecinGeneraliste djemila = new MedecinGeneraliste("Table", "Djémila", "03-04-05-06-07", adresse1);

		melanie.afficher();		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();

		System.out.println("--------------- Changement du numéro de ce médecin ---------------");
		djemila.setNumeroDeTelephone("07-06-05-04-03");
		System.out.printf("Nouveau numéro du Dr %s : %s%n", djemila.getNom(), djemila.getNumeroDeTelephone());
		
		System.out.println("-------------- Changement du prix de la consultation -------------");
		MedecinGeneraliste.setTarif(23);
		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();
	}
}
