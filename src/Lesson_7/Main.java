package Lesson_7;

public class Main {
    public static void main(String[] args) {
        DZ.Graph graphDZ=new DZ.Graph(10);
//        graphDZ.addEdge(0,1); graphDZ.addEdge(1,3);
//        graphDZ.addEdge(0,2); graphDZ.addEdge(2,3);
        Graph graph = new Graph(10);
        graph.addEdge(0,1); graph.addEdge(1,3);
        graph.addEdge(0,2); graph.addEdge(2,3);
//        graph.addEdge(0,1);  graph.addEdge(1,4); graph.addEdge(4,6);graph.addEdge(6,7);
//                             graph.addEdge(1,5); graph.addEdge(5,7);
//        graph.addEdge(0,2);graph.addEdge(2,7);
//        graph.addEdge(0,3);graph.addEdge(3,8);graph.addEdge(8,9);graph.addEdge(9,7);
//        System.out.println("List(0):"+ graph.getAdjList(0));
//        System.out.println("List(7):"+ graph.getAdjList(7));

//        System.out.println(graph.getAdjList(1));
//
//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 0);
//        System.out.println(dfp.hashPathTo(1));
//        System.out.println(dfp.pathTo(7));
//
        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
//        System.out.println(bfp.hasPathTo(3));
        System.out.println(bfp.pathTo(3));

    }
}
