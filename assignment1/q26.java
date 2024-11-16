class Queue {
    int[] queue = new int[5];
    int front = -1, rear = -1;

    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Full");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Dequeued: " + queue[front++]);
        }
    }
}

class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
