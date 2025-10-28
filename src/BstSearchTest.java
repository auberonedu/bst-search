import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class BstSearchTest {
  
  public static <T> BinaryTreeNode<T> createSimpleBST(T rootVal, T leftVal, T rightVal) {
    BinaryTreeNode<T> left = new BinaryTreeNode<>(leftVal);
    BinaryTreeNode<T> right = new BinaryTreeNode<>(rightVal);
    BinaryTreeNode<T> root = new BinaryTreeNode<>(rootVal, left, right);
    return root;
  }

  @Test
  void testBasicTree() {
    BinaryTreeNode<Integer> root = createSimpleBST(10, 5, 15);
    assertTrue(BstSearch.contains(root, 5));
    assertTrue(BstSearch.contains(root, 10));
    assertTrue(BstSearch.contains(root, 15));
    assertFalse(BstSearch.contains(root, 3));
    assertFalse(BstSearch.contains(root, 8));
    assertFalse(BstSearch.contains(root, 11));
  }

}
