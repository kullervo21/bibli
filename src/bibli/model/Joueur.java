package bibli.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the joueur database table.
 * 
 */
@Entity
@Table(name = "joueur")
@NamedQuery(name="Joueur.findAll", query="SELECT j FROM Joueur j")
public class Joueur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_joueur")
	private int idJoueur;

	@Temporal(TemporalType.DATE)
	@Column(name="date_naissance_joueur")
	private Date dateNaissanceJoueur;

	@Temporal(TemporalType.DATE)
	@Column(name="dernier_saison")
	private Date dernierSaison;

	@Column(name="divers_joueur")
	private String diversJoueur;

	@Column(name="nom_joueur")
	private String nomJoueur;

	@Column(name="photo_joueur")
	private String photoJoueur;

	@Column(name="poste_joueur")
	private String posteJoueur;

	@Temporal(TemporalType.DATE)
	@Column(name="premiere_saison")
	private Date premiereSaison;

	@Column(name="prenom_joueur")
	private String prenomJoueur;

	public Joueur() {
	}

	public int getIdJoueur() {
		return this.idJoueur;
	}

	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}

	public Date getDateNaissanceJoueur() {
		return this.dateNaissanceJoueur;
	}

	public void setDateNaissanceJoueur(Date dateNaissanceJoueur) {
		this.dateNaissanceJoueur = dateNaissanceJoueur;
	}

	public Date getDernierSaison() {
		return this.dernierSaison;
	}

	public void setDernierSaison(Date dernierSaison) {
		this.dernierSaison = dernierSaison;
	}

	public String getDiversJoueur() {
		return this.diversJoueur;
	}

	public void setDiversJoueur(String diversJoueur) {
		this.diversJoueur = diversJoueur;
	}

	public String getNomJoueur() {
		return this.nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public String getPhotoJoueur() {
		return this.photoJoueur;
	}

	public void setPhotoJoueur(String photoJoueur) {
		this.photoJoueur = photoJoueur;
	}

	public String getPosteJoueur() {
		return this.posteJoueur;
	}

	public void setPosteJoueur(String posteJoueur) {
		this.posteJoueur = posteJoueur;
	}

	public Date getPremiereSaison() {
		return this.premiereSaison;
	}

	public void setPremiereSaison(Date premiereSaison) {
		this.premiereSaison = premiereSaison;
	}

	public String getPrenomJoueur() {
		return this.prenomJoueur;
	}

	public void setPrenomJoueur(String prenomJoueur) {
		this.prenomJoueur = prenomJoueur;
	}

}