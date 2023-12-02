package BuisnessProjetDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BuisnessProjet.Salarie;

public class SalarieDAO {
	Statement stmt;
	SqlConnection connect;
	public SalarieDAO(SqlConnection connect) {

		stmt = connect.getStmt();
		this.connect = connect;
	}
	public void ajouter (Salarie s) {

		try {
			stmt.executeUpdate("INSERT INTO `salariepro`(`id`, `equipe`, `nom`, `prenom`, `salaire`, `echelle`, `anciennete`, `salaireBrut`, `salaireCotisation`, `salaireNet`) "
					+ "VALUES ('"+s.getId()+"','"+s.getEquipe()+"','"+s.getNom()+"','"+s.getPrenom()+"'"
					+ ",ROUND ('"+s.getSalaireB()+"',2),"
					+ "'"+s.getEchelle()+"','"+s.getAnciennte()+"'   "
					+ ",ROUND ('"+s.salairebrut()+"',2)"		+ ","
					+ "ROUND ('"+s.salaireCotisation()+"',2)"+ ","
					+ "ROUND ('"+s.salaireNetPayer()+"',2))");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void modifier(Salarie s) {

		try {
			stmt.executeUpdate("UPDATE `salariepro` SET `equipe`='"+s.getEquipe()+"',`nom`='"+s.getNom()+"',"
					+ "`prenom`='"+s.getPrenom()+"',`salaire`='"+s.getSalaireB()+"',`echelle`='"+s.getEchelle()+"',`anciennete`='"+s.getAnciennte()+"' WHERE id ='"+s.getId()+"'  ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void supprimer(int id ) {

		try {
			stmt.executeUpdate("DELETE FROM `salariepro` WHERE id='"+id+"' ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void afficher(int id) {

		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM `salariepro` WHERE id='"+id+"' ");
			while(rs.next()) {

				System.out.println(rs.getInt("id")+ " " +rs.getString("equipe")+ " " + rs.getString("nom")
				+ " " +rs.getString("prenom")+ " " + rs.getDouble("salaire")+ " " + rs.getInt("echelle")
				+ " " + rs.getInt("anciennete")+ " " + rs.getDouble("salaireBrut")+ " " + rs.getDouble("salaireCotisation")+ " " + rs.getDouble("salaireNet"));


			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public void condition() {
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM `salariepro` WHERE salaireNet > 6000");
			while(rs.next()) {

				System.out.println(rs.getInt("id")+ " " +rs.getString("equipe")+ " " + rs.getString("nom")
				+ " " +rs.getString("prenom")+ " " + rs.getDouble("salaire")+ " " + rs.getInt("echelle")
				+ " " + rs.getInt("anciennete")+ " " + rs.getDouble("salaireBrut")+ " " + rs.getDouble("salaireCotisation")+ " " + rs.getDouble("salaireNet"));


			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	




}
