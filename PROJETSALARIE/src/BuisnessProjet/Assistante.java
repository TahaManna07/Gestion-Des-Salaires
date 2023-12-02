package BuisnessProjet;

public class Assistante extends Salarie {

	public Assistante(int id, String equipe, String nom, String prenom, double salaireB, int echelle, int anciennte,
			double salairbrut, double salairecoti, double salairenet) {
		super(id, equipe, nom, prenom, salaireB, echelle, anciennte, salairbrut, salairecoti, salairenet);
		// TODO Auto-generated constructor stub
	}

	public Assistante(int id, String equipe, String nom, String prenom, double salaireB, int echelle, int anciennte,
			Services s) {
		super(id, equipe, nom, prenom, salaireB, echelle, anciennte, s);
		// TODO Auto-generated constructor stub
	}

	public Assistante(int id, String equipe, String nom, String prenom, double salaireB, int echelle, int anciennte) {
		super(id, equipe, nom, prenom, salaireB, echelle, anciennte);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<< Assistante  >>  "+super.toString();
	}

}
