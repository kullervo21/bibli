package bibli.services;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import bibli.accessDB.AccessDB;
import bibli.model.Joueur;

@Named /*("joueurService")*/ 
@SessionScoped
public class JoueurService implements Serializable {


	private static final long serialVersionUID = 1L;

	@Inject
	FacesContext context;
	@Inject
	AccessDB adb;
	List<Joueur> jList;
	
	@PostConstruct
	public void init() {jList = adb.getJoueurCollect();}

	public List<Joueur> getjList() {
		return jList;
	}

	public void setjList(List<Joueur> jList) {
		this.jList = jList;
	}
	
	
	
}
