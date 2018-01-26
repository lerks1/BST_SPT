package towns;

import java.util.LinkedList;

/**Class to Represent Towns - Each town has a name, list of connections, and a 'last' Integer (utilized in a shortest path search).*/
public class Town {
	
	private LinkedList<Integer> connections = new LinkedList<Integer>();
	private String name;
	private Integer last;
	
	/**Constructor - Creates Town objects
	 * @param name - Name of Town to create*/
	public Town (String name)
	{
		this.name = name;
	}
	
	/**Returns name of Town*/
	public String getName()
	{
		return this.name;
	}
	
	/**Adds connection/Edge to a town
	 * @param con - Index of the Town to for an Edge with*/
	public void addConnection(Integer con)
	{
		if (!connections.contains(con))
		{
			connections.add(con);
		}
	}
	
	/**Returns a LinkedList containing all of the connections of the Town object.
	 * (in order of insertion)*/
	public LinkedList<Integer> getConnections()
	{
		return connections;
	}
	
	/**Sets the value of 'last' to a particular Integer
	 * @param t - Integer to set as last*/
	public void setLast(Integer t)
	{
		last = t;
	}
	
	/**Returns value of Integer 'last'*/
	public Integer getLast()
	{
		return last;
	}

}
