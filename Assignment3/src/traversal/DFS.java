package traversal;
import java.util.Stack;
import graph.AdjacencyMatrix;
/**Class used to traverse items represented by an Adjacency Matrix in a Depth First manner.*/
public class DFS {
	/**Traverses Adjacency Matrix items beginning at a specified Source Node, returns an 
	 * Array of int representing each Node in order of the DFS read.
	 * @param sourceNode - Node from which to begin search
	 * @param matrix - Matrix to traverse*/
	public static int[] traverse(int sourceNode, AdjacencyMatrix matrix) {
		
		int count = 0;
		boolean[][] graph = matrix.getGraph();
		boolean[] alreadyVisited = new boolean[ graph.length ];
		int[] output = new int[graph.length];

		Stack<Integer> stack = new Stack<Integer>();

		stack.add(sourceNode);

		while(!stack.isEmpty()) 
		{
			int visitedNode = stack.pop();
			alreadyVisited[visitedNode] = true;

			for(int j = graph[visitedNode].length - 1; j > -1; j--) 
			{
				if(graph[visitedNode][j] && ! alreadyVisited[j] && !stack.contains(j)) stack.add(j);
			}
			output[count] = visitedNode;
			count++;
		}
		return output;
	}
	
	/**Prints results of a traversal via the traverse method. Includes arrows between each item.
	 * One line per traversal.
	 * @param sourceNode - Node from which to begin search
	 * @param matrix - Matrix to traverse*/
	public static void printTraversal(int sourceNode, AdjacencyMatrix matrix)
	{
		int[] DFSout = traverse(sourceNode, matrix);
		System.out.println("Traversal in Order: ");
		for (int i = 0; i < DFSout.length; i++)
		{
			System.out.println(DFSout[i]);
		}
	}

}
