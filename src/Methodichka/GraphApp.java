package Methodichka;

public class GraphApp{
    public static void main ( String [] args ) {
        Graph graph = new Graph ();
        graph . addVertex ( 'A' );
        graph . addVertex ( 'B' );
        graph . addVertex ( 'C' );
        graph . addVertex ( 'D' );
        graph . addVertex ( 'E' );
        graph . addEdge ( 0 , 1 ); //AB
        graph . addEdge ( 0 , 2 ); //BC
        graph . addEdge ( 0 , 3 ); //AD
        graph . addEdge ( 2 , 4 ); //DE
  //      graph . dfs ();
        System.out.println("--------------");
        graph.bfs(4);

    }
}
