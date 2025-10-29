import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public <T> void simpleTree(){
        BinaryTreeNode<Integer> nodeOne = new BinaryTreeNode<>(30);
        BinaryTreeNode<Integer> nodeTwo = new BinaryTreeNode<>(40);
        BinaryTreeNode<Integer> nodeThree = new BinaryTreeNode<>(35, nodeOne, nodeTwo);
        BinaryTreeNode<Integer> nodeFour = new BinaryTreeNode<>(75);
        BinaryTreeNode<Integer> nodeFive = new BinaryTreeNode<>(85);
        BinaryTreeNode<Integer> nodeSix = new BinaryTreeNode<>(80, nodeFour, nodeFive);
        BinaryTreeNode<Integer> nodeRoot = new BinaryTreeNode<>(50, nodeThree, nodeSix);
        boolean returned = BstSearch.contains(nodeRoot, 40);
        assertTrue(returned);
    }
}