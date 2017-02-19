package com.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jess on 2017/2/14.
 */
public class BinTreeTraverse2 {
    private int[] array = {1,2,3,4,5,6,7,8,9};
    private static List<Node> nodeList = null ;

    private static class Node{
        Node leftchild;
        Node rightchild;
        int data;

        Node(int newData){
            leftchild = null;
            rightchild = null;
            data = newData;
        }
    }

    public void createBinTree(){

        nodeList = new LinkedList<Node>();
        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new Node(array[nodeIndex]));
        }

        for(int parentIndex=0; parentIndex<array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).leftchild = nodeList.get(parentIndex*2+1);
            nodeList.get(parentIndex).rightchild = nodeList.get(parentIndex*2+2);
        }

        int lastParentIndex = array.length /2 -1;
        nodeList.get(lastParentIndex).leftchild = nodeList.get(lastParentIndex*2+1);
        if(array.length % 2 ==1){
            nodeList.get(lastParentIndex).rightchild = nodeList.get(lastParentIndex * 2 +2);
        }
    }

    public static void preOrderTraverse(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        preOrderTraverse(node.leftchild);
        preOrderTraverse(node.rightchild);

    }

    public static void inOrderTraverse(Node node){
        if(node == null) return;
        inOrderTraverse(node.leftchild);
        System.out.print(node.data + "  ");
        inOrderTraverse(node.rightchild);
    }

    public static void postOrderTraverse(Node node){
        if(node == null) return;;
        postOrderTraverse(node.leftchild);
        postOrderTraverse(node.rightchild);
        System.out.print(node.data+"  ");


    }

    public static void main(String args[]){

    BinTreeTraverse2 binTree = new BinTreeTraverse2();
     binTree.createBinTree();
          // nodeList中第0个索引处的值即为根节点
         Node root = nodeList.get(0);
         System.out.println("先序遍历：");
         preOrderTraverse(root);
        System.out.println();

        System.out.println("中序遍历：");
        inOrderTraverse(root);
        System.out.println();

       System.out.println("后序遍历：");
        postOrderTraverse(root);

    }
}
