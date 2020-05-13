public class MyLinkedListQueue {
        private Example.Node head;
        private Example.Node tail;

        public MyLinkedListQueue() {
            this.head = null;
            this.tail = null;
        }

    public void enqueue(int key) {
        Example.Node temp = new Example.Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Example.Node dequeue() {
        if (this.head == null)
            return null;
        Example.Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}

class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
