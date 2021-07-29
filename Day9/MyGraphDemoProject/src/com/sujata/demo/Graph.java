package com.sujata.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<String,List<String>> map=new HashMap<String, List<String>>();
	
	public void addNewVertex(String s) {
		map.put(s, new LinkedList<String>());
	}
	
	public void addNewEdges(String source,String destination,boolean bidirectional) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		
		map.get(source).add(destination);
		if(bidirectional==true)
			map.get(destination).add(source);
	}
	
	public String toString() {
		StringBuilder builder=new StringBuilder();
		
		for(String key:map.keySet()) {
			builder.append(key.toString()+" : ");
			for(String value:map.get(key)) {
				builder.append(value.toString()+" ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
