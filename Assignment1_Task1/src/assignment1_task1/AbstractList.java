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
public abstract class AbstractList<E> implements ListInterface<E> {
     public int sizeList; // this variable will represent the number of element in the list
    
        public boolean isEmpty() // this method check if the list is empty, element==0 return true else return false
        {
            if (sizeList>0)
            {
                return false;
            }
            return true;
        }
}
