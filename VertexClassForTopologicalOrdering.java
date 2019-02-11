import java.util.List;
import java.util.LinkedList;
public class Vertex
{
    private String data;
    private boolean visited;
    private List<Vertex>neighbourList;
    
    public Vertex(String data)
    {
        this.data=data;
        this.neighbourList= new LinkedList<>();
    }
    
    public void addNeighbour(Vertex vertex)
    {
        this.neighbourList.add(vertex);
        
    }
    @Override
    public String toString()
    {
        return this.data;
        
    }
    
     public String getData()
    {
        return data;
        
    }
    public void setName(String data)
    {
        
        this.data=data;
    }
    
     public boolean isVisited()
    {
        return visited;
        
    }
    public void setVisited(boolean visited)
    {
        this.visited=visited;
    }
    public List<Vertex> getNeighbourList()
    {
        return neighbourList;
        
    }
    public void setNeighbourList(List<Vertex> neighbourList)
    {
        this.neighbourList= neighbourList;
        
    }
    
    
}
