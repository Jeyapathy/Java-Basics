class Stack{
    int [] a = new int[5]; //new size of an array
    int top = -1 ; // intially -1 
    
    public void push(int data){
        if(top==a.length-1){
            System.out.println("Stack is overflow");
        }
        else{
            top++;
            a[top] = data;
        }
    }
    
    //pop method 
    
    public void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("Deleted elements :" + a[top]);
            top--;
        }
    }
    
   // peek method 
   
   public void peek(){
       if(top==-1){
           System.out.println("Stack is underflow");
       }
       else {
           System.out.println("Top of the element :" + a[top]);
       }
   }
  
  //display method 
  
  public void display(){
      if(top==-1){
          System.out.println("Stack is underflow");
      }
      for(int i=top; i>=0; i--){
          System.out.println(a[i]);
      }
  }
 
}
public class Main{
    public static void main(String[] args){
       Stack operations = new Stack();
       
      operations.push(10);
      operations.push(20);
      operations.push(30);
      operations.push(40);
      operations.push(50);
      operations.push(60);
       
      operations.pop();
      operations.peek();
       
       operations.display();
       
    }   

}



