public class CircularLinkedList implements LinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node gotoNodeIndex(int index){
        Node current = head;

        for (int i= 0; i < index;i++){
            current = next(current);
        }
        return current;
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        if (index < 0 ) return -1;

        Node current = gotoNodeIndex(index);
        return current.value;
    

    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);

        if (size == 0){
            head = newNode;
            head.next= newNode;
        }else{
            Node tail = gotoNodeIndex(size - 1);
            tail.next = newNode;
            newNode.next= head;
        }
        size++;

    }

    @Override
    public void remove(int index) {
        if (index == 0){
            Node tail = gotoNodeIndex(size-1 );
            tail.next = head.next;
            head = head.next;
        }else if ( index == size - 1){
            Node beforeTail = gotoNodeIndex(size - 2);
            Node tail = next(beforeTail);

        
            beforeTail.next = head;
            tail.next = head;
        }else{
            Node prev = gotoNodeIndex(index - 1);
            Node current = next(prev);

            prev.next = current.next;
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public int size() {
       return size;
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}