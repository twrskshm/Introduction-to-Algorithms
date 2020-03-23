import java.util.Stack;

public class DepthFirstSearch {
    DepthFirstSearch(final TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            System.out.print(currentNode.getData() + " ");

            if (currentNode.getLeft() != null) {
                stack.push(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                stack.push(currentNode.getRight());
            }
        }

        System.out.println();
    }
}

class TreeNode<T> {
    private T data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(final T value) {
        data = value;
    }

    void setData(final T d) {
        data = d;
    }

    T getData() {
        return data;
    }

    void setLeft(final TreeNode l) {
        left = l;
    }

    TreeNode getLeft() {
        return left;
    }

    void setRight(final TreeNode r) {
        right = r;
    }

    TreeNode getRight() {
        return right;
    }
}
