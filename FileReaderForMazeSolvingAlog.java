package mazeSolver;
import java.io.File;
import java.util.Scanner;

public class FileReader {
 int[][] map;
private String fileName;
private int numOfRows;
private int numOfColumns;
int startPositionCol; // Start index of 2 "start point" col index 
int startPositionRow; // Start index of 2 "start point" row index

public FileReader(String fileName, int numOfRows, int numOfColumns)
{
	this.fileName=fileName;
	this.numOfRows=numOfRows;
	this.numOfColumns=numOfColumns;
	this.map=new int[numOfRows][numOfColumns];
}

public void parseFile()
{
try{
	Scanner sc = new Scanner(new File(this.fileName));
	for(int i=0;i<this.numOfRows;i++)
	{
		for(int j=0;j<this.numOfColumns;j++)
		{
			
			map[i][j]= sc.nextInt(); // read the integer from the file
			if(map[i][j]==2) // we have found the value 2 so save the col and the row index
			{
				startPositionCol=j;
				startPositionRow=i;
				
			}
			
		}
		
		
	}
	sc.close();
	
}	
catch(Exception e)
{
e.printStackTrace();	

}

}

public int[][] getMap() {
	return map;
}

public int getStartPositionCol() {
	return startPositionCol;
}

public int getStartPositionRow() {
	return startPositionRow;
}

}
