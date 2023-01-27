package com.gl.p2.main;

import com.gl.p2.service.LeastCommonAncestor;
import com.gl.p2.service.Node;

public class Driver {

	public static void main(String[] args) {
		
		LeastCommonAncestor tree=new LeastCommonAncestor();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		
		tree.root.left.left=new Node(40);
		tree.root.left.right=new Node(50);
		
		tree.root.right.left=new Node(60);
		tree.root.right.right=new Node(70);
		
		System.out.println("Lowest coomon ancestor(20,30:)"+tree.findLCA(20,30));
		System.out.println("Lowest coomon ancestor(20,30:)"+tree.findLCA(20,40));
		System.out.println("Lowest coomon ancestor(20,30:)"+tree.findLCA(40,30));
		System.out.println("Lowest coomon ancestor(20,30:)"+tree.findLCA(60,70));

	}

}
