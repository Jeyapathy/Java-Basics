import java.util.*;
public class SearchOperation
{
    static class SLLNode 
    {
        int data;
        SLLNode next;
        SLLNode(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
        static SLLNode insert(SLLNode head, int data) 
        {
            SLLNode newNode = new SLLNode(data);
            if (head == null) 
            {
                head = newNode;
            } 
            else 
            {
                SLLNode temp = head;
                while (temp.next != null) 
                {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            return head;
        }
        static int sll_search(SLLNode head,int search_val)
        {
           SLLNode curr=head;
           while(curr!=null)
           {
             if(curr.data==search_val)
             {
               return 1;
             }
             curr=curr.next;
           }
           return 0;
        }
    public static void main(String[] args) 
    {
        SLLNode head=null;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            int num=scan.nextInt();
            if(num==-1)
                break;
            head=insert(head,num);
        }
        int val =  scan.nextInt();
        System.out.printf("%s",(sll_search(head,val)==1)?"Element Found":"Element Not Found");
        scan.close();
    }
}