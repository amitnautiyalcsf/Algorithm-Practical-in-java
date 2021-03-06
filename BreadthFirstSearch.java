package daa.BFS;
import java.util.LinkedList;
import java.util.Queue;
public class BFS
{
    public void bfs(Vertex root)
    {
        Queue<Vertex>queue= new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            Vertex acturalVertex=queue.remove();
            System.out.println(acturalVertex+ " ");
            
            for(Vertex v : acturalVertex.getNeighbourList())
            {
                if(!v.isVisited())
                {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
            
        }
    }
    
}


