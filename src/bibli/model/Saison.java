package bibli.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the saison database table.
 * 
 */
@Entity
@NamedQuery(name="Saison.findAll", query="SELECT s FROM Saison s")
public class Saison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="divers_saison")
	private String diversSaison;

	@Column(name="nom_saison")
	private String nomSaison;
	
	//bi-directional many-to-one association to Participer
	@OneToMany(mappedBy="saison", fetch=FetchType.EAGER)
	private List<Participer> participers = new ArrayList<Participer>();


	public Saison() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiversSaison() {
		return this.diversSaison;
	}

	public void setDiversSaison(String diversSaison) {
		this.diversSaison = diversSaison;
	}

	public String getNomSaison() {
		return this.nomSaison;
	}

	public void setNomSaison(String nomSaison) {
		this.nomSaison = nomSaison;
	}

	public List<Participer> getParticipers() {
		return participers;
	}

	public void setParticipers(List<Participer> participers) {
		this.participers = participers;
	}

	
	
}