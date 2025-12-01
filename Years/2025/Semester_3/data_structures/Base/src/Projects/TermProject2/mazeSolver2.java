package Projects.TermProject2;

import java.io.*;
import java.util.*;

public class mazeSolver2
{
    //2D array to store the maze on
    public static char mainMaze[][] = new char[15][15];
    public static final int lineLength = 15;

    public static void main(String[] args)
    {
        try
        {
            readAndStoreMaze();
            printMaze(mainMaze);

            boolean done = solveMaze(mainMaze);
            String output = done ? "Found a solution, path from start to exit printed" : "No solution found";
            System.out.println("\n" + output);

        } catch (IOException e)
        {
            System.out.println("Error: maze.txt not found (IO Exception)");
        }
    }

    // Read the file and store it in the mainMaze
    static void readAndStoreMaze() throws IOException
    {

        //Create Object points to maze.txt
        String fileLocation = "maze.txt";
        File file = new File(fileLocation);
        Scanner input = new Scanner(file);

        //Read the file (maze.txt) line by line
        for (int i = 0; i < lineLength; i++)
        {
            String line = input.nextLine();
            for (int j = 0; j < lineLength; j++)
            {
                mainMaze[i][j] = line.charAt(j);
            }
        }
        input.close();
    }

    //Print the maze to be sure
    static void printMaze(char maze[][])
    {
        for (int i = 0; i < lineLength; i++)
        {
            for (int j = 0; j < lineLength; j++)
            {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    //Find the entrance and the exit for the maze (int[] because we're returning coordinates (x,y)
    static int[] findEntrance()
    {
        for (int j = 0; j < lineLength; j++)
        {
            if (mainMaze[0][j] == '0')
            {
                return new int[]{0, j};
            }
        }
        return null;
    }

    static int[] findExit()
    {
        for (int j = 0; j < lineLength; j++)
        {
            if (mainMaze[lineLength - 1][j] == '0')
                return new int[]{lineLength - 1, j};
        }
        return null;
    }

    static void printPathRecursively(int[][] parentX, int[][] parentY, int startX, int startY, int x, int y)
    {
        // Base case
        if (x == startX && y == startY)
        {
            System.out.print("(" + x + "," + y + ") ");
            return;
        }

        // Recursively print the parent first
        printPathRecursively(parentX, parentY, startX, startY, parentX[x][y], parentY[x][y]);

        // Print this cell
        System.out.print("(" + x + "," + y + ") ");
    }

    static boolean solveMaze(char maze[][])
    {

        //Locate the entrance and the exit
        int[] start = findEntrance();
        int[] end = findExit();

        if (start == null || end == null)
        {
            System.out.println("No entrance or exit found.");
            return false;
        }

        int startX = start[0], startY = start[1], endX = end[0], endY = end[1];

        System.out.println("\nEntrance at: (" + startX + "," + startY + ")");
        System.out.println("Exit at: (" + endX + "," + endY + ")");


        //visited flag to remember the visited cells
        boolean[][] visited = new boolean[lineLength][lineLength];

        //Movements directions:
        int[][] directions = {
                {0, 1},  //Right
                {-1, 0}, //Up
                {1, 0},  //Down
                {0, -1}  //Left
        };

        //The queue where we store the path
        MyQueue q = new MyQueue();
        q.enqueue(startX, startY);
        visited[startX][startY] = true;

        //Parent arrays to reconstruct the shortest path later
        int[][] parentX = new int[lineLength][lineLength];
        int[][] parentY = new int[lineLength][lineLength];

        //BFS loop
        while (!q.isEmpty())
        {
            QueueNode current = q.dequeue();
            int currentX = current.getX();
            int currentY = current.getY();

            //Check if we reach the exit and print the shortest path
            if (currentX == endX && currentY == endY)
            {
                System.out.println("\nShortest Path:");
                printPathRecursively(parentX, parentY, startX, startY, endX, endY);
                System.out.println();
                return true;
            }

            //Explore each neighbors for each reached cell
            for (int i = 0; i < 4; i++)
            {
                int newX = currentX + directions[i][0];
                int newY = currentY + directions[i][1];
                //Check if it's an open cell and not visited
                if (newX >= 0 && newX < lineLength && newY >= 0 && newY < lineLength)
                {
                    if (maze[newX][newY] == '0' && !visited[newX][newY])
                    {
                        visited[newX][newY] = true;

                        //construct the shortest path in the parents
                        parentX[newX][newY] = currentX;
                        parentY[newX][newY] = currentY;

                        q.enqueue(newX, newY);
                    }
                }
            }
        }


        //If BFS didn't work so there is no path
        System.out.println("No path found.");
        return false;
    }
}

//The queue where we will save the coordinates (the path)
class MyQueue
{
    private QueueNode front;
    private QueueNode rear;

    MyQueue()
    {
        front = rear = null;
    }

    //add function (enqueue)
    void enqueue(int x, int y)
    {
        QueueNode newNode = new QueueNode(x, y);
        if (isEmpty())
            front = rear = newNode;
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }

    //return top element and remove it (dequeue)
    QueueNode dequeue()
    {
        if (isEmpty()) return null;
        QueueNode temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return temp;

    }

    Boolean isEmpty()
    {
        return front == null;
    }
}


// the node of the queue class (every node is a coordinate)
class QueueNode
{
    private int x, y;
    QueueNode next;

    QueueNode(int x, int y)
    {
        this.x = x; this.y = y; this.next = null;
    }

    int getX() {return x;}

    int getY() {return y;}
}

/*


Output Example:
101111111111111
100001000000001
101101011111101
100001010000001
111101010111101
100000010100001
101111010101111
101000000100001
101011111101101
101000000001101
111111011101101
100000010010001
101111111111101
100001000000001
111111111111101

Entrance at: (0,1)
Exit at: (14,13)

Shortest Path:
(0,1) (1,1) (1,2) (1,3) (1,4) (2,4) (3,4) (4,4) (5,4) (5,5)
(5,6) (6,6) (7,6) (7,5) (7,4) (7,3) (8,3) (9,3) (9,4) (9,5)(9,6)
(9,7) (9,8) (9,9) (9,10) (8,10) (7,10) (7,11) (7,12) (7,13) (8,13)
(9,13) (10,13) (11,13) (12,13) (13,13) (14,13)

Found a solution, path from start to exit printed

Comments about steps I finished:
I finished all steps from reading the file till printing the coordinates for the shortest path.


*/
