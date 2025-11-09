package Projects.TermProject;

import java.io.*;
import java.util.*;

public class mazeSolver {
    //2D array to store the maze on
    public static char mainMaze[][] = new char[15][15];

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
        String fileLocation = "location\\maze.txt";
        File file = new File(fileLocation);
        Scanner input = new Scanner(file);

        //Read the file (maze.txt) line by line
        for (int i = 0; i < 15; i++)
        {
            String line = input.nextLine();
            for (int j = 0; j < 15; j++)
            {
                mainMaze[i][j] = line.charAt(j);
            }
        }
        input.close();
    }

    //Print the maze to be sure
    static void printMaze(char maze[][])
    {
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++)
            {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    //Print the steps till we reach the exit, from bottom to the top (Iteratively)
    static void printStackLL(StackLL stack)
    {
        CharNode current = stack.top();

        while (current != null)
        {
            System.out.print("(" + current.getX() + "," + current.getY() + ") ");
            current = current.next;
        }
    }

    //Print the steps till we reach the exit, from top to the bottom (Recursively)
    static void printStackkLLReversed(CharNode node)
    {
        if (node == null) return;
        printStackkLLReversed(node.next);
        System.out.print("(" + node.getX() + "," + node.getY() + ") ");
    }

    static boolean solveMaze(char maze[][])
    {

        int startX = 0, startY = -1; // -1 mean the entrance not found
        boolean pathFound = false; //main flag if the path found or not

        for (int i = 0; i < 15; i++)
            if (maze[0][i] == '0')
            {
                startY = i;
                break;
            }

        if (startY == -1)
        {
            System.out.println("No entrance found");
            return pathFound;
        }

        System.out.println("\nEntrance found at: (" + startX + "," + startY + ")");

        StackLL path = new StackLL();

        // track visited cells
        boolean visited[][] = new boolean[15][15];

        //Push the first entrance to the stack and mark it as visited
        path.push(startX, startY);
        visited[startX][startY] = true;

        // movement directions: Right, Up, Down, Left
        int moveX[] = {0, -1, 1, 0};
        int moveY[] = {1, 0, 0, -1};



        while (!path.isEmpty())
        {
            CharNode current = path.top();
            int x = current.getX(), y = current.getY();

            // Check if we reach the bottom row (14 stands for the last row)
            if (x == 14)
            {
                pathFound = true;
                break;
            }
            boolean moved = false; // track moving iterations

            // Depth-First Search: explore all possible directions recursively using a stack
            for (int i = 0; i < 4; i++)
            {
                int newX = x + moveX[i];
                int newY = y + moveY[i];

                if (newX >= 0 && newX < 15 && newY >= 0 && newY < 15) // inside maze
                {
                    // If it's open ('0') and not yet visited, move there
                    if (maze[newX][newY] == '0' && !visited[newX][newY])
                    {
                        //Move forward and push it to the stack, mark it as visited, mark that we moved
                        path.push(newX, newY);
                        visited[newX][newY] = true;
                        moved = true;
                        break;
                    }
                }
            }
            if (!moved)
                path.pop();
        }

        if (pathFound)
        {
            printStackkLLReversed(path.top());
            return true;
        } else
        {
            System.out.println("\nNo path found");
            return pathFound;
        }
    }
}

class StackLL
{
    private CharNode top; //head of the stack

    StackLL()
    {
        top = null;
    }

    //push new coordinate onto the stack
    void push(int x, int y)
    {
        CharNode newNode = new CharNode(x, y);
        newNode.next = top;
        top = newNode;
    }

    //Pop the top and return the poped value
    CharNode pop()
    {
        if (isEmpty()) return null;
        CharNode temp = top;
        top = top.next;
        return temp;
    }

    //Get the top coordinate without removing
    CharNode top()
    {
        return top;
    }

    boolean isEmpty()
    {
        return top == null;
    }

}

class CharNode
{
    private int x, y;
    CharNode next;

    CharNode(int x, int y)
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

Entrance found at: (0,1)
(0,1) (1,1) (1,2) (1,3) (1,4) (2,4) (3,4) (4,4) (5,4) (5,5) (5,6)
(4,6) (3,6) (2,6) (1,6) (1,7) (1,8) (1,9) (1,10) (1,11) (1,12) (1,13)
(2,13) (3,13) (4,13) (5,13) (5,12) (5,11) (5,10) (6,10) (7,10) (7,11)
(7,12) (7,13) (8,13) (9,13) (10,13) (11,13) (12,13) (13,13) (14,13)
Found a solution, path from start to exit printed

*/