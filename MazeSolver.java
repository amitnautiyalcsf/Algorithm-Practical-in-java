package mazeSolver;

public class MazeSolver {
private int[][] mazeMap;
private boolean[][] visited;
private int startPositionCol;
private int startPositionRow;
public MazeSolver(int[][] mazeMap, int startPositionCol, int startPositionRow)
{
	this.mazeMap= mazeMap;
	this.startPositionCol= startPositionCol;
	this.startPositionRow= startPositionRow;
	this.visited= new boolean[mazeMap.length][mazeMap.length];
}

public void findWayOut()
{
try{
	dfs(startPositionRow, startPositionCol);
	System.out.println("No solution found");
	
}
catch(RuntimeException e)
{
System.out.println("Route found to exit"); 	
}

}

public void dfs(int rowIndex, int colIndex)
{
	
System.out.println("Visiting i = " +rowIndex+ ", j = " +colIndex);

if(this.mazeMap[rowIndex][colIndex]==3)
{
  throw new RuntimeException(); //if we have found 3 "exit" we break out the iteration with an exception	
}

int endOfMap= this.mazeMap.length-1;

if(visited[rowIndex][colIndex]) // if it has been already visited we just skip it.
{
	return;
}

else if(rowIndex<0 || rowIndex>=endOfMap) // out of map
{
return;	
}

else if(colIndex<0 || colIndex>=endOfMap) // out of map
{
return;	
}
else if(this.mazeMap[rowIndex][colIndex]==1) // if it is a wall we cannot go in that direction.
{
return;	
}
else
{
this.visited[rowIndex][colIndex]=true; // set the current position to visited.
dfs(rowIndex+1, colIndex); // going down
dfs(rowIndex,colIndex+1);//going right
dfs(rowIndex,colIndex-1);//going left
dfs(rowIndex-1,colIndex); // going up

}



}


}
