import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {


    @Test
    void BstSearchReturnTrueForExistingElement() {

        // Arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(15);

        // Act
        boolean result = BstSearch.contains(root, 5);

        // Assert
        assertTrue(result, "Search returned " + result + "!");

    }

    @Test
    void BstSearchReturnFalseForNonExistingElement() {

        // Arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(15);

        // Act
        boolean result = BstSearch.contains(root, 20);

        // Assert
        assertFalse(result, "Search returned " + result + "!");

    }

    
     @Test
    void BstSearchRootElement() {

        // Arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        root.left = new BinaryTreeNode<>(3);
        root.right = new BinaryTreeNode<>(10);

        // Act
        boolean result = BstSearch.contains(root, 8);

        // Assert
        assertTrue(result, "Search returned " + result + "!");

    }

}