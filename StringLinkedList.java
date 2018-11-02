package com.example.mike.fridaytest;

public class StringLinkedList {

    private Node node;

    public StringLinkedList(String s){

        node = new Node();
        node.setData( s.charAt(0) );

        for (int i = 1; i < s.length(); i++) {
            node.put( s.charAt(i) );
        }
    }

    public char get(int index) throws Exception {
        Node foundNode = node.get(index);

        if ( foundNode == null ){
            throw new Exception("Out of bounds");
        }
        return foundNode.getData();
    }

    public void put(char c){
        node.put(c);
    }

    public int size(){
        return node.getLastIndex()+1;
    }

    public void remove(int index) throws Exception {
        if ( index == 0 ){
            this.node = this.node.getNext();
            return;
        }
        if ( index == this.size()-1 ){
            this.node.get( index-1 ).setNext(null);
            return;
        }
        Node nodeBefore = this.node.get(index-1);
        Node nodeAfter = nodeBefore.get(2);
        nodeBefore.next = nodeAfter;
    }

    private class Node {

        private Node next;
        private char data;

        public Node(Node next, char data) {
            this.next = next;
            this.data = data;
        }

        public Node(){

        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }

        public char getData() {
            return data;
        }

        public void setData(char data) {
            this.data = data;
        }

        private int getLastIndex(int i){
            if( this.getNext() == null ){
                return i;
            }else{
                return this.getNext().getLastIndex(i+1);
            }
        }

        public int getLastIndex(){
            return getLastIndex(0);
        }

        public Node get(int index){
            Node result = this;
            for (int i = 0; i < index; i++) {
                if ( result.getNext() == null ){
                    return null;
                }
                result = result.getNext();
            }
            return result;
        }

        public void put(char c){
            if ( this.getNext() == null ){
                Node newNode = new Node();
                newNode.setData(c);
                this.setNext( newNode );
            }else{
                this.getNext().put(c);
            }
        }
    }

}
