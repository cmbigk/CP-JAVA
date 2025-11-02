public class SingleLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node gotoIndex(int index){
        Node current = head;

        for (int i= 0; i < index; i++){
            current = next(current);
        }
        return current;
    }

    @Override
    public int at(int index) {
        // Implementation for accessing an element by its index
        if (index < 0) return -1;
        Node current = gotoIndex(index);
        return current.value; 
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        }else{
            Node tail = gotoIndex(size-1);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if (index>= size || index < 0 || head == null) {
            return ;
        }

        if (index == 0){
            head = head.next;
        }else{
            Node prev= gotoIndex(index-1);
            Node current = next(prev);

            prev.next = current.next;
        }
        size--;

    }

    @Override
    public int size() {
        // Implementation for accessing an element by its index
        return size;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;
    }
}