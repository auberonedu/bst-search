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
}
