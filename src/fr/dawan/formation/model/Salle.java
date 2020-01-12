/**
 * 
 */
package fr.dawan.formation.model;
import java.util.Date;

/**
 * @author Admin-Stagiaire
 *
 */

public class Salle {

	private long codeSalle;
	private String nom;
	private int capaciteAssise;
	private int capaciteDebout;
	private String numeroTelephone;
	private boolean occupation;
	private Date heureOuverture;
	private String adresse;
	
	
	public Salle(long codeSalle, String nom, int capaciteAssise, int capaciteDebout, String numeroTelephone,
			boolean occupation, Date heureOuverture, String adresse) {
		super();
		this.codeSalle = codeSalle;
		this.nom = nom;
		this.capaciteAssise = capaciteAssise;
		this.capaciteDebout = capaciteDebout;
		this.numeroTelephone = numeroTelephone;
		this.occupation = occupation;
		this.heureOuverture = heureOuverture;
		this.adresse = adresse;
	}
	/**
	 * @return the codeSalle
	 */
	public long getCodeSalle() {
		return codeSalle;
	}
	/**
	 * @param codeSalle the codeSalle to set
	 */
	public void setCodeSalle(long codeSalle) {
		this.codeSalle = codeSalle;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the capaciteAssise
	 */
	public int getCapaciteAssise() {
		return capaciteAssise;
	}
	/**
	 * @param capaciteAssise the capaciteAssise to set
	 */
	public void setCapaciteAssise(int capaciteAssise) {
		this.capaciteAssise = capaciteAssise;
	}
	/**
	 * @return the capaciteDebout
	 */
	public int getCapaciteDebout() {
		return capaciteDebout;
	}
	/**
	 * @param capaciteDebout the capaciteDebout to set
	 */
	public void setCapaciteDebout(int capaciteDebout) {
		this.capaciteDebout = capaciteDebout;
	}
	/**
	 * @return the numeroTelephone
	 */
	public String getNumeroTelephone() {
		return numeroTelephone;
	}
	/**
	 * @param numeroTelephone the numeroTelephone to set
	 */
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	/**
	 * @return the occupation
	 */
	public boolean isOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(boolean occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the heureOuverture
	 */
	public Date getHeureOuverture() {
		return heureOuverture;
	}
	/**
	 * @param heureOuverture the heureOuverture to set
	 */
	public void setHeureOuverture(Date heureOuverture) {
		this.heureOuverture = heureOuverture;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Salle [nom=" + nom + ", capaciteAssise=" + capaciteAssise + ", capaciteDebout=" + capaciteDebout
				+ ", numeroTelephone=" + numeroTelephone + ", occupation=" + occupation + ", heureOuverture="
				+ heureOuverture + ", adresse=" + adresse + "]";
	}
	 
	
}
