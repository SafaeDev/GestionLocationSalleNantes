/**
 * 
 */
package fr.dawan.formation.model;

/**
 * @author Admin-Stagiaire
 *
 */
public class User {

	private String numUser ;
	private String nomUser;
	private String prenomUser;
	private  String numeroTelephone;
	private String adresse;
	/**
	 * @param numUser
	 * @param nomUser
	 * @param prenomUser
	 * @param numeroTelephone
	 * @param adresse
	 */
	public User(String numUser, String nomUser, String prenomUser, String numeroTelephone, String adresse) {
		super();
		this.numUser = numUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.numeroTelephone = numeroTelephone;
		this.adresse = adresse;
	}
	/**
	 * @return the numUser
	 */
	public String getNumUser() {
		return numUser;
	}
	/**
	 * @param numUser the numUser to set
	 */
	public void setNumUser(String numUser) {
		this.numUser = numUser;
	}
	/**
	 * @return the nomUser
	 */
	public String getNomUser() {
		return nomUser;
	}
	/**
	 * @param nomUser the nomUser to set
	 */
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	/**
	 * @return the prenomUser
	 */
	public String getPrenomUser() {
		return prenomUser;
	}
	/**
	 * @param prenomUser the prenomUser to set
	 */
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
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
		return "User [nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", numeroTelephone=" + numeroTelephone
				+ ", adresse=" + adresse + "]";
	}
	
	
	
}
