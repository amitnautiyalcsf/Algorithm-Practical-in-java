package mazeSolver;

public class App {
public static void main(String args[])
{
FileReader fileReader= new FileReader("C:\\Users\\30661\\Desktop\\map.txt", 5,5);
fileReader.parseFile();
MazeSolver mazeSolver= new MazeSolver(fileReader.getMap(), fileReader.getStartPositionCol(), fileReader.getStartPositionRow());
mazeSolver.findWayOut();
}
}
