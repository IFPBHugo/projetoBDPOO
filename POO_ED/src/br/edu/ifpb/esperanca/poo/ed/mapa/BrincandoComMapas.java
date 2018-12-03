package br.edu.ifpb.esperanca.poo.ed.mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BrincandoComMapas {

	public static void main(String[] args) {
//		Map mapa = new TreeMap();
//		mapa.put("000.000.000-11", "primeiro");
//		mapa.put("111.111.111-12", "segundo");
//		mapa.put("111.111.111-11", "segundo");
//	
//		Set conjuntoDeChaves = mapa.keySet();
//		
//		for (Object chave : conjuntoDeChaves) {
//			Object valor = mapa.get(chave);
//			System.out.println(valor);
//		}
		
		Aluno a = new Aluno();
		HashMap<String, Disciplina> disciplinas = new HashMap();
		a.setDisciplinas(disciplinas);
		disciplinas.put("BD", new Disciplina("Banco de Dados"));
		disciplinas.put("POO", new Disciplina("Programação Orientada a Objetos"));
		disciplinas.put("ED", new Disciplina("Estrutura de Dados"));
		
		Disciplina disciplina = a.getDisciplinas().get("BD");
	}
	
}
