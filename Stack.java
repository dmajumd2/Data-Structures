public static class Stack{

    public static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        return top.data;
    }

    public void push(int data){
        Node newNode = new Node();
        if(top == null) throw new NullPointerException();
        else 
            newNode.next = top;
            top = newNode;
    }

    public int pop(){
        int data = top.data;
        if(top == null) throw new NullPointerException();
        
        top = top.next;
        return data;
    }
}