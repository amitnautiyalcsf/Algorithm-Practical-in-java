import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class Main
{
	public static void main(String[] args)
	{
	Topological topo= new Topological();
	List<Vertex>graph=new LinkedList<>();
	graph.add(new Vertex("0"));
	graph.add(new Vertex("1"));
	graph.add(new Vertex("2"));
	graph.add(new Vertex("3"));
	graph.add(new Vertex("4"));
	graph.add(new Vertex("5"));
	
	graph.get(2).addNeighbour(graph.get(3));
		graph.get(3).addNeighbour(graph.get(1));
		graph.get(4).addNeighbour(graph.get(0));
			graph.get(4).addNeighbour(graph.get(1));
			graph.get(5).addNeighbour(graph.get(0));
			graph.get(5).addNeighbour(graph.get(2));
		for(int i=0; i<graph.size();++i)
		{
		    if(!graph.get(i).isVisited())
		    topo.dfs(graph.get(i));
		}
		Stack<Vertex> stack= topo.getStack();
		for(int i=0;i<graph.size();++i)
		{
		    Vertex vertex= stack.pop();
		    System.out.println(vertex+"--> ");
		}
}
}
