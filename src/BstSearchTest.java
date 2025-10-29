import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    //
    // Positive Checks
    //

    @Test
    public void BSTSearchTestResult_NullChecks_NoBinaryTree() {
        assertFalse(BstSearch.contains(null, 4));        
    }

    @Test
    public void BSTSearchTestResult_NullChecks_NoTarget() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(6);

        tree.left = new BinaryTreeNode<>(4);
        tree.left.left = new BinaryTreeNode<>(3);
        tree.left.right = new BinaryTreeNode<>(5);

        tree.right = new BinaryTreeNode<>(8);
        tree.right.right = new BinaryTreeNode<>(9);
        tree.right.left = new BinaryTreeNode<>(7);

        assertFalse(BstSearch.contains(tree, 10));        
    }

    @Test
    public void BSTSearchTestResult_NullChecks_NullTarget() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(6);

        tree.left = new BinaryTreeNode<>(4);
        tree.left.left = new BinaryTreeNode<>(3);
        tree.left.right = new BinaryTreeNode<>(5);

        tree.right = new BinaryTreeNode<>(8);
        tree.right.right = new BinaryTreeNode<>(9);
        tree.right.left = new BinaryTreeNode<>(7);

        assertThrows(NullPointerException.class, () -> BstSearch.contains(tree, null));        
    }

    @Test
    public void BSTSearchTestResult_RootIsTarget() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(6);

        tree.left = new BinaryTreeNode<>(4);
        tree.left.left = new BinaryTreeNode<>(3);
        tree.left.right = new BinaryTreeNode<>(5);

        tree.right = new BinaryTreeNode<>(8);
        tree.right.right = new BinaryTreeNode<>(9);
        tree.right.left = new BinaryTreeNode<>(7);

        assertTrue(BstSearch.contains(tree, 6));        
    }
    
    @Test
    public void BSTSearchTestResult_target_4() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(6);

        tree.left = new BinaryTreeNode<>(4);
        tree.left.left = new BinaryTreeNode<>(3);
        tree.left.right = new BinaryTreeNode<>(5);

        tree.right = new BinaryTreeNode<>(8);
        tree.right.right = new BinaryTreeNode<>(9);
        tree.right.left = new BinaryTreeNode<>(7);

        assertTrue(BstSearch.contains(tree, 4));        
    }

    @Test
    public void BSTSearchTestResult_target_9() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(6);

        tree.left = new BinaryTreeNode<>(4);
        tree.left.left = new BinaryTreeNode<>(3);
        tree.left.right = new BinaryTreeNode<>(5);

        tree.right = new BinaryTreeNode<>(8);
        tree.right.right = new BinaryTreeNode<>(9);
        tree.right.left = new BinaryTreeNode<>(7);

        assertTrue(BstSearch.contains(tree, 9));        
    }

    //
    // Negative Checks
    //


    @Test
    public void BSTSearchTestResult_target_FindsNegative_OnLeft() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(-2);

        tree.left = new BinaryTreeNode<>(-4);
        tree.left.left = new BinaryTreeNode<>(-5);
        tree.left.right = new BinaryTreeNode<>(-3);

        tree.right = new BinaryTreeNode<>(0);
        tree.right.right = new BinaryTreeNode<>(1);
        tree.right.left = new BinaryTreeNode<>(-1);

        assertTrue(BstSearch.contains(tree, -3));        
    }

    @Test
    public void BSTSearchTestResult_target_FindsNegative_OnRight() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(-2);

        tree.left = new BinaryTreeNode<>(-4);
        tree.left.left = new BinaryTreeNode<>(-5);
        tree.left.right = new BinaryTreeNode<>(-3);

        tree.right = new BinaryTreeNode<>(0);
        tree.right.right = new BinaryTreeNode<>(1);
        tree.right.left = new BinaryTreeNode<>(-1);

        assertTrue(BstSearch.contains(tree, -1));        
    }

    @Test
    public void BSTSearchTestResult_target_FindsNegative_EqualRootAndTarget() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(-2);

        tree.left = new BinaryTreeNode<>(-4);
        tree.left.left = new BinaryTreeNode<>(-5);
        tree.left.right = new BinaryTreeNode<>(-3);

        tree.right = new BinaryTreeNode<>(0);
        tree.right.right = new BinaryTreeNode<>(1);
        tree.right.left = new BinaryTreeNode<>(-1);

        assertTrue(BstSearch.contains(tree, -2));        
    }

    @Test
    public void BSTSearchTestResult_target_FindsNegative_NoFoundTarget() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(-2);

        tree.left = new BinaryTreeNode<>(-4);
        tree.left.left = new BinaryTreeNode<>(-5);
        tree.left.right = new BinaryTreeNode<>(-3);

        tree.right = new BinaryTreeNode<>(0);
        tree.right.right = new BinaryTreeNode<>(1);
        tree.right.left = new BinaryTreeNode<>(-1);

        assertFalse(BstSearch.contains(tree, -10));        
    }


    @Test
    public void BSTSearchTestResult_target_FindsNegative_NullRoot() {
        assertFalse(BstSearch.contains(null, -2));        
    }

    @Test
    public void BSTSearchTestResult_target_FindsNegative_NullTarget() {
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(-2);

        tree.left = new BinaryTreeNode<>(-4);
        tree.left.left = new BinaryTreeNode<>(-5);
        tree.left.right = new BinaryTreeNode<>(-3);

        tree.right = new BinaryTreeNode<>(0);
        tree.right.right = new BinaryTreeNode<>(1);
        tree.right.left = new BinaryTreeNode<>(-1);

        assertThrows(NullPointerException.class, () -> BstSearch.contains(tree, null));        
    }
    
}
