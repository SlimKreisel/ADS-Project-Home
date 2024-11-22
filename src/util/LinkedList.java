package util;
/**
 *File Name:
 *Author: Khalid Roble
 *Student Number:C23727729
 *Description of the class:
 */
//This class implements the ADT definition of a linked list using the same signatures. Note that we can add extra methods
//here once all of the methods listed in the ADT interface are included.

public class LinkedList<T> implements LinkedListADT<T> {
	
	 private int count;  // the current number of elements in the list
	 private LinearNode<T> front; //pointer to the first element 
	 private LinearNode<T> last; //pointer to the last element 
	 
	 //-----------------------------------------------------------------
	 //  Creates an empty list.
	 //-----------------------------------------------------------------
	    public LinkedList()
	    {
	       this.count = 0;
	       this.last = null;
	       this.front = null;
	    }

	    
	  //  Adds one element to the end of this list
	   public void add (T element)
	   {      
		   LinearNode<T> node = new LinearNode<T> (element); // creates another node and passes in the element that you store in
       
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.front = node; // first node
			 	this.count++;
		   }//end if
		   else
		     { 
				  last.setNext(node); // add node to the end of the list. Update the next part of the last/current node to the address/box of the new created node
				  last = node; // now make this the new last node. The arrow of the last LAST would go now to the new node
			     
				  this.count++;   
		      } //end else
	   }
	   
	 //Adds the element in its correct sorted position in the list
	   public void add(T element,int position) {
		   LinearNode<T> node = new LinearNode<T> (element); 
		   LinearNode<T> current = null;
		   int currentposition = 1;
				   
		   if(position<=1||this.front==null) {
			   node.setNext(front);
			   front = node;
			 
			   if (last == null) {
		            last = node; // Update last if this is the only node in the list
		        }
		   }
		   else if(position>size()) {
			   last.setNext(node);
			   last = node;
			  
		   }
		   else  {
			   current=front;
			   while(current.getNext() != null && currentposition < position - 1) {
				   current = current.getNext();
				   currentposition++;
			   }
			   node.setNext(current.getNext());
			   current.setNext(node);
			   
			  
		   }
		   count++;
	   }
	   
	   
	 /** // Adds one element to the start of the list
	   public void add(T element){
		   LinearNode<T> node = new LinearNode<T>(element);
		 
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.front = node; // first node
			 	this.count++;
		   }//end if
		   else {
			   
			   node.setNext(this.front); // The new node points to the current front
			   front = node; // Update front to be the new node
			   this.count ++;
		   }
	   }*/
	   
	   

	   //  Removes and returns the first element from this list
	
	 public T remove()
	   {
		   LinearNode<T> temp = null;
		   T result = null;
			if (isEmpty()) {
				System.out.println("There are no nodes in the list");
			}//end if
			else {
				
				result = this.front.getElement();//the t result will have a copy of the element/data of the first node 
				temp = this.front;// This first original node is know set to temp, because we need to remove it professionally( garbage collection (automatic memory management).).
				this.front = this.front.getNext();// We then change this.front to point to the second node in the list, making it the new first node. 
				temp.setNext(null); //dereference/completely removing the original first element. we remove any references to the node. This allows Java’s garbage collector to clear it from memory if no other references exist.
				count--;
			}//end else
			return result;

	   }
	
	
	// removes and return the elements in different scenario
	public T removeEverything(T element)  {
		LinearNode<T> current =null;
		LinearNode<T>previous =null;
		T result = null;
		
		//Check if the current node does not contain the element and we've reached the end
		for(current= this.front; current!=null;current = current.getNext()) {
			  if(!current.getElement().equals(element)) {
				  
				  previous =current; // Update previous to be the current node
			  }
			 
				  
			  
			  else {
				  if(current==this.front) {//The element is at the start of the list
					  LinearNode<T> temp = null;
					  result = this.front.getElement();//the t result will have a copy of the element/data of the first node 
						temp = this.front;// This first original node is know set to temp, because we need to remove it professionally( garbage collection (automatic memory management).).
						this.front = this.front.getNext();// We then change this.front to point to the second node in the list, making it the new first node. 
						temp.setNext(null); //dereference/completely removing the original first element. we remove any references to the node. This allows Java’s garbage collector to clear it from memory if no other references exist.
						count--;
						return result;
				  }
				  
				  else if(current==this.last) {//The element is at the end of the list
					  LinearNode<T> temp = null;
					 
					  result = this.last.getElement();
						temp = this.last;
						this.last = previous; // Update last to the second-last node
						temp.setNext(null);  //dereference/completely removing
						count--;
						return result;
				  }
				  
				  else if(previous!=null) {//The element is somewhere in the middle of the list
					  LinearNode<T> temp = null;// Temporary variable to hold the node to be removed.
					  result = current.getElement();// Store the element from the current node to return after removal.
					  temp = current; // Assign the current node to temp so we can safely disconnect it.
					  previous.setNext(current.getNext()); // Bypass the current node by linking the previous node directly to the node after current.
					  temp.setNext(null);// Disconnect the current node from the list by setting its next reference to null.
					  count--;
					  return result;
				  }
			  }
		}
		return null;
	}

	  
	   //  Returns true if this list contains no elements
	   public boolean isEmpty()
	   {
		   if (this.front == null)
			   return true;
		   else
			   return false;
	   }


	   //  Returns the number of elements in this list
	   public int size()
	   {
		   return this.count;
	   }
	   

	  public T get(int i) {
		  if(i<0) {
			  return null;
		  }
		  LinearNode<T> search = this.front;
		  
		  int index = 0;
		  for(index=0; search!=null; index++) {
			 if(index==i) 
				 return search.getElement();
			 
			 search = search.getNext();
			
		  }
		  return null;
		  
	  }
	  
	  public boolean contains(T element) {
		  LinearNode<T> look ;
		  
		  for(look= this.front; look!=null;look = look.getNext()) {
			  if(look.getElement().equals(element))
			  return true;
			  
		  }
		  return false;
		  
		  
		 
	  }
	  

	   //  Returns a string representation of this list
	public String toString()
	   {
		   LinearNode<T> current = null;
		   String fullList = "";
		   /**
		    * This is a loop that does three things: Start: Sets current to the first node in the list (this.front).
			Condition: Runs the loop as long as current is not null (meaning there are still nodes left to check).
			Update: Moves current to the next node in the list with current.getNext() after each iteration.
		    */
		   for (current = this.front; current != null; current = current.getNext())// for loops has three parts: 1. initialize the element with something or where it should start. then make a condition, 3. make a next step condition. the loop will only end with the first condition is fulfilled.
		   {
			   fullList = fullList + "\n" + current.getElement().toString();
		   }//end for
		   
		   return fullList + "\n";
	   }

}
