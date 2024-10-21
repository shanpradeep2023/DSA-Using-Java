package linkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedMore {

    public Node createNodes(){
        Node head = new Node(10);
        Node n2 = new Node(12);
        Node n3 = new Node(12);
        Node n4 = new Node(30);
        Node n5 = new Node(33);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return head;
    }

    public Node createNodes2(){
        Node head = new Node(11);
        Node n2 = new Node(13);
        Node n3 = new Node(15);
        Node n4 = new Node(29);
        Node n5 = new Node(34);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return head;
    }

    public void display(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void removeDuplicateElements(Node head){
        Node current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else
                current = current.next;
        }
        display(head);
    }

    public Node insertAtSorted(Node head, int data){
        Node newNode = new Node(data);
        Node current = head;
        Node temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;
        return head;

        
    }

    public void removeKeyElement(Node head, int key){
        Node current = head;
        Node temp = null;
        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        temp.next = current.next;

        display(head);
    }

    public Node mergeSortedList(Node h1, Node h2){
        Node dummy = new Node(0);
        Node current = dummy;
        while(h1 != null && h2 != null){
            if(h1.data <= h2.data){
                current.next = h1;
                h1 = h1.next;
            }
            else{
                current.next = h2;
                h2 = h2.next;
            }
            current = current.next;
            
        }
        if(h1 == null)
                current.next = h2;
            
        else    
            current.next = h1;
        return dummy.next;
    }

    public static void main(String args[]){
        SinglyLinkedMore s = new SinglyLinkedMore();
        Node head = s.createNodes();
        Node head2 = s.createNodes2();

        s.display(head);
        s.removeDuplicateElements(head);

        head = s.insertAtSorted(head,31);
        s.display(head);

        s.removeKeyElement(head, 33);

        head = s.mergeSortedList(head, head2);
        s.display(head);
    }

    
}
