import java.util.*;

public class QueueArray {

    static class Queue {
        static int arr[];
        static int size;
        static int front = -1; // Initialize front for proper queue behavior
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return front == -1;
        }

        // Add (enqueue)
        public static void add(int data) {
            if (isFull()) { // Queue is full
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) { // Handle first element insertion
                front = 0;
            }
            rear++; // Update rear for next insertion
            arr[rear] = data;
        }

        // Remove (dequeue) - Fixed shifting logic and return value
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1; // Indicate no element removed
            }

            int data = arr[front];

            // Handle single-element queue and last element removal
            if (front == rear) {
                front = rear = -1; // Reset both front and rear for empty queue
            } else {
                front++; // Update front for next removal (shifting logic fixed)
            }

            return data;
        }

        // Peek (front element)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }

        // Helper method to check for full queue
        private static boolean isFull() {
            return (rear + 1) % size == front; // Circular queue full condition
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
