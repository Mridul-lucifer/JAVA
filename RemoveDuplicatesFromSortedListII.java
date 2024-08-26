package GitHub;
import java.util.*;
class Node{
    int val ;
    Node next ;

    Node(int val){
        this.val = val;
        next = null;
    }
}
public class RemoveDuplicatesFromSortedListII {
    static Scanner scn = new Scanner(System.in);

    public static Node input(){
        System.out.print("Enter the size : ");
        int n = scn.nextInt();
        System.out.print("Enter the values : ");
        int data = scn.nextInt();
        Node head = new Node(data);
        Node temp = head ;
        for (int i = 1; i < n; i++) {
            data = scn.nextInt();
            temp.next = new Node(data);
            temp = temp.next;
        }
        return head;
    }
    public static void print(Node head){
        System.out.print("Values are : ");
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static Node code(Node temp){
        Node head = new Node(0);
        head.next = temp ;
        Node a , b  , c;
        a = head ;
        b = head.next;
        while(b!=null && b.next != null){
            c = b.next;
            if(b.val==c.val){
                int remove = b.val;
                while(b!=null && b.val==remove){
                    b = b.next;
                }
                a.next = b ;
            }else{
                a = b ;
                b = b.next;
            }
        }
        return head.next;
    }
    public static void main(String[] args) {
        Node head = input();
        print(head);
        Node unique = code(head);
        print(unique);
    }
}
