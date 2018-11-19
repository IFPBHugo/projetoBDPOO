import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tabela_turma")
public class Turma {

	@Id
	@Column(name = "id_turma")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_professor")
	private Professor professor;
	
	@ManyToOne
	@JoinColumn(name="id_dis")
	private Disciplina disciplina;

	@ManyToMany
	@JoinTable(
			name = "turma_aluno", 
			joinColumns = @JoinColumn(name = "turma_id"), 
			inverseJoinColumns = @JoinColumn(name = "aluno_id"))
	private Set<Aluno> alunos;
	
	
	
	
	
	
}
