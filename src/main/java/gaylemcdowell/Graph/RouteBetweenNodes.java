package gaylemcdowell.Graph;

import java.util.*;

import org.junit.Assert;
/**
 *Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
 *
 */

public class RouteBetweenNodes{

    public boolean Solution(Graph<Character> myGraph, Vertex<Character> start, Vertex<Character> end){
        Queue<Vertex<Character>> myQueue = new LinkedList<>();
        myQueue.add(start);
        start.isVisited =true;

        while(!myQueue.isEmpty()){
            Vertex<Character> vertex = myQueue.poll();
            for(Vertex<Character> adjVertex: vertex.getAdjacentList()){
                if (adjVertex.isVisited == false){
                    if(adjVertex ==  end){
                        return true;
                    }else{
                        myQueue.add(adjVertex);
                        adjVertex.isVisited =true;
                    }
                }
            }

        }

        return false;

    }
    public static void main(String args[]){
        
        Graph<Character> myGraph = new Graph<Character>();


        Vertex<Character> a = new Vertex<Character>('a');
        Vertex<Character> b = new Vertex<Character>('b');
        Vertex<Character> c = new Vertex<Character>('c');
        Vertex<Character> d = new Vertex<Character>('d');
        Vertex<Character> e = new Vertex<Character>('e');
        Vertex<Character> f = new Vertex<Character>('f');

        //Creating AdjacentList
        a.addInAdjacentList(b); 
        a.addInAdjacentList(c); 
        a.addInAdjacentList(d); 

        d.addInAdjacentList(e); 
        
        e.addInAdjacentList(f); 


        //Create List of Graph
        myGraph.addVertex(a);
        myGraph.addVertex(b);
        myGraph.addVertex(c);
        myGraph.addVertex(d);
        myGraph.addVertex(e);
        myGraph.addVertex(f);

        RouteBetweenNodes obj = new RouteBetweenNodes();

        Assert.assertEquals(true,obj.Solution(myGraph, d, f));
        Assert.assertEquals(false,obj.Solution(myGraph, b, f));
    }

}
