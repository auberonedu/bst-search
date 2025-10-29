import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void BSTSearchTestResult_NullChecks_NoBinaryTree() {
        BstSearch search = new BstSearch();

        assertFalse(search.contains(null, 4));        
    }

    @Test
    public void BSTSearchTestResult_NullChecks_NoTarget() {
        BinaryTreeNode tree = new BinaryTreeNode(6);
        BstSearch search = new BstSearch();

        tree.left = new BinaryTreeNode(4);
        tree.left.left = new BinaryTreeNode(3);
        tree.left.right = new BinaryTreeNode(5);

        tree.right = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(9);
        tree.right.left = new BinaryTreeNode(7);

        assertFalse(search.contains(tree, 10));        
    }

    @Test
    public void BSTSearchTestResult_RootIsTarget() {
        BinaryTreeNode tree = new BinaryTreeNode(6);
        BstSearch search = new BstSearch();

        tree.left = new BinaryTreeNode(4);
        tree.left.left = new BinaryTreeNode(3);
        tree.left.right = new BinaryTreeNode(5);

        tree.right = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(9);
        tree.right.left = new BinaryTreeNode(7);

        assertTrue(search.contains(tree, 6));        
    }
    
    @Test
    public void BSTSearchTestResult_target_4() {
        BinaryTreeNode tree = new BinaryTreeNode(6);
        BstSearch search = new BstSearch();

        tree.left = new BinaryTreeNode(4);
        tree.left.left = new BinaryTreeNode(3);
        tree.left.right = new BinaryTreeNode(5);

        tree.right = new BinaryTreeNode(8);
        tree.right.right = new BinaryTreeNode(9);
        tree.right.left = new BinaryTreeNode(7);

        assertTrue(search.contains(tree, 4));        
    }
}
