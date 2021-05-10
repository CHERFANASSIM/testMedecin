package fr.simplon.medecine.model;

public class MedecinGeneraliste {
	
	private String nom;
	private String  prenom;
	private String numeroDeTelephone;
	private static int tarif=25;
	private Adresse adresse;
	

		public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		adresse = new Adresse();
		
		
	}
		
		public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.numeroDeTelephone = numeroDeTelephone;
			this.adresse =adresse;
		}

		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
       public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getNumeroDeTelephone() {
			return numeroDeTelephone;
		}
		public void setNumeroDeTelephone(String numeroDeTelephone) {
			this.numeroDeTelephone = numeroDeTelephone;
		}
		public static int getTarif() {
			return tarif;
		}
		public static void setTarif(int tarif) {
			MedecinGeneraliste.tarif = tarif;
		}
		public Adresse getAdresse() {
			return adresse;
		}
		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}
		public void afficher() {
		System.out.println(this.nom.toUpperCase() +" " +prenom );
		System.out.println("Telephone :"+this.numeroDeTelephone );
		System.out.println("Tarif :" +this.tarif);
		System.out.println("Adresse :");
		//Adresse adresse = new Adresse();
		
		adresse.afficher();
	}
	
	

}
