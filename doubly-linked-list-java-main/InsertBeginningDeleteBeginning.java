//doubly linked list 

class Node{
    int data;
    Node prev,next;
    
    //constructor 
    
    Node(int data){
      this.data = data;
      this.prev = null;
      this.next = null;
    }
}

public class InsertBeginningDeleteBeginning{
    Node head;
    // Node tail;
    
    
    
    public void insertAtBeg(int data){
          Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
           head= newNode;
    }
 
    // deleteatbeginning 
    
    public void deleteatbeginning(){
        if(head==null){
            return;
        }
        head = head.next;
    }
    

    
    
    public void display(){
        Node temp = head;
        System.out.print("null <->");
        while(temp!=null){
            System.out.print(temp.data + " <->");
            temp = temp.next;
            // temp.prev = null;
        }
        
        System.out.print("null");
    }

    
    public static void main(String[] args){
       InsertBeginningDeleteBeginning list = new InsertBeginningDeleteBeginning();
       list.insertAtBeg(10);
       list.insertAtBeg(20);
       list.insertAtBeg(30);
       list.insertAtBeg(40);
       list.insertAtBeg(50);
       list.deleteatbeginning();
              list.deleteatbeginning();
       
       list.display();
        
    }
    
}