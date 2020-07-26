package gaylemcdowell.Graph;

import java.util.*;

public class Graph<T>{ 
    List<Vertex<T>> listOfVertex;
    int[][] adjacentMatrix;//Either use adjacentList or adjacentMatrix for single problem;

    public Graph(){
        listOfVertex = new ArrayList<Vertex<T>>();
    }

    public Graph(int size){
        listOfVertex = new ArrayList<Vertex<T>>();
        adjacentMatrix = new int[size][size]; //Either use adjacentList or adjacentMatrix for single problem;
    }

    public void addVertex(Vertex<T> vertex){
        listOfVertex.add(vertex);
    }


    public List<Vertex<T>> getVertex(){
        return listOfVertex;
    }
}
