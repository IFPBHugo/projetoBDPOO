import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		DAO<Professor> dao = new DAO<Professor>();
		Professor p = new Professor();
		p.setId(22l);
		p.setNome("HugoFF");
		dao.save(p);
		Professor p2 = new Professor();
		p2.setId(23l);
		p2.setNome("Hugo");
		dao.save(p2);
		Professor find = dao.find(Professor.class, 22l);
		System.out.println(find.getNome());
	}
	
}
