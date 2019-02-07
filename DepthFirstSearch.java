import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class DFS
{
    private Stack<Vertex>stack;
    public DFS()
    {
        this.stack=new Stack<>();
    }
    
    public void dfs(List<Vertex> vertexList)
    {
        for(Vertex v: vertexList)// if we have multiple Culsters of vertex and we want to visit every vertex.
        {
            if(!v.isVisited())
            {
                v.setVisited(true);
                dfsWithStack(v);
                
            }
            
        }
        
    }
    
    public void dfsWithStack(Vertex rootVertex)
    {
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);
        while(!stack.isEmpty())
        {
            
            Vertex actualVertex = this.stack.pop();
            System.out.print(actualVertex+ " ");
         for(Vertex v : actualVertex.getNeighbourList())
         {
             if(!v.isVisited())
             {
                 
                 v.setVisited(true);
                 this.stack.push(v);
             }
             
         }
        
            
        }
        
    }
    
}
