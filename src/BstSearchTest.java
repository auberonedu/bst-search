import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest<T> {
    BinaryTreeNode<Integer> rootInt = new BinaryTreeNode<Integer>(2,
        new BinaryTreeNode<>(1, null, null),
        new BinaryTreeNode<>(3, null, null));

    BinaryTreeNode<Character> rootNum = new BinaryTreeNode<Character>('b',
        new BinaryTreeNode<>('a', null, null),
        new BinaryTreeNode<>('c', null, null));

    @Test
    public void testIfOneExistsInTree() {
        
    }
}
