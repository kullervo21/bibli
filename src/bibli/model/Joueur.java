package bibli.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the joueur database table.
 * 
 */
@Entity
@NamedQuery(name="Joueur.findAll", query="SELECT j FROM Joueur j")
public class Joueur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

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

	//bi-directional many-to-one association to Participer
	@OneToMany(mappedBy="joueur", fetch=FetchType.EAGER)
	private List<Participer> participers = new ArrayList<Participer>();

	public Joueur() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Participer> getParticipers() {
		return this.participers;
	}

	public void setParticipers(List<Participer> participers) {
		this.participers = participers;
	}

	public Participer addParticiper(Participer participer) {
		getParticipers().add(participer);
		participer.setJoueur(this);

		return participer;
	}

	public Participer removeParticiper(Participer participer) {
		getParticipers().remove(participer);
		participer.setJoueur(null);

		return participer;
	}

	@Override
	public String toString() {
		return "Joueur [id=" + id + ", dateNaissanceJoueur=" + dateNaissanceJoueur + ", dernierSaison=" + dernierSaison
				+ ", diversJoueur=" + diversJoueur + ", nomJoueur=" + nomJoueur + ", photoJoueur=" + photoJoueur
				+ ", posteJoueur=" + posteJoueur + ", premiereSaison=" + premiereSaison + ", prenomJoueur="
				+ prenomJoueur + ", participers=" + participers + "]";
	}

	
	
}