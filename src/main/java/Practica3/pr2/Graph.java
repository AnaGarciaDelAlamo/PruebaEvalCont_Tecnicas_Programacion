package Practica3.pr2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<V>{
    private Map<V, Set<V>> adjacencyList = new HashMap<>();

    public boolean addVertex(V v){
        if(adjacencyList.containsKey(v)){
            return false;
        }
        adjacencyList.put(v, null);
        return true;

    }

    public boolean addEdge(V v1, V v2){
        if(!adjacencyList.containsKey(v1) || !adjacencyList.containsKey(v2)){
            return false;
        }
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
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
