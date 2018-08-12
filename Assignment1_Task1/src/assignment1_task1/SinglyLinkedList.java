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
public class SinglyLinkedList<E> extends AbstractList<E> implements ListInterface<E> {
    
    Node<E> head; //head of Singly Linked List
    Node<E> tail; //tail of Singly Linked List
    public SinglyLinkedList()
    {
        sizeList=0;
        head=null;
        tail=null;
    }
    @Override
    public void add(E aCarPark) {
        if (this.isEmpty()==true)// if the list is empty
        {
            head= new Node(aCarPark);
            tail=head; //when list is empty tail and head point to the same object CarPark
        }
        else
        {
            tail.nextNode=new Node(aCarPark); //set nextNode to null 
            tail=tail.nextNode;
        }
        sizeList++; //increase the size of the list by 1
    }

    @Override
    public E remove(int index) {
        sizeCheck(index);
        E aCarPark= null;
        if (this.isEmpty()==false) // if the list is not empty
        {
            int index_node=0;
            if (index==0) //if we remove the headNode
            {
                aCarPark=head.aCarPark;
                head=head.nextNode;
            }
            else
            {
                Node<E> currentNode= head;
                while(index_node!=index-1) // move the currentNode to the Node before the Node that need to deleted
                {
                    index_node++;
                    currentNode= currentNode.nextNode;
                }
                Node<E> deletedNode= currentNode.nextNode; // initialise the Node pointer to Node that need to deleted
                aCarPark= deletedNode.aCarPark;
                currentNode.nextNode=deletedNode.nextNode; //point the address to the nextNode
            }   
            sizeList--; //decrease the size of the list by 1
        }
        return aCarPark;
    }

    @Override
    public boolean contains(E value) {
        if (this.isEmpty()==false)// if the list is not empty
        {
            Node<E> currentNode=head;
            do
            {
                if (CarPark.equals((CarPark)currentNode.aCarPark, (CarPark)value)==true) // if we found carpark with right registration number
                {
                    return true;
                }
                currentNode=currentNode.nextNode;
            }while(currentNode!=null);
        }
        return false;
    }

    @Override
    public int indexOf(E value) {
        if (this.isEmpty()==false)// if the list is not empty
        {
            int index_return=0;
            Node<E> currentNode=head;
            do
            {
                if (CarPark.equals((CarPark)currentNode.aCarPark, (CarPark)value)==true) // if we found carpark with right registration number
                {
                    return index_return;
                }
                currentNode=currentNode.nextNode;
                index_return++;
            }while(currentNode!=null); //while not reach the end of the node.
        }
        return -1;
    }

    @Override
    public void replace(int index, E value) {
        sizeCheck(index);
         if (this.isEmpty()==false)// if the list is not empty
        {
            int index_loop=0;
            Node<E> currentNode=head;
            while(index_loop<index) // cant index_loop<= index. because currentNode= head we already loop 1 element. in for loop mean i=0 already
            {
                currentNode=currentNode.nextNode;
                index_loop++;
            };
            currentNode.aCarPark=value; // set the new value;
        }
    }
    
    @Override
    public E get(int index) {
        sizeCheck(index);
        Node<E> currentNode=head;
        for(int i=1;i<=index;i++) // have to start from 1 . when we initialise currentNode= head. it mean i =0 already
        {
            currentNode=currentNode.nextNode;
        }
        return currentNode.aCarPark;
    }
    
    
    @Override
    public void traverse()
    {
        if (this.isEmpty()==false)// if the list is not empty
        {
            Node<E> currentNode=head;//track Node
            for(int i=0;i<sizeList;i++)
            {
                System.out.println((i+1)+": "+currentNode.aCarPark);
                currentNode=currentNode.nextNode;
            }
        }
    }
    
    /* Checks if the given index is in size of the list. */ 
    private void sizeCheck(int index) { 
        if (index >= sizeList || index < 0)  //index can't equal to sizeList because List index start from 0 index like array in this program.
            throw new IndexOutOfBoundsException("out Of Bound index");
    }


}
