package bibli.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the participer database table.
 * 
 */
@Embeddable
public class ParticiperPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_joueur", insertable=false, updatable=false)
	private int idJoueur;

	@Column(name="id_saison", insertable=false, updatable=false)
	private String idSaison;

	public ParticiperPK() {
	}
	public int getIdJoueur() {
		return this.idJoueur;
	}
	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}
	public String getIdSaison() {
		return this.idSaison;
	}
	public void setIdSaison(String idSaison) {
		this.idSaison = idSaison;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParticiperPK)) {
			return false;
		}
		ParticiperPK castOther = (ParticiperPK)other;
		return 
			(this.idJoueur == castOther.idJoueur)
			&& this.idSaison.equals(castOther.idSaison);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idJoueur;
		hash = hash * prime + this.idSaison.hashCode();
		
		return hash;
	}
}