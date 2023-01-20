package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    private int V;
    private ArrayList<Integer> graph [];
    public Graph(int v){
        V=v;
        graph= new ArrayList[v];
        for (int i=0;i<v;i++){
            graph[i]=new LinkedList<>();
        }
    }
}
