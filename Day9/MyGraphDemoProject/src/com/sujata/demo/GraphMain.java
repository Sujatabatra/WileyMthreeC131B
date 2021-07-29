package com.sujata.demo;

public class GraphMain {

	public static void main(String[] args) {
		Graph graph=new Graph();
		
		graph.addNewEdges("Delhi", "Ahmedabad", true);
		graph.addNewEdges("Delhi", "Patna", true);
		graph.addNewEdges("Ahmedabad", "Indore", true);
		graph.addNewEdges("Indore", "Patna", true);
		graph.addNewEdges("Chennai", "Ahmedabad", true);
		graph.addNewEdges("Chennai", "Patna", true);
		
		System.out.println(graph);
		

	}

}
