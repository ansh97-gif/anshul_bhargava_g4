package dsa.treesum;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=null;
		HashSet<Integer> set=new HashSet<>();
		node=insert(node,40);
		node=insert(node,20);
		node=insert(node,60);
		node=insert(node,10);
		node=insert(node,30);
		node=insert(node,50);
		node=insert(node,70);
		findPair(node,130);

	}
	
	public static Node insert(Node root,int value) {
		Node insertNode=new Node(value);
		//System.out.println(value);
		if(root==null)
			return insertNode;
		if(root.value<insertNode.value)
			root.right=insert(root.right,insertNode.value);
		else if(root.value>insertNode.value)
			root.left=insert(root.left,insertNode.value);
		return root;
	}
	
	public static void inorderTraversal(Node node,HashSet<Integer>set) {
		if(node==null)
			return ;
		
		inorderTraversal(node.left,set);
		set.add(node.value);
		System.out.println(node.value);
		inorderTraversal(node.right,set);
		
	}
	public static void findPair(Node node,int sum) {
		HashSet<Integer>set=new HashSet<>();
		inorderTraversal(node,set);
		for(Integer num:set) {
			if(set.contains(sum-num)) {
				System.out.println("Pair is ("+(sum-num)+","+num+")");
				return;
			}		
		}
		System.out.println("Nodes are not found");
	}
	
	
	
	

}
