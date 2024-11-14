package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjListGraph implements Graph{
	
class EdgeInfo{
	int adjVertex;
	int weight;
	public EdgeInfo(int v, int w) {
		adjVertex=v;
		weight=w;
	}
}
	List<List<EdgeInfo>> adjList;
	int vertexCount;
	boolean isDirected;
	
	public AdjListGraph(int n,boolean isDirected) {
		this.isDirected=isDirected;
		vertexCount=n;
		adjList=new ArrayList<>(vertexCount);
		for(int i=0;i<vertexCount;i++) {
			adjList.add(new ArrayList<>());
		}
	}
	
	

	@Override
	public void printBFS(int startVertex) {
		boolean[] isVisited=new boolean[vertexCount];
		for(int i=0;i<vertexCount;i++) {
			isVisited[i]=false;
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.add(startVertex);
		while(!q.isEmpty()) {
			int vi=q.remove();
			if(isVisited[vi] ){
				continue;
			}
			isVisited[vi]=true;
			System.out.println(vi+" ");
			
			for (EdgeInfo edge : adjList.get(vi)) {
                int adjVertex = edge.adjVertex;
                if (!isVisited[adjVertex]) {
                    q.add(adjVertex);
                }
            }
		}
		System.out.println(" ");
	}




	@Override
	public void addEdge(int u, int v, int w) {
		adjList.get(u).add(new EdgeInfo(v,w));
		if(!isDirected) {
			adjList.get(v).add(new EdgeInfo(u,w));
		}
		
	}




	@Override
	public void addEdge(int u, int v) {
		addEdge( u, v,1);
		
	}

	

}
