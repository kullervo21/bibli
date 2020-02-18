package bibli.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the participer database table.
 * 
 */
@Entity
@NamedQuery(name="Participer.findAll", query="SELECT p FROM Participer p")
public class Participer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParticiperPK id;

	@Column(name="nb_but")
	private int nbBut;

	@Column(name="nb_match")
	private int nbMatch;

	@Column(name="nb_passe_dec")
	private int nbPasseDec;

	//bi-directional many-to-one association to Joueur
	@ManyToOne
	@JoinColumn(name="id_joueur", insertable=false, updatable=false)
	private Joueur joueur;

	//bi-directional many-to-one association to Saison
	@ManyToOne
	@JoinColumn(name="id_saison", insertable=false, updatable=false)
	private Saison saison;
	
	
	public Participer() {
	}

	public ParticiperPK getId() {
		return this.id;
	}

	public void setId(ParticiperPK id) {
		this.id = id;
	}

	public int getNbBut() {
		return this.nbBut;
	}

	public void setNbBut(int nbBut) {
		this.nbBut = nbBut;
	}

	public int getNbMatch() {
		return this.nbMatch;
	}

	public void setNbMatch(int nbMatch) {
		this.nbMatch = nbMatch;
	}

	public int getNbPasseDec() {
		return this.nbPasseDec;
	}

	public void setNbPasseDec(int nbPasseDec) {
		this.nbPasseDec = nbPasseDec;
	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Saison getSaison() {
		return saison;
	}

	public void setSaison(Saison saison) {
		this.saison = saison;
	}

	

	
	
}