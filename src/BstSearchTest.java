import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void contains_returnsTrue_whenValueExists() {
        //Arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        root.left = new BinaryTreeNode<>(3);
        root.right = new BinaryTreeNode<>(10);
        root.left.right = new BinaryTreeNode<>(6);
        //Act
        boolean result = BstSearch.contains(root, 6);
        //Assert
        assertTrue(result);
    }

    
    
}
