package BuisnessProjet;

public abstract class Salarie {
	private int id;
	private String equipe;
	private String nom;
	private String prenom;
	private double salaireB;
	private int echelle;
	private int anciennte;
	private double tauxanciennte;
	private Services s;
	private final double cnss=0.048;
	private final double cimr=0.06;
	private final double amo=0.0226;
	private double salairbrut;
	private double salairecoti;
	private double salairenet;
	
	public Salarie() {
		
	}
	public Salarie(int id, String equipe, String nom, String prenom, double salaireB, int echelle, int anciennte,
			Services s) {
		super();
		this.id = id;
		this.equipe = equipe;
		this.nom = nom;
		this.prenom = prenom;
		this.salaireB = salaireB;
		this.echelle = echelle;
		this.anciennte = anciennte;
		this.s = s;
	}
	public Salarie(int id, String equipe, String nom, String prenom, double salaireB, int echelle, int anciennte) {
		super();
		this.id = id;
		this.equipe = equipe;
		this.nom = nom;
		this.prenom = prenom;
		this.salaireB = salaireB;
		this.echelle = echelle;
		this.anciennte = anciennte;
	}
	
	
	public Salarie(int id, String equipe, String nom, String prenom, double salaireB, int echelle, int anciennte, double salairbrut, double salairecoti, double salairenet) {
		super();
		this.id = id;
		this.equipe = equipe;
		this.nom = nom;
		this.prenom = prenom;
		this.salaireB = salaireB;
		this.echelle = echelle;
		this.anciennte = anciennte;
		this.setSalairbrut(salairebrut());
		this.salairecoti = salaireCotisation();
		this.salairenet = salaireNetPayer();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
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
	public double getSalaireB() {
		return salaireB;
	}
	public void setSalaireB(double salaireB) {
		this.salaireB = salaireB;
	}
	public int getEchelle() {
		return echelle;
	}
	public void setEchelle(int echelle) {
		this.echelle = echelle;
	}
	public int getAnciennte() {
		return anciennte;
	}
	public void setAnciennte(int anciennte) {
		this.anciennte = anciennte;
	}
	public Services getS() {
		return s;
	}
	public void setS(Services s) {
		this.s = s;
	}
	public double getCnss() {
		return cnss;
	}
	public double getCimr() {
		return cimr;
	}
	public double getAmo() {
		return amo;
	}
	public double getSalairbrut() {
		return salairbrut;
	}
	public void setSalairbrut(double salairbrut) {
		this.salairbrut = salairbrut;
	}
	
	public double getTauxanciennte() {
		return tauxanciennte;
	}
	public void setTauxanciennte(double tauxanciennte) {
		this.tauxanciennte = tauxanciennte;
	}
	public double getSalairecoti() {
		return salairecoti;
	}
	public void setSalairecoti(double salairecoti) {
		this.salairecoti = salairecoti;
	}
	public double getSalairenet() {
		return salairenet;
	}
	public void setSalairenet(double salairenet) {
		this.salairenet = salairenet;
	}
	public String toString() {
		return 	"\n id : " + id + 
				"\n equipe :" + equipe + 
				"\n nom :" + nom + 
				"\n prenom :" + prenom + 
				"\n echelle :" + echelle + 
				"\n anciennte :" + anciennte + 
			      s.toString()  + 
				"\n salaire de base :"+ salaireB +"DH" + 
				"\n salaire Brut : "+ salairebrut()+"DH"+
				"\n salaire avec les cotisation : "+ salaireCotisation()+"DH"+
				"\n salaire Net a Payer : "+ salaireNetPayer()+"DH"+"\n";


				
	}
	public double primeAnci() {
		switch (anciennte) {
		case 2 : tauxanciennte = 0.05 ;break;
		case 5 : tauxanciennte = 0.1 ;break;
		case 12 : tauxanciennte = 0.15 ;break;
		case 20 : tauxanciennte = 0.20 ;break;
		case 25 : tauxanciennte = 0.25 ;break;
		default : tauxanciennte=0;


		}
		return tauxanciennte;
	}
	public double salairebrut() {
		return primeAnci()+salaireB;
	}
	public double servicesCotisation() {
		double a=0;
		if (s.isServicelogistique()!=false) {
			a=a+0.09;
		}
		else if (s.isServiceInternet()!=false) {
			a=a+0.1;

		}
		else if (s.isReductionSuperMarche()!=false) {
			a=a+0.08;
		}
		return a;
	}
	public double salaireCotisation() {
		return salairebrut()-( amo + cnss+ cimr + servicesCotisation() );
	}
	public double salaireNetPayer() {
		double s = 0;
		switch (echelle) {

		case 9 	: s = salaireCotisation()+500 ;break;
		case 10 : s = salaireCotisation()+700 ;break;
		case 11 : s = salaireCotisation()+1000 ;break;
		case 12 : s = salaireCotisation()+2500 ;break;
		case 13 : s = salaireCotisation()+3000 ;break;
		default : s=salaireCotisation();

		}
		return s;	}
	
}
