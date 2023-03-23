package Practica3.pr2;

import java.util.*;

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
        if(adjacencyList.containsKey(v)){
            return adjacencyList.get(v);
        }
        return null;
    }

    public boolean containsVertex(V v){
        return adjacencyList.containsKey(v);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjacencyList=" + adjacencyList +
                '}';
    }

    public List<V> onePath(V v1, V v2){
        List<V> path = new ArrayList<>();
        path.add(v1);
        if(v1.equals(v2)){
            return path;
        }
        for (V v : adjacencyList.get(v1)){
            path.addAll(onePath(v, v2));
        }
        return path;
    }
}
