package com.example;

import java.util.LinkedList;

/**
 * Created by Jess on 2017/2/19.
 */
public class erChaShu {
    private int[] a = {2, 4, 5, 1, 7, 6, 8};
    private static LinkedList<Node> linkedList = null;

    public void createTree() {

        linkedList = new LinkedList<Node>();
        for (int i = 0; i < a.length; i++) {
            linkedList.add(new Node(a[i]));
        }

        for (int j = 0; j < a.length / 2 - 1; j++) {
            linkedList.get(j).left = linkedList.get(2 * j + 1);
            linkedList.get(j).right = linkedList.get(2 * j + 2);
        }

         linkedList.get(a.length / 2 - 1).left = linkedList.get(a.length - 1);
        if (a.length % 2 == 1)linkedList.get(a.length/2-1).right=linkedList.get(a.length/2);
    }

    public static void preXunBianLi(Node node) {
        if (node == null) return;
        System.out.print(node.data+"");
        preXunBianLi(node.left);
        preXunBianLi(node.right);
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int newdata) {
            this.data = newdata;
            this.left = null;
            this.right = null;
        }
    }




    public static void main(String args[]){
      erChaShu  shu = new erChaShu ();
        shu.createTree();
        Node root = linkedList.get(0);
        preXunBianLi(root);

}}