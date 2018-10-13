/**************************************************************************
 * @author Bridget Trenchard
 * May 31, 2018
 * George Mason University
 * 
 * File Name: Knowledge.java
 * 
 ***************************************************************************/

import java.util.Iterator;

public class Knowledge<T> implements Iterable<T>
{
  
 /*
  * Class that represents a Node in a linked list
  * 
  * Fields
  * value: the value that is stored in the Node
  * next: the next node in the linked list
  */
  private class Node<T>
  {
    T value;  
    Node<T> next;
    
    public Node(T value)
    {
      this.value = value;
      this.next = null;
    }
    
 }
  
 /*
  * Feilds
  * *************************************************************************
  * head: the first node in the linked list
  * tail: the last node in the linked list
  * size: the amount of nodes in the linked list
  */
  private Node<T> head; 
  private Node<T> tail;  
  private int size; 
  /*
   * Constructor
   * *************************************************************************
   * Sets the initial size to 0
   */
 public Knowledge()
 {
   size = 0;
 }

 /*
  * Add a new node to the end of the linked list to hold value
  * O(1)
  * 
  * @param value, generic variable that is added to the linked list
  */
 public void add(T value)
 {
   Node<T> val = new Node<T>(value);
   val.next = head;
   head = val;
   size++;
   
 }
 
 /*
  * Removes the first occurance of the given value in the linked list
  * O(N) where N is the number of nodes returned by size()
  * 
  * @param value, generic variable that is removes to the linked list
  * @return (boolean) true if value was in the linked list and was removed, otherwise false
  */
 @SuppressWarnings("unchecked")
 public boolean remove(T value)
 {
   Node<T> current = head;
   Node<T> previous = tail;
   
   for (int i = 0; i < size(); i++)
   {
     if (current.value.equals(value))
     {
       if(current == head)
       {
         head = head.next;
         size--;
         return true;
       }
       previous.next =current.next;
       size--;
       return true;
     }
     
     previous = current;
     current = current.next;
   }
   return false;
 }
 
  /*
  * Returns the index of where the given value is in the linked list
  * O(N)
  * 
  * @param value, generic variable that is being searched for in the linked list
  * @return (integer) the index of value or -1 if value was not in the linked list
  */
 public int indexOf(T value)
 {
   Node<T> current = head;
   
   for (int i = 0; i < size; i++)
   {
     if (current.value.equals(value))
     {
       return i;
     }
     current = current.next;
   }
   return -1;
 }

 /*
  * Indicates if the given value is in the linked list
  * O(N) where N is the number of nodes returned by size()
  * 
  * @param value, generic variable that is being searched for in the linked list
  * @return (boolean) true if value was in the linked list, otherwise false
  */
 public boolean contains(T value)
 {
   if(indexOf(value) == -1)
   {
     System.out.println("Contains false");//REMOVE
     return false;
   }
   else
   {
     System.out.println("Contains true");//REMOVE
     return true;
   }
 }

 /*
  * Searches for the given value in the linked list
  * O(N) where N is the number of nodes returned by size()
  * 
  * @param value, generic variable that is being searched for in the linked list
  * @return (T) returns the value found in the linked list, if value is not found, it will return false
  */
 public T get(T value)
 { 
   Node<T> current = head;
   
   for (int i = 0; i < size; i++)
   {
     if (current.value.equals(value))
     {
       return current.value;
     }
     current = current.next;
   }
  return null;
 }
 
 /*
  * Returns the amount of nodes are in the linked list
  * O(1)
  * 
  * @return (int) size, the amount of nodes in the linked list
  */
 public int size()
 {
  return this.size;
 }
 
 public String toString()
 {
   String str = "";
   Iterator<T> itr = this.iterator();
   while(itr.hasNext())
   {
     str += itr.next().toString();
   }
   return str;
 }

 /*
  * A iterator that is used to cycle through the linked list outside of the SimpleList class
  * 
  * @return a basic iterator
  */
 public Iterator<T> iterator()
 {
   Iterator<T> iter = new Iterator<T>() 
   {
     private Node current = head;
     
     /*
      * Checks to see if the current node has a next node
      * O(1)
      * 
      * @return (boolean) true if the current node is not the tail, otherwise false
      */
     @Override
     public boolean hasNext() 
     {
       return current != null;
     }
     
     /*
      * Returns the node after te currentnode in the linked list
      * O(1)
      * 
      * @return (T) the next node
      */
     @SuppressWarnings("unchecked")
     @Override
     public T next() 
     {
       T val = (T) current.value;
       current = current.next;
       return val;
     }
   };
   return iter;
 }
}