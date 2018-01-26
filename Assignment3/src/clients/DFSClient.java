package clients;

import graph.AdjacencyMatrix;
import traversal.DFS;
/**Client Class pre-configured to demonstrate a DFS traversal of a basic AdjacencyMatrix.
 * Test class for underlying method (traverse - called through printTraversal) is available
 * in package 'test'*/
public class DFSClient {

	public static void main(String[] args) {

		AdjacencyMatrix matrix = new AdjacencyMatrix( 6 );
		matrix.addEdge(0, 1);
		matrix.addEdge(0, 2);
		matrix.addEdge(2, 3);
		matrix.addEdge(2, 4);
		matrix.addEdge(3, 5);
		matrix.addEdge(4, 5);
		
		DFS.printTraversal(0, matrix);
	}
}
