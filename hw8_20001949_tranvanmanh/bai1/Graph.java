package hw8_20001949_tranvanmanh.bai1;

import java.util.*;

public class Graph implements GraphInterface {
	private int v;
	private int[][] adj;
	
	public Graph(int v) {
		this.v = v;
		this.adj = new int[v][v];
		for(int i = 0; i<v ; i++) 
			for (int j = 0; j<v ; j++) 
				adj[i][j] = 0;
		
	}
	@Override
	public int numVertices() {
		
		return v;
	}
	@Override
	public int numEdge() {
		int numb = 0;
		for(int i = 0; i<v ; i++) {
			for (int j = 0; j<v ; j++) {
				if (adj[i][j] == 1) 
					numb++;
			}
		}
		return numb;
	}
	@Override
	public boolean isEdge(int u, int v) {
		
		return adj[v][u] == 1;
	}
	@Override
	public void addEdge(int u, int v) {
		adj[u][v] = 1;
		adj[v][u] = 1;
	}
	@Override
	public int degreeGraph() {
		int degree = 0;
		for(int i = 0; i<v ; i++) {
			int temp = 0;
			for (int j = 0; j<v ; j++) {
				if (adj[i][j] == 1) temp++;
			}
			if (temp > degree) degree = temp;
		}
		return degree;
	}
	@Override
	public List<Integer> adjVertices(int u) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<v; i++) {
			if(adj[u][i] == 1)
				list.add(i);
		}
		return list;
	}
	@Override
	public List<Integer> BFS(int u) {
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		boolean[] visited = new boolean[v];
		queue.add(u);
		result.add(u);
		visited[u] = true;
		while(!queue.isEmpty()) {
			int currentVertice = queue.poll();
			List<Integer> adjVertices = adjVertices(currentVertice);
			for(int vertice : adjVertices) {
				if(!visited[vertice]) {
					visited[vertice] = true;
					queue.add(vertice);
					result.add(vertice);
				}
			}
		}
		return result;
	}
	
	
	public void DFSHelp(int u, boolean visited[]) {
        visited[u] = true;
        List<Integer> i = adjVertices(u);
        System.out.print(u + " ");
        for(int e : i) {
            if (!visited[e])
                DFSHelp(e, visited);
        }
    }

	@Override
    public void DFS(int u) {
        boolean visited[] = new boolean[v];
        DFSHelp(u, visited);
    }
}
