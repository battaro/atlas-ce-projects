package Projects.TermProject3;
import java.util.*;

public class TermProject3
{
    public static final int maxNumbers = 10;
    public static int[] mainArray = new int[maxNumbers];
    public static int[] sortedArray = new int[maxNumbers];

    public static void main(String[] args)
    {
        BinarySearchTree bst = generateAndBuildBST();

        System.out.println("===== ORIGINAL BST =====");
        printArray(mainArray, "Insertion order:");
        makeSortedArray(bst);

        BinarySearchTree balancedBST = new BinarySearchTree();
        balancedBST.buildBalancedBST(sortedArray);

        System.out.println("\n===== BALANCE CHECK =====");
        System.out.println("Original BST balanced? " + bst.isBalanced());
        System.out.println("Balanced BST balanced? " + balancedBST.isBalanced());

        System.out.println("\n===== IMBALANCE METRICS =====");
        System.out.println("Original BST height ratio: " +
                bst.heightRatio(maxNumbers));
        System.out.println("Original BST badness score: " +
                bst.totalBadnessScore());

        System.out.println("\nBalanced BST height ratio: " +
                balancedBST.heightRatio(maxNumbers));
        System.out.println("Balanced BST badness score: " +
                balancedBST.totalBadnessScore());
    }
    static void makeSortedArray(BinarySearchTree bst)
    {
        sortedArray = bst.makeArrayDFSInorder();
        printArray(sortedArray,"Sorted array (DFS In-Order):");
    }

    //print array
    static void printArray(int[] arr,String text)
    {
        System.out.println(text);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static BinarySearchTree generateAndBuildBST()
    {
        Random rand = new Random();

        //object bst to return it in the end after inserting the random values
        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i < mainArray.length; i++)
        {
            mainArray[i] = rand.nextInt(100) + 1; // between 1 and 100
            bst.insert(mainArray[i]);
        }

        return bst;
    }

}

class CustomNode
{
    int data;
    CustomNode left, right;
    CustomNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}
class BinarySearchTree
{
    private int index;
    CustomNode root;

    //Constructor
    BinarySearchTree()
    {
        root = null;
    }

    //Insert method (add data to the tree)
    public void insert(int data)
    {
        root = insertRecursive(root, data);
    }


    //Recursive function to insert the data to the tree
    private CustomNode insertRecursive(CustomNode current, int data)
    {
        //if tree is empty
        if (current == null)
            return new CustomNode(data);

        //if it's empty and the new entry less than current data
        if (data < current.data)
            current.left = insertRecursive(current.left, data);

            //if it's empty and the new entry bigger than or equal to the current data
        else
            current.right = insertRecursive(current.right, data);

        return current;
    }




    //Recursive function to get the height of the full tree
    public int height(CustomNode root)
    {
        //if the tree is empty return -1 (means it's empty)
        if (root == null)
            return -1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    //function that sets the sortedArray
    public int[] makeArrayDFSInorder()
    {
        index = 0; // reset the index
        InOrderTraversal(root);
        return TermProject3.sortedArray;
    }

    //Recursive function to get inorderTraversal
    private void InOrderTraversal(CustomNode current)
    {
        if (current == null)
            return;

        InOrderTraversal(current.left);
        TermProject3.sortedArray[index++] = current.data;
        InOrderTraversal(current.right);
    }

    //Function that replaces the current tree with a balanced one
    public void buildBalancedBST(int[] arr)
    {
        root = buildBalancedRecursive(arr,0,arr.length -1);
    }


    //Recursive function to construct the balanced BST
    private CustomNode buildBalancedRecursive(int[] arr, int start, int end)
    {
        if (start > end)
            return null;


        //choose middle element to keep tree balanced
        int mid = (start + end) / 2;


        CustomNode node = new CustomNode(arr[mid]);

        //Build left and right subtrees
        node.left = buildBalancedRecursive(arr, start, mid - 1);
        node.right = buildBalancedRecursive(arr, mid + 1, end);

        return node;
    }

    //Checks if the entire tree is balanced
    public boolean isBalanced()
    {
        return isBalancedRecursive(root);
    }

    private boolean isBalancedRecursive(CustomNode current)
    {
        if (current == null)
            return true;

        int leftHeight = height(current.left);
        int rightHeight = height(current.right);

        //Check current node if its balanced
        if (Math.abs(leftHeight - rightHeight) > 1)
            return false;

        //Check left and right subtrees
        return isBalancedRecursive(current.left) && isBalancedRecursive(current.right);

    }


    //Using the rule in the doctors notes to calculate the height ratio
    public float heightRatio(int numberOfNodes)
    {
        int realHeight = height(root);
        int idealHeight = (int)(Math.log(numberOfNodes) / Math.log(2));

        if (idealHeight == 0)
            return 0;

        return (float) realHeight / idealHeight;
    }

    //Calculates total Badness score of the tree (how badly)
    public int totalBadnessScore()
    {
        return badnessRecursive(root);
    }

    //Recursive function to calculate badness at each node
    private int badnessRecursive(CustomNode current)
    {
        if (current == null)
            return 0;


        //get heights
        int leftHeight = height(current.left);
        int rightHeight = height(current.right);


        //calculate the current badness by subtracting the heights
        int currentBadness = Math.abs(leftHeight - rightHeight);

        return currentBadness
                + badnessRecursive(current.left)
                + badnessRecursive(current.right);

    }

}
/*
Output Example:

===== ORIGINAL BST =====
Insertion order:
74 42 87 33 82 10 35 40 37 74
Sorted array (DFS In-Order):
10 33 35 37 40 42 74 74 82 87

===== BALANCE CHECK =====
Original BST balanced? false
Balanced BST balanced? true

===== IMBALANCE METRICS =====
Original BST height ratio: 1.6666666
Original BST badness score: 14

Balanced BST height ratio: 1.0
Balanced BST badness score: 4

*/




