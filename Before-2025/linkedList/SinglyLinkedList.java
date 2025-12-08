package linkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public Node(){
    }
}





public class SinglyLinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node secNode = new Node(3);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(7);

        head.next = secNode;
        secNode.next = thirdNode;
        thirdNode.next = fourthNode;
    
        Node current = new Node();
        current = head;

        int length = SinglyLinkedList.lengthOfList(current);
        System.out.println("Length of the list is : "+length);

        SinglyLinkedList.display(current);

        head = SinglyLinkedList.createNodeAtFront(head, 34);
        SinglyLinkedList.display(head);

        head = SinglyLinkedList.insertEnd(head, current,45);
        SinglyLinkedList.display(head);

        head = SinglyLinkedList.insertAtPosition(2, head,12);
        SinglyLinkedList.display(head);

        head = SinglyLinkedList.deleteFirst(head);
        SinglyLinkedList.display(head);

        head = SinglyLinkedList.deleteLast(head);
        SinglyLinkedList.display(head);

        head = SinglyLinkedList.deleteAtPosition(2, head);
        SinglyLinkedList.display(head);

        SinglyLinkedList.searchElement(5, head);

        head = SinglyLinkedList.reverseList(head);
        SinglyLinkedList.display(head);

        head = SinglyLinkedList.lastNthNode(head, 2);
        System.out.println(head.data);




    }




    

    // length of the list
    public static int lengthOfList(Node current){
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //display list elements
    public static void display(Node current){
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null\n");
    }

    //insert new node at beginning
    public static Node createNodeAtFront(Node head, int i){
        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;

        return head;
    }

    //insert at end
    public static Node insertEnd(Node head,Node current, int i){
        Node newNode = new Node(i);
        newNode.next = null;

        if(head == null){
            head = newNode;
            return head;
        }
        current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }


    //insert at position
    public static Node insertAtPosition(int pos,Node head, int i){
        Node newNode = new Node(i);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }
        else{
            Node prev = head;
            int count = 1;
            while(count < pos - 1){
                prev = prev.next;
                count++;
            }
            Node after = prev.next;
            prev.next = newNode;
            newNode.next = after;
            return head;
        }
    }


    //delete first
    public static Node deleteFirst(Node head){
        if(head == null)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }


    //delete last
    public static Node deleteLast(Node head){
        if(head == null)
            return null;
        Node current = head;
        Node prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return head;

    }


    //delete at pos
    public static Node deleteAtPosition(int pos, Node head){
        if(pos == 1){
            head = head.next;
            return head;
        }
        else{
            Node prev = head;
            Node after = null;
            int count = 1;
            while(count < pos - 1){
                prev = prev.next;
                count++;
            }
            after = prev.next.next;
            prev.next = after;
            return head;
        }
    }

    //search elements 
    public static void searchElement(int key, Node head){
        Node current = head;
        int pos = 1;
        while(current != null){
            if(current.data == key)
                System.out.println("key present at pos "+pos);
            current = current.next;
            pos++;
        }
    }

    //reverse List
    public static Node reverseList(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    //find nth node from last
    public static Node lastNthNode(Node head, int n){
        Node main = head;
        Node ref = head;
        int count = 0;
        while(count < n){
            ref = ref.next;
            count++;
        }

        while(ref != null){
            ref = ref.next;
            main = main.next;
        }
        return main;

    }
}
