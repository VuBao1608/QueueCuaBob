package mypackage;

public class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }


    public boolean enqueue(Node node) {
        //implement here
        if (node == null) { return false; }
        if (isEmpty()) { front = rear = node; }
        else {
            rear.next = node;
            rear = node;
        }
        size++;
        return true;
    }

    public Node dequeue() {
        //implement here
        if (front == null) { return null; }
        Node remove = front;
        front = front.next;
        if (front == null) { rear = null; }

        remove.next = null;
        size--;
        return remove;
    }

    public int size() { return size; }

    public Node front() { return front; } //trả về node đầu tiên của queue, ko làm thay đổi queue

    public Node rear() { return rear; } // trả về node cuối cùng của queue, ko làm thay đổi queue
}
