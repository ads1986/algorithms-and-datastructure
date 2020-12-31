package com.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

    private Set<String> vertices = new HashSet<>();
    private List<Edge> edges = new ArrayList<>();

    public void addVertice(String name){
        vertices.add(name);
    }

    public void removeVertice(String name){
        vertices.remove(name);
    }

    public void addEdge(String vertice1, String vertice2){
        Edge edge = edges.stream()
                    .filter(e -> (vertice1.equals(e.vertice1) && vertice2.equals(e.vertice2)))
                    .findFirst()
                    .orElse(null);
        if (edge == null)
            edges.add(new Edge(vertice1, vertice2));
    }

}
