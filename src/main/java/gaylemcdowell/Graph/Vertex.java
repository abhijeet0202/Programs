package gaylemcdowell.Graph;

import java.util.List;
import java.util.ArrayList;
public class Vertex<T> {
    T name;
    List<Vertex<T>> adjacentList;
    boolean isVisited;
    
    public Vertex(T data){
        this.name = data;
        adjacentList = new ArrayList<Vertex<T>>();
        isVisited =false;
    }

    public void addInAdjacentList(Vertex<T> vertex){
        adjacentList.add(vertex);
    }
    
    public List<Vertex<T>> getAdjacentList(){
        return adjacentList;
    }

}
