package test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import graph.AdjacencyMatrix;
import traversal.DFS;
/**Parameterized test class for the traverse method in the DFS Class. Includes 3 tests (two for different Graphs and one for 
 * a different starting Node)*/
@RunWith(value = Parameterized.class)
public class DFSTester {
	
	@Parameter(value = 0)
	public int st;

	@Parameter(value = 1)
	public AdjacencyMatrix m;

	@Parameter(value = 2)
	public int[] result;
	
	@Parameters
	public static Collection<Object[]> data(){
		
		AdjacencyMatrix first = new AdjacencyMatrix(6);
		AdjacencyMatrix second = new AdjacencyMatrix(10);
		
		first.addEdge(0, 1);
		first.addEdge(0, 2);
		first.addEdge(2, 3);
		first.addEdge(2, 4);
		first.addEdge(3, 5);
		first.addEdge(4, 5);
		
		second.addEdge(0, 1);
		second.addEdge(1, 6);
		second.addEdge(1, 7);
		second.addEdge(6, 8);
		second.addEdge(7, 8);
		second.addEdge(8, 9);
		second.addEdge(0, 2);
		second.addEdge(2, 3);
		second.addEdge(2, 4);
		second.addEdge(3, 5);
		second.addEdge(4, 5);

		Object[][] data = new Object[][]{{0, first, new int[]{0, 1, 2, 3, 5, 4}}, {0, second, new int[]{0, 1, 6, 8, 9, 7, 2, 3, 5, 4}},
			{1, first, new int[]{1, 0, 2, 3, 5, 4}}};

		return Arrays.asList(data);
	}
	
	@Test
	public void DFSTest() {
		Assert.assertArrayEquals(DFS.traverse(st, m), result);
	}
	
}
