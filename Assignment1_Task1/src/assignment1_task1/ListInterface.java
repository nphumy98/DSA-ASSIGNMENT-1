/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_task1;

/**
 *
 * @author wrk2544
 */
public interface ListInterface<E> {
    public void add(E value); //add a carPark at the end of the list
    // pre: 0 <= index < size()
    // post: adds value at ith index of the List
    public E remove(int index); 
    // pre: 0 <= index < size()
    // post: removes and returns object found at that location
    public boolean contains(E value);
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    public int indexOf(E value);
    // pre: value is not null
    // post: returns (0-origin) index of value,
    // or -1 if value is not found
    public void replace(int index, E value);
    // pre: 0 <= index < size()
    // post: sets ith entry of list to value,
    public E get(int index);
    // pre: 0 <= index < size()
    // post: return the ith element in the list
    public void traverse();
    //post: traverse all the node in the list
}
