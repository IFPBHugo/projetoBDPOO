
public class Academico implements AcademicoIF {

	@Override
	public Aluno cadastrarALuno(String matricula, String cpf, String nome) throws CPFInvalidoException {
		Aluno aluno4 = new Aluno();
		if(cpf == null || cpf.isEmpty()) {
			throw new CPFInvalidoException();
		}
		return null;
	}

}
