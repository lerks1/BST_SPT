package traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import graph.AdjacencyList;
import towns.Town;

/**Class for the purpose of finding Shortest paths between Towns in a Graph data structure - Utilises a BFS search pattern, 
 * marking the 'last' field of town objects with the index of the node that was visited at the time of the relevant Towns index
 * insertion into the Queue. Specifically designed for Town objects.*/
public class ShortestPath {
	
	/**Returns ArrayList containing the Indexes of Towns that make up the shortest distance between
	 * two input determined Towns (parameters).
	 * @param in1 - Name (String) of Town of origin
	 * @param in2 - Name (String) of destination Town
	 * @param in - AdjacencyList/Graph of towns to Traverse*/
	/*Complexity - O(2V + E)*/
	public static ArrayList<Integer> getPath(String in1, String in2, AdjacencyList in) { 
		Town[] towns = in.getTowns(); 
		int from = in.getIndex(in1), to = in.getIndex(in2);
		ArrayList<Integer> alreadyVisited = new ArrayList<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(from);
		
		while(!queue.isEmpty()) {

			Integer visit = queue.remove();
			alreadyVisited.add(visit);
			LinkedList<Integer> connections = towns[visit].getConnections();
			
			for (Integer t : connections)
			{
				/*Sets 'last' field of the node being added to the queue to the currently visited node (index 'visit').
				 *At the end of the method, traversing each 'last' field in a LinkedList-esque fashion
				 *will determine the shortest direct path from Origin to Destination in reverse.
				 * */
				if(!alreadyVisited.contains(t) && !queue.contains(t))
				{
				towns[t].setLast(visit); //Critical that this is only done when a Town/index is added to the Queue.
				queue.add(t);
				}
			}
			if (visit == to) //Stops traversal if destination Town is found.
			{
				break;
			}
		}
		ArrayList<Integer> path = new ArrayList<Integer>();
		Town look = towns[to];
		while (!look.equals(in.getTowns()[from]))
		{
			path.add(0, in.getIndex(look)); //As path is initially followed in reverse, adds each item to ArrayList at index 0 to order path correctly from 0 to n - 1.
			look = towns[look.getLast()];
		}
		path.add(0, in.getIndex(look)); 
		return path;
	}
	
	/**Implements the getPath method - Prints details of path including size (including
	 * origin and destination) and names of each Town the path passes through
	 * @param in1 - Name (String) of Town of origin
	 * @param in2 - Name (String) of destination Town
	 * @param in - AdjacencyList/Graph of towns to Traverse */
	public static void printShortestPath(String start, String end, AdjacencyList graph)
	{
		ArrayList<Integer> output = ShortestPath.getPath(start, end, graph);
		
		System.out.println("Shortest Distance Between " + start + " and " + end + " is " + output.size() + " (including origin and destination town)");
		System.out.println("Path (in order): ");
		
		for (Integer t : output)
		{
			System.out.println(graph.getTowns()[t].getName());
		}
	}
	

}
