package com.example;

/**
 * Created by Jess on 2017/2/14.
 */

  class Node {
    private String data;
    private Node next;

    public  Node(String data){
        this.data = data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }
}
public class singleDirectionLinkedList {
  public static void main(String args[]){
      Node root = new Node("chetou");
      Node n1 = new Node("chexiang1");
      Node n2 = new Node("chexiang2");
      Node n3 = new Node("chexiang3");
      n3.setNext(root);
      root.setNext(n1);
      n1.setNext(n2);
      n2.setNext(n3);
      printNode(n2);
  }

    public static void printNode(Node node){
        System.out.print(node.getData()+"\t");
        if(node.getNext()!=null){
            printNode(node.getNext());
        };
    }
}