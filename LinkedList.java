public class Node {
    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    Node head;

            public void append(int data){
            if(head == null){
                head = new Node(data);
                return;
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }

        public void prepend(int data){
            Node newNode = new Node(data);
            if(head == null){
                return;
            }
            newNode.next = head;
                head = newNode;      
        }


        public void delete(int data){
            if(head == null){ return;}

            if(head.data == data){
                  head = head.next;
                  return;
            }
            Node current = head;
            while(current.next != null){
                if(current.next.data == data){
                    current.next = current.next.next;
                }
                current.next = current;
            }
    
        }
}