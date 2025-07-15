class stack{
    int data;
    stack next;
    
    //constructor 
    stack(int data){
    this.data = data;
    this.next = null;
    }
}

class stackone{
    
    stack top;
    
    public void push(int data){
        stack newNode = new stack(data);
        newNode.next = top;
        top = newNode;
    }
    
    
    public boolean isEmpty(){
        return top ==null;
    }
    
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("Top of the elements :" + top.data);
        }
    }

    public void pop(){
        if(isEmpty()){
            return;
        }
        else{
            System.out.println("Deleted element :" + top.data);
            top = top.next;
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        stack temp = top;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class LinkedlistwithStack{
    public static void main(String[] args){
        stackone operations = new stackone();
        operations.push(10);
        operations.push(20);
        operations.push(30);
        operations.push(40);
        operations.push(50);
        operations.pop();
        
        operations.peek();
        
        operations.display();
    }
}
