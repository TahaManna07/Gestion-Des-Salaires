package BuisnessProjet;

public class Services {
	
	private boolean servicelogistique;
	private boolean reductionSuperMarche;
	private boolean serviceInternet;
	public Services(boolean servicelogistique, boolean reductionSuperMarche, boolean serviceInternet) {
		this.servicelogistique = servicelogistique;
		this.reductionSuperMarche = reductionSuperMarche;
		this.serviceInternet = serviceInternet;
	}
	public boolean isServicelogistique() {
		return servicelogistique;
	}
	public void setServicelogistique(boolean servicelogistique) {
		this.servicelogistique = servicelogistique;
	}
	public boolean isReductionSuperMarche() {
		return reductionSuperMarche;
	}
	public void setReductionSuperMarche(boolean reductionSuperMarche) {
		this.reductionSuperMarche = reductionSuperMarche;
	}
	public boolean isServiceInternet() {
		return serviceInternet;
	}
	public void setServiceInternet(boolean serviceInternet) {
		this.serviceInternet = serviceInternet;
	}
	
	public String toString() {
		return "\n Les Services : \n\n servicelogistique : " + (servicelogistique ?"Oui":"Non")
				+ "\n reductionSuperMarche : " + (reductionSuperMarche ?"Oui":"Non")
				+ "\n serviceInternet : "  + (serviceInternet ?"Oui":"Non")+"\n" ;
	}
	
	

	
	
	
	

	

}
