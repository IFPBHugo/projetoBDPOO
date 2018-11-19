import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academico");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Professor p = new Professor();
		p.setId(1l);
		p.setNome("Hugo");
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}
