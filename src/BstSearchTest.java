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
    void BstSearch_Double(){
        BinaryTreeNode<Double> root = new BinaryTreeNode<>(3.3);
        BinaryTreeNode<Double> left = new BinaryTreeNode<>(1.1);
        BinaryTreeNode<Double> right = new BinaryTreeNode<>(586.0);
        root.left = left;
        root.right = right;
        
        boolean expected = BstSearch.contains(root, 4.0);

        assertEquals(expected, false);
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

    @Test
    void BstSearch_Null(){
        BinaryTreeNode<Double> root = new BinaryTreeNode<>(null);
        
        boolean expected = BstSearch.contains(root, 4.0);

        assertEquals(expected, false);
    }
}
