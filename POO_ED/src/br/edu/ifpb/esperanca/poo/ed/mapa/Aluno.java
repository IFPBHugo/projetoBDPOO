package br.edu.ifpb.esperanca.poo.ed.mapa;

import java.util.ArrayList;
import java.util.HashMap;

public class Aluno {

	private HashMap<String, Disciplina> disciplinas;
	
	
	public HashMap<String, Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(HashMap<String, Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
