package edu.isu.cs.cs2263;

import com.google.common.base.Strings;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Graph implements Visitor {
    MutableNetwork<String, String> graph = NetworkBuilder.directed().build();
    Set<String> nodes = graph.nodes();
    Set<String> edges = graph.edges();

    public Set<String> getNodes() {
        return nodes;
    }

    public Set<String> getEdges() {
        return edges;
    }

    public void setNodes(Set<String> nodes) {
        this.nodes = nodes;
    }

    public void setEdges(Set<String> edges) {
        this.edges = edges;
    }

    public Graph(){
        //  MutableNetwork<String, String> graph = NetworkBuilder.directed().build();
        graph.addNode("Daniel");
        graph.addNode("Kendra");
        graph.addEdge("Daniel", "kendra","Dating");
        graph.addEdge("James","David","Friends");
        graph.addEdge("Samuel", "Arinze", "Enemies");
        graph.addEdge("Rachel","Shayla","classmates");
        graph.edgeConnecting("Daniel", "Kendra");
        graph.asGraph();
        graph.incidentNodes("Dating");
    }

    public void print(){
        EndpointPair<String> x =graph.incidentNodes("Dating");
        Set<String> y = graph.incidentEdges("Daniel");
        System.out.println(x.nodeU()+ "------------" +y+"-------->"+ x.nodeV());

    }
    public void summary(){
        Set<String> y = graph.incidentEdges("Daniel");
        Iterator<String> rel;
       rel= y.iterator();
        Set<String> edges = graph.edges();
        Set<String> nodes = graph.nodes();

        Iterator<String> zoom ;
        zoom = edges.iterator();
       int sum = y.size();

        System.out.println("Relationship - count"+" "+sum);
    }



    @Override
    public String visit(Friends friends) {
        return null;
    }

    @Override
    public String visit(Dating dating) {
        return null;
    }

}



