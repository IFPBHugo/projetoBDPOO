import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tabela_turma")
public class Turma {

	@Id
	@Column(name="id_turma")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_professor")
	private Professor professor;
	private Disciplina disciplina;
	private Set<Aluno> alunos;
}
