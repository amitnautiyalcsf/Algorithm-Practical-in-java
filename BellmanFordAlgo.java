package BellmanFordAlgo;

import java.util.List;

public class BellmanFord {

	private List<Edge>edgeList;
    private List<Vertex>vertexList;
    
    public BellmanFord(List<Edge>edgeList, List<Vertex>vertexList)
    {
    	this.edgeList=edgeList;
    	this.vertexList=vertexList;
    	
    }
    
    
public void bellmanFordAlgorithm(Vertex sourceVertex)
{
	sourceVertex.setDistance(0);
	for(int i= 0;i<vertexList.size()-1;++i) // v-1 iteration ----> we relaxed all the edges
	{
		for(Edge edge: edgeList)
		{
			Vertex u = edge.getStartVertex();
			Vertex v = edge.getStartVertex();
			
			if(u.getDistance()==Double.MAX_VALUE)
			{
				
				double newDistance = u.getDistance() + edge.getWeight();
				
				
				if(newDistance<v.getDistance())
				{
					
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
					
					
				}
				
			}
			
		}
		
		for(Edge edge: edgeList)// Vth iteration
		{
			
			if(edge.getStartVertex().getDistance()!= Double.MAX_VALUE)
			{
				
				if(hasCycle(edge))
				{
					System.out.println("There has been a negative cycle");
					return;
					
					
				}
				
			}
			
		}
		
		
	}
	

}


private boolean hasCycle(Edge edge) {
	
	return edge.getStartVertex().getDistance()+edge.getWeight() < edge.getTargetVertex().getDistance();
	
	
}

public void shortestPathTo(Vertex targetVertex)
{
	if(targetVertex.getDistance()==Double.MAX_VALUE)
	{
		System.out.println("There is no path from the source to target");
		
	}
	Vertex actualVertex= targetVertex;
	while(actualVertex.getPreviousVertex()!= null)
	{
		System.out.println(actualVertex + " - ");
		actualVertex= actualVertex.getPreviousVertex();
	}

}

}
