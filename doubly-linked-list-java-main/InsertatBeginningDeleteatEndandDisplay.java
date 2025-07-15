//doubly linked list 

class Node
{
    int data;
    Node prev,next;
    
    //constructor 
    
    Node(int data){
      this.data = data;
      this.prev = null;
      this.next = null;
    }
}

public class InsertatBeginningDeleteatEndandDisplay
{{
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
 //insert at end
 public void deleteAtend(){
     if(head == null){
         System.out.println("List is empty");
         return;
     }
     if(head.next==null){
         head = null;
         return;
     }
     Node temp = head;
     while(temp.next !=null){
         temp=temp.next;
     }
     temp.prev.next=null;
     temp.prev=null;
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
       DLL list = new DLL();
       list.insertAtBeg(10);
       list.insertAtBeg(20);
       list.insertAtBeg(30);
       list.insertAtBeg(40);
       list.insertAtBeg(50);
    //   list.deleteatbeginning();
    //   list.deleteatbeginning();
      list.deleteAtend();
      list.deleteAtend();
       list.display();
             
    }
    
}
