package mypackage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("=== Test 1: New queue ===");
        System.out.println("isEmpty (expected true): " + q.isEmpty());
        System.out.println("size (expected 0): " + q.size());
        System.out.println("front (expected null): " + q.front());
        System.out.println("rear  (expected null): " + q.rear());
        System.out.println();

        System.out.println("=== Test 2: Dequeue on empty ===");
        Node r0 = q.dequeue();
        System.out.println("dequeue result (expected null): " + r0);
        System.out.println("size (expected 0): " + q.size());
        System.out.println();

        System.out.println("=== Test 3: Enqueue one element ===");
        q.enqueue(new Node(10));
        System.out.println("isEmpty (expected false): " + q.isEmpty());
        System.out.println("size (expected 1): " + q.size());
        System.out.println("front.data (expected 10): " + q.front().data);
        System.out.println("rear.data  (expected 10): " + q.rear().data);
        System.out.println();

        System.out.println("=== Test 4: Enqueue multiple elements ===");
        q.enqueue(new Node(20));
        q.enqueue(new Node(30));
        q.enqueue(new Node(40));
        System.out.println("size (expected 4): " + q.size());
        System.out.println("front.data (expected 10): " + q.front().data);
        System.out.println("rear.data  (expected 40): " + q.rear().data);
        System.out.println();

        System.out.println("=== Test 5: Dequeue preserves FIFO order ===");
        Node r1 = q.dequeue();
        Node r2 = q.dequeue();
        System.out.println("dequeue #1 data (expected 10): " + (r1 == null ? "null" : r1.data));
        System.out.println("dequeue #2 data (expected 20): " + (r2 == null ? "null" : r2.data));
        System.out.println("size (expected 2): " + q.size());
        System.out.println("front.data (expected 30): " + q.front().data);
        System.out.println("rear.data  (expected 40): " + q.rear().data);
        System.out.println();

        System.out.println("=== Test 6: Dequeue until empty, rear should become null ===");
        Node r3 = q.dequeue(); // should remove 30
        Node r4 = q.dequeue(); // should remove 40, queue becomes empty
        System.out.println("dequeue #3 data (expected 30): " + (r3 == null ? "null" : r3.data));
        System.out.println("dequeue #4 data (expected 40): " + (r4 == null ? "null" : r4.data));
        System.out.println("isEmpty (expected true): " + q.isEmpty());
        System.out.println("size (expected 0): " + q.size());
        System.out.println("front (expected null): " + q.front());
        System.out.println("rear  (expected null): " + q.rear());
        System.out.println();

        System.out.println("=== Test 7: Enqueue after being emptied ===");
        q.enqueue(new Node(99));
        System.out.println("isEmpty (expected false): " + q.isEmpty());
        System.out.println("size (expected 1): " + q.size());
        System.out.println("front.data (expected 99): " + q.front().data);
        System.out.println("rear.data  (expected 99): " + q.rear().data);
        System.out.println();

        System.out.println("=== Test 8: enqueue(null) should fail ===");
        boolean ok = q.enqueue(null);
        System.out.println("enqueue(null) returned (expected false): " + ok);
        System.out.println("size (expected 1): " + q.size());
        System.out.println("front.data (expected 99): " + q.front().data);
        System.out.println("rear.data  (expected 99): " + q.rear().data);
    }
}
