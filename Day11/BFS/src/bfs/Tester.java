package bfs;

public class Tester {
	public static void main(String[] args) {
		Graph g= new AdjListGraph(4,true);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		
		System.out.println("BFS-");
		g.printBFS(0);
		
		
	}
	
}
