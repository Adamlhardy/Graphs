import java.util.ArrayList;

public class MatrixGraph<T> {
    
    ArrayList<Node<T>> nodes; // this will store the nodes data
    private int[][] matrix; // this is creating a 2D array
    boolean isDirected; // defines if the graph is directed or not

    public MatrixGraph(int size, boolean isDirected) {
        super();
        matrix = new int[size][size];
        this.isDirected = isDirected;
        nodes = new ArrayList<>(size);
    }

    public void addNode(T data) {
        Node<T> newNode = new Node<T>(data);
        nodes.add(newNode);
    }

    public boolean edgeExists(int src, int dest) {
        if(matrix[src][dest] == 1)
            return true;
        else 
            return false;
    }

    public void addEdge(int src, int dest) {
        matrix[src][dest] = 1; // creates an edge
        
        if(!isDirected) {
            matrix[dest][src] = 1;
        }
    }

    public void printMatrix() {

        System.out.print("  ");
        for(Node<T> node: nodes) { // prints column headers 
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) { // this will create our row headers
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) { // this will create our rows (table fill)
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
