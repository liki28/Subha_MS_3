package com.gl.p2.service;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {
	public Node root;
	
	List<Integer>path1=new ArrayList<>();
	List<Integer>path2=new ArrayList<>();
	
	public int findLCA(int node1,int node2) {
		path1.clear();
		path2.clear();
		
		return findLCAInternal(root,node1,node2);
	}

	private int findLCAInternal(Node root,int node1,int node2) {
			if(!findPath(root,node1,path1)) {
				System.out.println("node1 is missing");
				return-1;
			}
			if(!findPath(root,node1,path2)) {
				System.out.println("node2 is missing");
				return -1;
			}
			int i=0;
			for(i=0;i<path1.size()&&i<path2.size();i++) {
				
				if(path1.get(i).equals(path2.get(i))) {
					break;
				}
			}
			
		return path1.get(i-1);
	}
	
	//find path
	private boolean findPath(Node root,int node,List<Integer>path) {
		
		if(root==null)
			return false;
		
		path.add(root.data);
		
		if(root.data==node)
			return true;
		if(root.left!=null&findPath(root.left,node,path))
			return true;
		if(root.right!=null&findPath(root.right,node,path))
			return true;
		
		path.remove(path.size()-1);
		
		return false;
		
	}

}
