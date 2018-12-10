
public interface AcademicoIF {

	public Aluno cadastrarALuno(String matricula, String cpf, String nome) throws CPFInvalidoException;
	
}
