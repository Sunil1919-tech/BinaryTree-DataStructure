package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * purpose-lsting of numbers using Binary saerch Tree Operation
 * @author Sunil
 * @since 24/08/2021
 * @version 16.0
 */
public class BinaryTreeTest {
    @Test
    public void givenNumbers_WhenAddedToBST_ShouldReturnSize() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int result = myBinaryTree.search(63);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13,size);
        Assertions.assertEquals(63,result);
    }
}
