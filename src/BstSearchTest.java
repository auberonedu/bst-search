import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class BstSearchTest {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(18,  new BinaryTreeNode<Integer>(14, new BinaryTreeNode<Integer>(10, null, null),  new BinaryTreeNode<Integer>(17, null, null)),  new BinaryTreeNode<Integer>(20, null, new BinaryTreeNode<Integer>(43, null ,null)));

    @Test
    public void testDfsContainsValueTrue(){
        BstSearch test = new BstSearch();

        boolean actual = test.dfsContains(root, 14);

        assertTrue(actual);
    }

    @Test
    public void testDfsContainsValueFalse(){
        BstSearch test = new BstSearch();

        boolean actual = test.dfsContains(root, 16);

        assertFalse(actual);
    }

    @Test
    public void testDfsContainsValueNullTarget(){
        BstSearch test = new BstSearch();

        NullPointerException exception = assertThrows(
            NullPointerException.class, () -> { test.dfsContains(root, null); }
        );

    }

    @Test
    public void testDfsContainsValueIsRoot(){
        BstSearch test = new BstSearch();

        boolean actual = test.dfsContains(root, root.data);

        assertTrue(actual);
    }

    @Test
    public void testDfsContainsValueNullRoot(){
        BstSearch test = new BstSearch();

        boolean actual = test.dfsContains(null, 18);

        assertFalse(actual);
    }
}
