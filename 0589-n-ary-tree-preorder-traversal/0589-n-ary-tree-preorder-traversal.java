/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//DFS 를 이용해 문제를 풀 수 있다.

class Solution {
    List<Integer> response = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return response;
        response.add(root.val);
        for(Node node : root.children) preorder(node);
        return response;
    }
}