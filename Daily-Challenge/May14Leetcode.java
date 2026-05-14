// ********Iterative method using two stack 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st1.push(root);

        while(!st1.isEmpty()){

            TreeNode temp = st1.pop();

            st2.push(temp);

            // left first
            if(temp.left != null){
                st1.push(temp.left);
            }

            // right second
            if(temp.right != null){
                st1.push(temp.right);
            }
        }

        while(!st2.isEmpty()){
            list.add(st2.pop().val);
        }

        return list;
    }
}