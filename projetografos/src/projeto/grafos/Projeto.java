package projeto.grafos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.DefaultEdge;

public class Projeto {
	
	private static DirectedGraph<String, DefaultEdge> grafoDirigido;
	private static CycleDetector<String, DefaultEdge> grafoCiclico;
	private static int numeroVertices;
	private static List<String> vertices;
	private static List<String> arestas;
	
	public static void main(String[] args) {
		System.out.println("Seja bem vindo!");
		System.out.println("Qual o numero de vertices?");
		numeroVertices = leInteiro();
		
		vertices = new ArrayList<String>();
		for (int i = 0; i < numeroVertices; i ++) {
			vertices.add(leString());
		}
		
		
		
		
	}

	private static int leInteiro() {
		Scanner entrada = new Scanner(System.in);
		while(!(entrada.hasNextInt())) {
			entrada.next();
		}
		return entrada.nextInt();
	}
	
	private static String leString() {
		Scanner entrada = new Scanner(System.in);
		while(!(entrada.hasNextLine())) {
			entrada.next();
		}
		return entrada.nextLine();
	}
	

}
