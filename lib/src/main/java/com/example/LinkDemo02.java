package com.example;

/**
 * Created by Jess on 2017/2/15.
 */
class Link {

    private Node root;
    class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        public void add(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.add(newNode);
            }
        }

        public void print(){
            System.out.print(this.data+"\t");
            if(this.next != null){
                this.next.print();
            }
        }

        public Boolean search(String data){
            if(data.equals(this.data)){
                return true;
            }else{
                if(this.next!=null){
                    return  this.next.search(data);
                }else {
                    return false;
                }
            }
        }

        public void delete(Node previous,String data){
            if(data.equals(this.data)){
                previous.next =this.next;
            }else{
                if(this.next != null) this.next.delete(this,data);
            }
        }
    };


    public void addNode(String data){
        Node newNode = new Node(data);
        if(this.root==null){
            this.root = newNode;
        }else {
            this.root.add(newNode);
        }
    }

    public void printNode(){

        if(this.root != null){
            this.root.print();
        }
    }

   public Boolean contains(String data){
       return this.root.search(data);
   }

    public void deleteNode(String data){
        if(this.contains(data)){

            if(root.data==data){
                root.data=root.next.data;
                root.next=root.next.next;
            }else {
                this.root.next.delete(root,data);
            }
        }
    }


}



public class LinkDemo02{
    public static void main(String args[]){
        Link l = new Link();
        l.addNode("A");
        l.addNode("B");
        l.addNode("C");
        l.addNode("D");
        l.addNode("E");
        l.printNode();

        System.out.println(l.contains("A"));
        l.deleteNode("A");
        l.printNode();
        System.out.println(l.contains("A"));
    }
}