package com.example.mike.fridaytest;

import java.util.ArrayList;

public class CustomBinaryTree {

    private Node root = new Node();

    public void add(int value){
        root.addNewNode( new Node(value));
    }

    public ArrayList<Integer> preOrderTraverse(){
        return root.preOrderTraverse();
    }

    @Override
    public String toString() {
        return preOrderTraverse().toString();
    }

    private class Node{
        private Node leftNode;
        private Node rightNode;
        private Integer value;

        public Node(int value){
            this.setValue(value);
        }

        public Node(){
            this.setValue(null);
        }

        private void addNewNode( Node n ){
            if ( this.getValue() == null ){
                this.setValue( n.getValue() );
            }else if ( this.getValue() < n.getValue() ){
                if ( this.getRightNode()==null ){
                    this.setRightNode( n );
                }else{
                    this.getRightNode().addNewNode(n);
                }
            }else if ( this.getValue() > n.getValue() ){
                if ( this.getLeftNode() == null ){
                    this.setLeftNode( n );
                }else{
                    this.getLeftNode().addNewNode(n);
                }
            }
        }

        private Node searchFor( int value ){
            if( this.getValue() == value ){
                return this;
            }else if ( this.getValue() < value ){
                return this.getLeftNode().searchFor(value);
            }else{
                return this.getRightNode().searchFor(value);
            }
        }

        private ArrayList<Integer> preOrderTraverse(){
            ArrayList<Integer> res = new ArrayList<>();
            if ( this.getValue() != null ){
                res.add( this.getValue() );
            }
            if ( this.getLeftNode() != null ){
                res.addAll( this.getLeftNode().preOrderTraverse() );
            }
            if ( this.getRightNode() != null ){
                res.addAll( this.getRightNode().preOrderTraverse() );
            }
            return res;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

    }

}
