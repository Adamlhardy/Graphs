import java.util.ArrayList;

/**
 * Main
 */

public class Main {
 
    public static void main(String[] args) {
     
        
        MatrixGraph<Character> matrixGraph = new MatrixGraph<Character>(10, false);
      
        matrixGraph.addNode('a');
        matrixGraph.addNode('b');
        matrixGraph.addNode('c');
        matrixGraph.addNode('d');
        matrixGraph.addNode('e');
        matrixGraph.addNode('f');
        matrixGraph.addNode('h');
        matrixGraph.addNode('h');
        matrixGraph.addNode('i');
        matrixGraph.addNode('j');

        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 2);
        matrixGraph.addEdge(1, 2);
        matrixGraph.addEdge(1, 3);
        matrixGraph.addEdge(2, 4);
        matrixGraph.addEdge(3, 4);
        matrixGraph.addEdge(4, 5);
        matrixGraph.addEdge(5, 6);
        matrixGraph.addEdge(7, 9);
        matrixGraph.addEdge(8, 9);

        matrixGraph.printMatrix();
        
        System.out.println(matrixGraph.edgeExists(0, 1));
        System.out.println(matrixGraph.edgeExists(0, 9));
        

        System.out.println("***");


        ListGraph listGraph = new ListGraph<>(10, false);

        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 2);
        listGraph.addEdge(1, 2);
        listGraph.addEdge(1, 3);
        listGraph.addEdge(2, 4);
        listGraph.addEdge(3, 4);
        listGraph.addEdge(4, 5);
        listGraph.addEdge(5, 6);
        listGraph.addEdge(7, 9);
        listGraph.addEdge(8, 9);

        listGraph.print();
        System.out.println("***");

        MatrixGraph<Integer> directedMatrix = new MatrixGraph<Integer>(8, true);
        
        directedMatrix.addNode(0);
        directedMatrix.addNode(1);
        directedMatrix.addNode(2);
        directedMatrix.addNode(3);
        directedMatrix.addNode(4);
        directedMatrix.addNode(5);
        directedMatrix.addNode(6);
        directedMatrix.addNode(7);

        directedMatrix.addEdge(0, 1);
        directedMatrix.addEdge(0, 2);
        directedMatrix.addEdge(1, 2);
        directedMatrix.addEdge(1, 3);
        directedMatrix.addEdge(2, 3);
        directedMatrix.addEdge(2, 5);
        directedMatrix.addEdge(3, 4);
        directedMatrix.addEdge(7, 6);
        
        directedMatrix.printMatrix();
        System.out.println("***");
    
        ListGraph directedList = new ListGraph(8, true);

        directedList.addEdge(0, 1);
        directedList.addEdge(0, 2);
        directedList.addEdge(1, 2);
        directedList.addEdge(1, 3);
        directedList.addEdge(2, 3);
        directedList.addEdge(2, 5);
        directedList.addEdge(3, 4);
        directedList.addEdge(7, 6);
        
        directedMatrix.printMatrix();
        System.out.println("***");
    }
}