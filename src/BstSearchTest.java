import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    //helper method
    private BinaryTreeNode<Integer> createSampleTree(){
        //create nodes
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        root.left = new BinaryTreeNode<Integer>(5);
        root.right = new BinaryTreeNode<Integer>(15);
        root.left.left = new BinaryTreeNode<Integer>(3);
        root.left.right = new BinaryTreeNode<Integer>(7);
        root.right.right = new BinaryTreeNode<Integer>(20);
         return root;

    }
    @Test
    public void testContainValueDoesNotExist(){
        BinaryTreeNode<Integer> root = createSampleTree();

        //not in tree
        assertFalse(BstSearch.contains(root, 8));
        //smaller
        assertFalse(BstSearch.contains(root, 1));
        //larger
        assertFalse(BstSearch.contains(root, 30));

    }

    @Test 
    public void testContainValueDoesExist() {
        BinaryTreeNode<Integer> root = createSampleTree();

        assertTrue(BstSearch.contains(root, 10));
        assertTrue(BstSearch.contains(root, 5));
        assertTrue(BstSearch.contains(root, 15));
        assertTrue(BstSearch.contains(root, 3));
        assertTrue(BstSearch.contains(root, 20));
    }

    @Test 
    public void testEmptyTree() {
        BinaryTreeNode<Integer> root = null;

        assertFalse(BstSearch.contains(root, 10));
    }

    @Test
    public void testOneNodeTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(40);

        assertTrue(BstSearch.contains(root, 40));
        assertFalse(BstSearch.contains(root, 39));
        assertFalse(BstSearch.contains(root, 41));
    }

    @Test
    public void testImballancedTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);

        root.left = new BinaryTreeNode<Integer>(4);
        root.left.left = new BinaryTreeNode<Integer>(3);
        root.left.left.left = new BinaryTreeNode<Integer>(2);

        assertTrue(BstSearch.contains(root, 3));
        assertFalse(BstSearch.contains(root, 1));
    }

    @Test
    public void testNullTraget() {
        BinaryTreeNode<Integer> root = createSampleTree();
        assertThrows(NullPointerException.class, () -> {
            BstSearch.contains(root,null);
        });
    }
}

