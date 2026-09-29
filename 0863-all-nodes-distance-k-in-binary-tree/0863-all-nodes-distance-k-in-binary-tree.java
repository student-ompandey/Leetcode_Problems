/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    // Har node ka parent store karega
    Map<TreeNode, TreeNode> parent = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        // Step 1: Har node ka parent find karo
        makeParent(root, null);

        // Step 2: BFS ke liye Queue
        Queue<TreeNode> q = new LinkedList<>();

        // Same node ko baar-baar visit na karne ke liye
        Set<TreeNode> visited = new HashSet<>();

        // BFS target se start hoga
        q.add(target);
        visited.add(target);

        // Target se starting distance = 0
        int distance = 0;

        while (!q.isEmpty()) {

            // Agar K distance mil gayi
            if (distance == k) {

                List<Integer> ans = new ArrayList<>();

                while (!q.isEmpty()) {
                    ans.add(q.poll().val);
                }

                return ans;
            }

            // Current level mein kitne nodes hain
            int size = q.size();

            for (int i = 0; i < size; i++) {

                // Queue se current node nikalo
                TreeNode curr = q.poll();

                // Left child
                if (curr.left != null &&
                    !visited.contains(curr.left)) {

                    q.add(curr.left);
                    visited.add(curr.left);
                }

                // Right child
                if (curr.right != null &&
                    !visited.contains(curr.right)) {

                    q.add(curr.right);
                    visited.add(curr.right);
                }

                // Parent
                TreeNode par = parent.get(curr);

                if (par != null &&
                    !visited.contains(par)) {

                    q.add(par);
                    visited.add(par);
                }
            }

            // Ek level complete
            distance++;
        }

        return new ArrayList<>();
    }


    // Har node ka parent store karna
    private void makeParent(TreeNode root, TreeNode par) {

        // Agar node nahi hai
        if (root == null) {
            return;
        }

        // Current node ka parent save karo
        parent.put(root, par);

        // Left subtree
        makeParent(root.left, root);

        // Right subtree
        makeParent(root.right, root);
    }
}