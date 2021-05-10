package fr.simplon.medecine.tests.test1;

import java.time.LocalDate;

import fr.simplon.medecine.model.*;


public class TestPatient {

	public static void main(String[] args) {
		System.out.println("__________________________ Patient _______________________________");
		
		Adresse adresse1 = new Adresse("1 bis", 4, "","rue de Dampierre", 78460, "Chevreuse"  );
		
		Patient hillary = new Patient("Vambuce", "Hillary", "0123456789", 'F', 287060244010154l, LocalDate.of(1977, 10, 13), "Allergie aux arachides", adresse1);
		
		
		
		Patient ines = new Patient("Perret", "Inès", "0698745123", 'F', 245021067034521l, LocalDate.of(1945, 2, 10),
				null, adresse1);
		Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, adresse1);
		
		hillary.afficher();
		System.out.println("------------------------------------------------------------------");
		ines.afficher();
		System.out.println("------------------------------------------------------------------");
	         adhemar.afficher();
	}
}
