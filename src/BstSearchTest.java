import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testBinarySearchTesting() {
        // Arrange
        BinaryTreeNode balancedTree = new BinaryTreeNode<>(40,      //root
                                        new BinaryTreeNode<>(12,null,null),     //right
                                            new BinaryTreeNode<>(45,null,null));       //left
        
        // Act
        boolean result = BstSearch.contains(balancedTree, 45);
        // Assert
        assertTrue(result);
    }

    @Test
    public void testBinarySearchOneNode() {
        // Arrange
        BinaryTreeNode balancedTree = new BinaryTreeNode<>(40, null, null);
        
        // Act
        boolean result = BstSearch.contains(balancedTree, 40);
        // Assert
        assertTrue(result);
    }
    @Test
    public void testBinarySearchFalseTesting() {
        // Arrange
        BinaryTreeNode balancedTree = new BinaryTreeNode<>(40,      //root
                                        new BinaryTreeNode<>(12,null,null),     //right
                                            new BinaryTreeNode<>(45,null,null));       //left
        
        // Act
        boolean result = BstSearch.contains(balancedTree, 100);
        // Assert
        assertFalse(result);
    }

    @Test
    public void testBinaryBigSearchTesting() {
        // Arrange
        BinaryTreeNode bigBinaryTreeNode = new BinaryTreeNode<>(40,      //root
                                        new BinaryTreeNode<>(12,new BinaryTreeNode<>(5,null,null),new BinaryTreeNode<>(15,null,null)),     //right
                                            new BinaryTreeNode<>(8,null,null));       //left
        
        // Act
        boolean result = BstSearch.contains(bigBinaryTreeNode, 5);
        // Assert
        assertTrue(result);
    }
}
