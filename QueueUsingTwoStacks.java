import java.util.Stack;

public class QueueUsingTwoStacks {

    // Two stacks to implement a queue
    private Stack<Integer> enqueueStack = new Stack<>();
    private Stack<Integer> dequeueStack = new Stack<>();

    // Enqueue operation: Add a new element to the end of the queue
    public void enqueue(int element) {
        enqueueStack.push(element);
        System.out.println("Enqueued: " + element);
    }

    // Dequeue operation: Remove the element from the front of the queue
    public void dequeue() {
        // Ensure dequeueStack is not empty for dequeue operation
        if (dequeueStack.isEmpty()) {
            // Transfer elements from enqueueStack to dequeueStack
            transferEnqueueStackToDequeueStack();
        }

        // Perform dequeue if dequeueStack is not empty
        if (!dequeueStack.isEmpty()) {
            int removedElement = dequeueStack.pop();
            System.out.println("Dequeued: " + removedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Print operation: Print the element at the front of the queue
    public int printFront() {
        // Ensure dequeueStack is not empty for front retrieval
        if (dequeueStack.isEmpty()) {
            // Transfer elements from enqueueStack to dequeueStack
            transferEnqueueStackToDequeueStack();
        }

        // Print and return the front element if dequeueStack is not empty
        if (!dequeueStack.isEmpty()) {
            int frontElement = dequeueStack.peek();
            System.out.println("Front Element: " + frontElement);
            return frontElement;
        } else {
            System.out.println("Queue is empty. No front element.");
            return -1;
        }
    }

    // Helper method to transfer elements from enqueueStack to dequeueStack
    private void transferEnqueueStackToDequeueStack() {
        while (!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
        }
    }

    public static void main(String[] args) {
        // Example usage of the QueueUsingTwoStacks class
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        // Example queries with different integer values
        queue.enqueue(42);
        queue.enqueue(17);
        queue.printFront(); // Output: 42
        queue.dequeue();
        queue.printFront(); // Output: 17
    }
}

