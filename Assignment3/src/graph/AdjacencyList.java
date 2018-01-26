package graph;

import java.util.HashMap;

import towns.Town;

/**AdjacencyList Class - Holds an Array of Town Objects, each containing LinkedLists of Integers
 * representing edges. These elements combined represent a Graph. Designed to use Town objects.*/
public class AdjacencyList {

	private Town[] towns;
	private HashMap<Town, Integer> indexes = new HashMap<Town, Integer>();
	private HashMap<String, Integer> indexesStrings = new HashMap<String, Integer>();
	
	/**Constructor - Create AdjacencyList Objects
	 * @param towns - Array of Town objects that make up the contents of the Graph*/
	public AdjacencyList(Town[] towns)
	{
		this.towns = towns;
		for (int i = 0; i < towns.length; i++)
		{
			indexes.put(towns[i], (Integer) i);
			indexesStrings.put(towns[i].getName(), (Integer) i);
		}
	}
	
	/**Adds edges to the Graph items - Each representing connections between nodes.
	 * This method makes the Graph undirected - Could make directed by removing second line. 
	 * @param one - name of town to create connection from/to
	 * @param two - name of second town to create connection from/to*/
	public void AddEdge(String one, String two)
	{
		towns[getIndex(one)].addConnection(getIndex(two));
		towns[getIndex(two)].addConnection(getIndex(one));
	}
	
	/**Adds edges to the Graph items - Each representing connections between nodes.
	 * This method makes the Graph undirected - Could make directed by removing second line. 
	 * Takes in indexes as parameters.
	 * @param one - index of town to create connection from/to
	 * @param two - index of second town to create connection from/to*/
	public void AddEdge(int one, int two)
	{
		towns[one].addConnection(two);
		towns[two].addConnection(one);
	}
	
	/**Returns length of Array 'towns' represents the number of Vertices in the Graph*/
	public int getLength()
	{
		return towns.length;
	}
	
	/**Returns Array containing each Vertex/node of Graph - Town objects in
	 * order of index*/
	public Town[] getTowns()
	{
		return towns;
	}
	
	/**Returns index of Node/Vertex, identified by name (String)
	 * @param s - Name of town to find index of.*/
	public Integer getIndex (String s)
	{
		return indexesStrings.get(s);
	}
	
	/**Returns index of Node/Vertex, identified by Object (Town)
	 * @param t - Town object to find index of*/
	public int getIndex(Town t)
	{
		return indexes.get(t);
	}
}
