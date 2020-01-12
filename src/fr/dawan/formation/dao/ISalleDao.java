/**
 * 
 */
package fr.dawan.formation.dao;

import java.util.List;

import fr.dawan.formation.model.Salle;

/**
 * @author mihandsafae
 *
 */
public interface ISalleDao {
	
	public void saveSalle(Salle salle);
	public Salle getSallByCode(long codeSalle);
	public Salle getSalleByNom (String nom);
	public int getSalleCount();
	public List<Salle> getAllSalles();

}
