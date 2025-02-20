
class QueueUsingArray {
    int[] queue;
    int front, rear, size;

    QueueUsingArray(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) return;
        if (front == -1) front = 0;
        queue[++rear] = data;
    }

    int dequeue() {
        return (front == -1 || front > rear) ? -1 : queue[front++];
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Queue Dequeue: " + queue.dequeue());
    }
}
