import java.util.LinkedList;

public class BreadthFirstSearch {
    public BreadthFirstSearch(final TreeNode root) {
        if (root == null) {
            return;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();
            System.out.print(currentNode.getData() + " ");

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }

            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
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
