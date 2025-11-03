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


    public Node gotoNodeIndex(int index){
        Node current;
        int step = index;

        if (index== 0){
            current = head;
        }else {
            current = head;
            for (int i = 0; i < step; i++){
                current = next(current);
            }
        }
        return current;
    }


    @Override
    public int at(int index) {
        if (index < 0 || index >= size) return -1 ;

        Node current = gotoNodeIndex(index);
        return current.value;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node (value);
        if (head == null){
            head =  newNode;
        }else {
          Node   tail = gotoNodeIndex(size-1);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else{
            Node prev = gotoNodeIndex(index-1 );
            Node current = next(prev);
            prev.next = current.next;

        }
        size--;


    }


    @Override
    public int size() {
        return size;
    }

    private Node next(Node node) {
        System.out.print("Go to next node\n");
        return node.next;
    }

}