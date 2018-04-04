package test;

import java.util.Arrays;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val){
		this.val = val;
	}
}

public class Tree {
	public TreeNode reContructBinaryTree(int[] pre, int[] mid){
		if(pre == null || mid == null){
			return null;
		}
		if(pre.length == 0 || mid.length == 0){
			return null;
		}
		if(pre.length != mid.length){
			return null;
		}
		TreeNode root = new TreeNode(pre[0]);
		for(int i = 0;i<pre.length;i++){
			if(pre[0] == mid[i]){
				root.left = reContructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(mid, 0, i));
				root.right = reContructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length),Arrays.copyOfRange(mid, i+1, mid.length));
			}
		}
		return root;
	}
	public static void main(String[] args) {
		int[] preTest = {1,2,4,7,3,5,6,8};
		int[] midTest = {4,7,2,1,5,3,8,6};
		Tree tree = new Tree();
		TreeNode tn =tree.reContructBinaryTree(preTest, midTest);
		System.out.println(tn.val);
	}

}
