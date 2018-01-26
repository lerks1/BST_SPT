package graph;

/**AdjacencyMatrix Class - Holds 2D Array of Booleans representing a Graph. Courtesy of Dionysios Athanasopoulos */
public class AdjacencyMatrix {

	private boolean[][] graph;

	/**Constructor - Creates new AdjacencyMatrix/Graph
	 * @param size - Size of Matrix*/
	public AdjacencyMatrix( int size ) {

		graph = new boolean[size][size];
	}
	
	/**Returns Graph - 2D Boolean Array*/
	public boolean[][] getGraph(){ return graph; }

	/**Adds 'connections'/edges between Nodes
	 * @param node - Node to connect
	 * @param node - Second node to connect*/
	public void addEdge( int node, int neighbor ) {

		graph[node][neighbor] = true;
		graph[neighbor][node] = true;
	}

	/**Prints visual representation of Matrix to terminal.*/
	public void print() 
	{
		for( int i = 0; i < graph.length; ++i ) 
		{
			System.out.print( i + ": " );
			
			for( int j = 0; j < graph[ 0 ].length; ++j ) 
			{
				if(graph[i][j])
				{
					System.out.print("1 ");
				}
				else 
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
