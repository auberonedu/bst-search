import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

public class BstSearchTest {
    @Test
    void BasicIntTree(){
        BinaryTreeNode<Integer> leftLeaf = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rightLeaf = new BinaryTreeNode<>(3);
        
        // Create a root node with left and right children
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(4, leftLeaf, rightLeaf);

        assertTrue(BstSearch.contains(root, 2));
    }

    @Test
    void BasicStringTree(){
        BinaryTreeNode<String> leftLeaf = new BinaryTreeNode<>("Dani");
        BinaryTreeNode<String> rightLeaf = new BinaryTreeNode<>("Brady");
        
        // Create a root node with left and right children
        BinaryTreeNode<String> root = new BinaryTreeNode<>("GOD", leftLeaf, rightLeaf);

        assertTrue(BstSearch.contains(root, "Dani"));
    }

    @Test
    void NullTarget(){
        BinaryTreeNode<String> leftLeaf = new BinaryTreeNode<>("Dani");
        BinaryTreeNode<String> rightLeaf = new BinaryTreeNode<>("Brady");
        
        // Create a root node with left and right children
        BinaryTreeNode<String> root = new BinaryTreeNode<>("GOD", leftLeaf, rightLeaf);

        assertThrows(NullPointerException.class, () -> {
            BstSearch.contains(root, null);
        });
    }

    @Test
    void NullRoot(){
        BinaryTreeNode<String> leftLeaf = new BinaryTreeNode<>("Dani");
        BinaryTreeNode<String> rightLeaf = new BinaryTreeNode<>("Brady");
        
        // Create a root node with left and right children
        BinaryTreeNode<String> root = new BinaryTreeNode<>(null, leftLeaf, rightLeaf);

        assertFalse(BstSearch.contains(null, "Brady"));
    }
}
