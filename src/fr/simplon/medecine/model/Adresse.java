package fr.simplon.medecine.model;

public class Adresse {

	private String complimentAdresse;
	private int numeroDeLaVoie;
	private String ComplimentDeVoie;
	private String nomDeLaRue;
	private int codePostal;
	private String nomCommune;

	public Adresse(String complimentAdresse, int numeroDeLaVoie, String complimentDeVoie, String nomDeLaRue,
			int codePostal, String nomCommune) {
		super();
		this.complimentAdresse = complimentAdresse;
		this.numeroDeLaVoie = numeroDeLaVoie;
		ComplimentDeVoie = complimentDeVoie;
		this.nomDeLaRue = nomDeLaRue;
		this.codePostal = codePostal;
		this.nomCommune = nomCommune;
	}
  
	public Adresse(int numeroDeLaVoie, String complimentDeVoie, String nomDeLaRue, int codePostal, String nomCommune) {
		
		this.numeroDeLaVoie = numeroDeLaVoie;
		ComplimentDeVoie = complimentDeVoie;
		this.nomDeLaRue = nomDeLaRue;
		this.codePostal = codePostal;
		this.nomCommune = nomCommune;
	}

	public Adresse() {

	}

	public String getComplimentAdresse() {
		return complimentAdresse;
	}

	public void setComplimentAdresse(String complimentAdresse) {
		this.complimentAdresse = complimentAdresse;
	}

	public int getNumeroDeLaVoie() {
		return numeroDeLaVoie;
	}

	public void setNumeroDeLaVoie(int numeroDeLaVoie) {
		this.numeroDeLaVoie = numeroDeLaVoie;
	}

	public String getComplimentDeVoie() {
		return ComplimentDeVoie;
	}

	public void setComplimentDeVoie(String complimentDeVoie) {
		ComplimentDeVoie = complimentDeVoie;
	}

	public String getNomDeLaRue() {
		return nomDeLaRue;
	}

	public void setNomDeLaRue(String nomDeLaRue) {
		this.nomDeLaRue = nomDeLaRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public void afficher() {
       if(this.complimentAdresse==null && this.ComplimentDeVoie==null) {
    		System.out.println(this.numeroDeLaVoie+" "+this.nomDeLaRue);
    		//System.out.println(this.codePostal+" "+this.nomCommune);
       }else {
		System.out.println(this.complimentAdresse);
		System.out.println(this.numeroDeLaVoie+this.ComplimentDeVoie+" "+this.nomDeLaRue);

       } 
      
		System.out.println(this.codePostal+" "+this.nomCommune);
		

	}

}
