import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void BstSearch_Integer(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(3);
        BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(4);
        root.left = left;
        root.right = right;

        boolean expected = BstSearch.contains(root, 4);

        assertEquals(expected, true);
        
    }

    @Test
    void BstSearch_String() {
        BinaryTreeNode<String> root = new BinaryTreeNode<String>("null");
        BinaryTreeNode<String> left = new BinaryTreeNode<String>("add");
        BinaryTreeNode<String> right = new BinaryTreeNode<String>("pull");
        BinaryTreeNode<String> rightRight = new BinaryTreeNode<String>("sub");
        root.left = left;
        root.right = right;
        root.right.right = rightRight;

        boolean expected = BstSearch.contains(root, "sub");

        assertEquals(expected, true);
    }
}
