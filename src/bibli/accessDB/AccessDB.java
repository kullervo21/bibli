package bibli.accessDB;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import bibli.model.Joueur;

@SessionScoped
public class AccessDB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager em;
	
	
	public List<Joueur> getJoueurCollect() {
		return em.createQuery("SELECT j from Joueur j").getResultList();
	}
	
	//public Collection<Joueur> getJoueurByNom(String nom){
	//	Query q = em.createQuery("SELECT j FROM Joueur j WHERE j.nom = ?1");
	//	q.setParameter(1, nom);
		
	//	return q.getResultList();
	//}
	
	public AccessDB() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibli");
		em = emf.createEntityManager();
	}
	
	public EntityManager getEm() {return em;}
	
	public void setEm(EntityManager em) {this.em = em;}
	
}
