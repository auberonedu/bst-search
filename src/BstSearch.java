public class BstSearch {
    /**
     * Returns whether a binary search tree contains a given value.
     * 
     * As a precondition, the input root is assumed to be the root of a binary
     * search tree; this is not validated by the method. Passing in an invalid
     * tree causes undefined behavior.
     * 
     * A null value for the root is considered to represent a valid but empty
     * binary search tree. A null root will cause this method to always return
     * false if a valid target is given.
     * 
     * @param <T> The type of the values held in the nodes
     * @param root the root of the binary search tree (assumed to be valid)
     * @param target the value to search for
     * @return true if the target is contained in the tree, false otherwise
     * @throws NullPointerException if target is null
     */
    public static <T extends Comparable<T>> boolean contains(BinaryTreeNode<T> root, T target) {
        if(target == null) {
            throw new NullPointerException("Target cant be null");
        }
    
        if(root == null) return false;

        //compare target with current
        int compare = target.compareTo(root.data);

        //if they are equal, we found target
        if (compare == 0) {
            return true;
        } else if (compare < 0) {
            return contains(root.left, target); //if target is small, search the left
        } else {
            return contains(root.right, target); //if target is large, search the right 
        }
    }
}
