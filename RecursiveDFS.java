import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class DFS
{
  private Stack < Vertex > stack;
  public DFS ()
  {
    this.stack = new Stack <> ();
  }

  public void dfs (List < Vertex > vertexList)
  {
  for (Vertex v:vertexList)	// if we have multiple Culsters of vertex and we want to visit every vertex.
      {
	if (!v.isVisited ())
	  {
	    v.setVisited (true);
	    dfsRecursive (v);

	  }

      }

  }
  
  private void dfsRecursive(Vertex v)
  {
      System.out.println(v+ " " );
      for(Vertex vertex: v.getNeighbourList())
      {
          
          if(!vertex.isVisited())
          {
              vertex.setVisited(true);
              dfsRecursive(vertex);
              
          }
      }
      
  }
  }
