package org.datastructures.trees.binarysearchtree;

public class BinarySearchTree {

    BSTNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        BSTNode newNode = new BSTNode(value);

        if (this.root == null) {
            this.root = newNode;
        }else {
            BSTNode currentNode = this.root;

            while (true) {

                if ( value < currentNode.value) {
                    //Left
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }else {
                        currentNode = currentNode.left;
                    }
                } else {
                    //Right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }



    }

    //return the node it is looking for or null if not
    public BSTNode lookup(int value) {

        if (this.root == null) {
            return null;
        }

        BSTNode currentNode = this.root;

        while (currentNode != null) {

            if (value < currentNode.value) {
                currentNode = currentNode.left;
            }else if (value > currentNode.value) {
                currentNode = currentNode.right;
            }else {
                return currentNode;
            }
        }
        return null;
    }

    public void remove(int value) {

    }

    public void printTree(BSTNode root) {
        if (root == null) return;
        System.out.println(root.value);
        printTree(root.left);
        printTree(root.right);
    }



}
