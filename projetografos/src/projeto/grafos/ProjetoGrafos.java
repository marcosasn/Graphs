package projeto.grafos;

import org.jgrapht.*;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.*;

public class ProjetoGrafos {
	
	private static DirectedGraph<String, DefaultEdge> grafoDirigido;
	private static CycleDetector<String, DefaultEdge> grafoCiclico;
	
	public static void main(String[] args) {
		grafoDirigido =  new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
		grafoCiclico = new CycleDetector<String, DefaultEdge>(grafoDirigido);
		
		criaGrafo();
		
        System.out.println("Grafo: " + grafoDirigido.toString() + "\n");
        System.out.println("O grafo e um ciclo? " + ehCiclico() + ".");
        
	}
	
	public static void criaGrafo() {
		String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";
        String v5 = "v5";
        String v6 = "v6";
        String v7 = "v7";
        String v8 = "v8";
        String v9 = "v9";
        String v10 = "v10";
        
        grafoDirigido.addVertex(v1);
        grafoDirigido.addVertex(v2);
        grafoDirigido.addVertex(v3);
        grafoDirigido.addVertex(v4);
        grafoDirigido.addVertex(v5);
        grafoDirigido.addVertex(v6);
        grafoDirigido.addVertex(v7);
        grafoDirigido.addVertex(v8);
        grafoDirigido.addVertex(v9);
        grafoDirigido.addVertex(v10); 
                
        grafoDirigido.addEdge(v1, v2);
        grafoDirigido.addEdge(v2, v3);
        grafoDirigido.addEdge(v3, v4);
        grafoDirigido.addEdge(v4, v5);
        grafoDirigido.addEdge(v5, v6);
        grafoDirigido.addEdge(v6, v7);
        grafoDirigido.addEdge(v7, v8);
        grafoDirigido.addEdge(v8, v9);
        grafoDirigido.addEdge(v9, v10);
        grafoDirigido.addEdge(v10, v1);
    }
	
	private static String ehCiclico() {
		if (grafoCiclico.detectCycles()) {
        	return "Sim";
        }
        return "Nao";
	}
}