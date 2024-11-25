//Abstract Data Type definition for a Linked List

//Note that this is not a full definition as we are only implementing some
//of the standard functions associated with a list.
 
package util;
/**
 *File Name: LinkedListADT
 *Author: Khalid Roble
 *Student Number:C23727729
 *Description of the class: this class shows the abstract data type definition for the linked list
 */

public interface LinkedListADT <T>
	{
	   //  Adds one element to the start or end of this list
	   public void add (T element);
	   
	   //Adds the element in its correct sorted position in the list
	   public void add(T element,int position);

	   //  Removes and returns the first element from this list
	   public T remove();
	   
	   // removes and return the elements in different scenario
	   public T removeEverything(T element);
  
	   //  Returns true if this list contains no elements
	   public boolean isEmpty();

	   //  Returns the number of elements in this list
	   public int size();

	   //  Returns a string representation of this list
	   public String toString();
	   
	   // it gets the element at the specified index
	   public T get(int i);
	   
	// Check if the specified element exists in the linked list
	   public boolean contains(T element);
	   
	// Returns the first node of the linked list
	   public LinearNode<T> returnFirstNode();
	   
	// return the last node of the linked list
	   public LinearNode<T> returnLastNode();
	   
	   // Return the element stored in the first node of the linked li
	   public T getFirstElement();
	   
	   // Return the element stored in the last Node of the linked List
	   public T getLastElement();
	   
	// Returns the element stored in the node following the specified node
	   public T getNextElement(LinearNode <T> current);
	

}
