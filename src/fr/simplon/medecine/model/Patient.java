package fr.simplon.medecine.model;

import java.time.LocalDate;

public class Patient {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long numeroDeSecuriteSociale;
	private LocalDate date;
	private String commentaires;
	private Adresse adresse;

	
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, Long numeroDeSecuriteSociale,
			LocalDate date, String commentaires) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		this.date = date;
		this.commentaires = commentaires;
	
	}
	

	
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroDeSecuriteSociale,
			LocalDate date, String commentaires, Adresse adresse ) {
		this(nom, prenom, numeroDeTelephone,sexe,numeroDeSecuriteSociale,date,commentaires   );
	
		this.adresse = adresse;
	
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



	public char getSexe() {
		return sexe;
	}



	public void setSexe(char sexe) {
		this.sexe = sexe;
	}



	public Long getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}



	public void setNumeroDeSecuriteSociale(Long numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getCommentaires() {
		return commentaires;
	}



	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}



	public Adresse getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

	public void afficher() {
		System.out.println(this.nom.toUpperCase() + " " + prenom);
		System.out.println("T�lephone " + this.numeroDeTelephone);
		System.out.println("Num�ro de S�curit� socila :" + this.numeroDeSecuriteSociale);
		if (this.sexe == 'F') {
			System.out.println("Sexe : F�minin");
		} else if (this.sexe == 'M') {
			System.out.println("Sexe : Masculin");
		}
		System.out.println("Date de naissance :" + this.date);
		System.out.println("Comentaire :"+this.commentaires);
		System.out.println("Adresse :");
		if(adresse != null) {
     	adresse.afficher();
		}

	}



	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", prenom=" + prenom + ", numeroDeTelephone=" + numeroDeTelephone + ", sexe="
				+ sexe + ", numeroDeSecuriteSociale=" + numeroDeSecuriteSociale + ", date=" + date + ", commentaires="
				+ commentaires + ", adresse=" + adresse + "]";
	}
	
	
	
}
