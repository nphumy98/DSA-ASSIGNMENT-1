/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_task1;

/**
 *
 * @author wrk2544
 * @param <E>
 */
public class Node<E> {
    public E aCarPark; //carPark in the node
    public Node<E> nextNode; //reference to next Node 
    
    public Node(E aCarPark, Node<E> nextNode)
    {
        this.aCarPark=aCarPark;
        this.nextNode=nextNode;
    }
    
    public Node(E aCarPark) // to add an element to the tail of the list
    {
        this.aCarPark=aCarPark;
        this.nextNode=null; // set nextNode to null
    }
    
    
    
    
}