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

    @Test
    void contains_returnsFalse_whenValueSmallerThanAll() {
        // Arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        root.left = new BinaryTreeNode<>(3);
        root.right = new BinaryTreeNode<>(10);

        // Act
        boolean result = BstSearch.contains(root, 1);

        // Assert
        assertFalse(result);
    }

    @Test
    void contains_returnsFalse_whenTreeIsEmpty() {
        // Arrange
        BinaryTreeNode<Integer> root = null;
        // Act
        boolean result = BstSearch.contains(root, 8);
        // Assert
        assertFalse(result);
    }

    @Test
    void contains_returnsFalse_whenValueLargerThanAll() {
        // Arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        root.left = new BinaryTreeNode<>(3);
        root.right = new BinaryTreeNode<>(10);
        // Act
        boolean result = BstSearch.contains(root, 20);
        // Assert
        assertFalse(result);
    }



    
}
