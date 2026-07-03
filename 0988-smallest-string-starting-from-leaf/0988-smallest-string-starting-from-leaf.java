/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    String temp;
    ArrayList<String> s=new ArrayList<>();
    public void rec(String path,TreeNode root){
        if(root==null){
            return;
        }
       path=(char)(root.val+'a')+path;
        if(root.left==null && root.right==null){
            s.add(path);
             return;
            }
           
        
        rec(path,root.left);
        rec(path,root.right);
    }
    public String smallestFromLeaf(TreeNode root) {
       if(root==null)return "";
       rec("",root);
        temp=s.get(0);
        for(String str:s){
            if(temp.compareTo(str)>0){
                temp=str;
            }
        }
        return temp;
    }
}