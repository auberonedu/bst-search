import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest<T> {
    BinaryTreeNode<Integer> rootIntComplex = new BinaryTreeNode<Integer>(27,
        new BinaryTreeNode<>(8,
            new BinaryTreeNode<>(2, null, null),
            new BinaryTreeNode<>(19, null, null)),
        new BinaryTreeNode<>(67,
            new BinaryTreeNode<>(31, null, null),
            new BinaryTreeNode<>(92, null, null)));

    BinaryTreeNode<Integer> rootInt = new BinaryTreeNode<Integer>(2,
        new BinaryTreeNode<>(1, null, null),
        new BinaryTreeNode<>(3, null, null));

    BinaryTreeNode<Character> rootChar = new BinaryTreeNode<Character>('b',
        new BinaryTreeNode<>('a', null, null),
        new BinaryTreeNode<>('c', null, null));

    BinaryTreeNode<String> rootString = new BinaryTreeNode<>("man",
        new BinaryTreeNode<>("animal", null, null),   
        new BinaryTreeNode<>("zoo", null, null));  


    @Test
    public void testIf15ExistsInTree() {
        BstSearch search = new BstSearch();
        Boolean actual = search.contains(rootIntComplex, 15);
        assertFalse(actual);
    }
    @Test
    public void testIf167ExistsInTree() {
        BstSearch search = new BstSearch();
        Boolean actual = search.contains(rootIntComplex, 67);
        assertTrue(actual);
    }
    @Test
    public void testIfOneExistsInTree() {
        BstSearch search = new BstSearch();
        Boolean actual = search.contains(rootInt, 1);
        assertTrue(actual);
    }
    @Test
    public void testIfFourExistsInTree() {
        BstSearch search = new BstSearch();
        Boolean actual = search.contains(rootInt, 4);
        assertFalse(actual);
    }
    @Test
    public void testIfCharAExistsInTree() {
        BstSearch search = new BstSearch();
        Boolean actual = search.contains(rootChar, 'a');
        assertTrue(actual);
    }
    @Test
    public void testIfCharDExistsInTree() {
        BstSearch search = new BstSearch();
        Boolean actual = search.contains(rootChar, 'd');
        assertFalse(actual);
    }
    
    @Test
    public void testIfStringExistsInTreeReturnsTrue() {
       assertTrue(BstSearch.contains(rootString, "animal"));
    }

     @Test
    public void testIfStringDExistsInTreeReturnsFalse() {
       assertFalse(BstSearch.contains(rootString, "dog"));
    }
    
    @Test
    public void testIfThrowsNullPointTargetNull() {
        assertThrows(NullPointerException.class, () -> {BstSearch.contains(rootChar, null);
        });
    }
  

   @Test
    public void testNullRootReturnsFalse() {
        assertFalse(BstSearch.contains(null, 'd'));
    };

}
