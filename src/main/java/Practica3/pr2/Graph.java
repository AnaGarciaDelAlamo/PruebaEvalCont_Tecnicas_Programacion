package Practica3.pr2;

import java.util.*;

public class Graph<V>{
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v){

        return true;

    }

    public boolean addEdge(V v1, V v2){

        return true;
    }

    public Set<V> obtainAdjacents(V v) throws Exception{

        return null;
    }

    public boolean containsVertex(V v){
        return true;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjacencyList=" + adjacencyList +
                '}';
    }

    public List<V> onePath(V v1, V v2){

        return null;
    }
}
