import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
          data = d;
          next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
          Node new_node = new Node(new_data);
 
    /* 3. Make next of new Node as head */
         new_node.next = head;
 
    /* 4. Move the head to point to new Node */
         head = new_node;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.isEmpty()){
                  new_node = head;
        }
            // Else traverse till the last node 
        else{    // and insert the new_node there 
        
          while(head.next!=empty()){
           head = head.next();
          }
      
          head.next = new_node;
          
        }
         // Insert the new_node at last node 
        // Return the list by head 
        return head;
        }
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
      while(head.next != null()){
           System.out.println(head.data);
           head = head.next();
          }
            // Print the data at current node 
       
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
