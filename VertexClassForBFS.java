package daa.bfs;
import java.util.List;
import java.util.LinkedList;
public class Vertex
{
    private int data;
    private boolean visited;
    private List<Vertex>neighbourList;
    
    public Vertex(int data)
    {
        this.data=data;
        this.neighbourList= new LinkedList<>();
        
    }
    public int getData()
    {
        return data;
        
    }
    
    public void setData(int data)
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
    
    public void addNeighbourVertex(Vertex vertex)
    {
        
        this.neighbourList.add(vertex);
        
    }
    @Override
    public String toString()
    {
        return " "+this.data;
        
    }
    
}
