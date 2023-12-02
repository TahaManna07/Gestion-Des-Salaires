package PresentationProjet;

import BuisnessProjet.Adjoint;
import BuisnessProjet.CadreRh;
import BuisnessProjet.ChefDeProjet;
import BuisnessProjet.Consultant;
import BuisnessProjet.IngenieurAffaires;
import BuisnessProjet.Salarie;
import BuisnessProjet.Services;
import BuisnessProjetDAO.SalarieDAO;
import BuisnessProjetDAO.SqlConnection;

public class MaClassePrincipale {
	
	public static void main(String[] args) {
		
		SqlConnection connect = new SqlConnection();
		
		SalarieDAO salaried = new SalarieDAO(connect);
		
		Services s1 = new Services(true, true, true);
		Services s2 = new Services(false, true, false);
		Services s3 = new Services(true, false, false);

		// Test de polymorphisme 
		Salarie salarie1 = new Adjoint(1,"Adjoint", "Taha", "Manna", 7500, 13, 12, s1);
		Salarie salarie2 = new ChefDeProjet(2, "Chef de projet", "Souhail ", "Manna", 8400, 12, 20, s2);
		Salarie salarie3 = new IngenieurAffaires(3, "Ingénieur ", "Sherlock", "Holmes", 7400, 14, 2, s3);
		Salarie salarie4 = new Consultant(4, "Consultant ", "Bill", "Gates", 000, 13, 2, s3);
		Salarie salarie5 = new CadreRh(1, "Cadre Rh", "Codo", "shelby", 6800, 13, 25, s1);

		
		salaried.afficher(1);
		salaried.afficher(2);
		salaried.afficher(3);
		salaried.afficher(4);
		
		System.out.println(salarie5);

		
		salaried.ajouter(salarie5);
		// afficher les salaries ayant le salarie Net à payer >
		
		//salaried.condition();
		//salaried.modifier(salarie4);
		//salaried.supprimer(1);
		
		
		
		
		
		
		

	}

}
