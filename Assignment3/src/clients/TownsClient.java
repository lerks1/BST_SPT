package clients;

import java.util.ArrayList;
import graph.AdjacencyList;
import towns.Town;
import traversal.ShortestPath;

/**Client class used to implement the ShortestPath Class. Finds the shortest path between different towns
 * , prints the number of steps (including initial town and destination town) and prints all towns on this 'path'.
 * Note - Program assumes Unique names are entered and Methods are called using correct town names (e.g. AddEdge,
 * printShortestPath etc.)*/
public class TownsClient {

	public static void main(String[] args) {
	/*For convenience, users can copy more of the below add statements to
	 * add more/different towns.*/
	ArrayList<Town> pre = new ArrayList<Town>();
	pre.add(new Town("Happy-Town"));
	pre.add(new Town("Sad-Town"));
	pre.add(new Town("Funny-Town"));
	pre.add(new Town("Funky-Town"));
	pre.add(new Town("Happyer-Town"));
	pre.add(new Town("Fun-Town"));
	pre.add(new Town("Extra-Town"));
	pre.add(new Town("New-Town"));
	pre.add(new Town("Mega-Town"));
	pre.add(new Town("Super-Town"));
	pre.add(new Town("Red-Town"));
	pre.add(new Town("Lonely-Town"));
	
	/*Auto populates an Array containing all towns in ArrayList 'pre'
	 * to be fed into the AdjacencyList constructor.*/
	Town[] towns = new Town[pre.size()];
	for (int i = 0; i < towns.length; i++)
	{
		towns[i] = pre.get(i);
	}
	
	AdjacencyList townlist = new AdjacencyList(towns);
	
	/*Edges added here - More connections can be made - AddEdge method
	 *  is overloaded - User can enter Unique Town identifiers (String name1, String name2)
	 * or indexes (int index1, int index2) if preferred - Creates non-directional edges (both ways)*/
	townlist.AddEdge("Happy-Town", "Sad-Town");
	townlist.AddEdge("Happy-Town", "Funny-Town");
	townlist.AddEdge("Funny-Town", "Funky-Town");
	townlist.AddEdge("Funny-Town", "Happyer-Town");
	townlist.AddEdge("Funky-Town", "Fun-Town");
	townlist.AddEdge("Happyer-Town", "Fun-Town");
	townlist.AddEdge("Sad-Town", "Extra-Town");
	townlist.AddEdge("Extra-Town", "Funky-Town");
	townlist.AddEdge("Extra-Town", "New-Town");
	townlist.AddEdge("Mega-Town", "New-Town");
	townlist.AddEdge("Funny-Town", "Super-Town");
	townlist.AddEdge("Red-Town", "Sad-Town");
	townlist.AddEdge("Mega-Town", "Lonely-Town");
	
	/*Prints details of shortest path between two inputs (by Unique Town Name)
	 *Note - First parameter is origin Town, second is destination Town. */
	ShortestPath.printShortestPath("Red-Town", "Happyer-Town", townlist);
	System.out.println("-----------------");
	ShortestPath.printShortestPath("Happy-Town", "Lonely-Town", townlist);
	System.out.println("-----------------");
	ShortestPath.printShortestPath("Super-Town", "New-Town", townlist);
	
	
	/*Output of ShortestPath method returns ArrayList of all positions
	 *in Shortest path - Including start and end points. Example below*/
	//ArrayList<Integer> output = ShortestPath.getPath("Mega-Town", "Funny-Town", townlist);

	}

}
