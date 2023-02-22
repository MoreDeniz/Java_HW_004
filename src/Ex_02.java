import java.util.Arrays;

public class Ex_02 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(7);
        System.out.println(queue.lListToString());
        System.out.println(queue.first());      // 8
        System.out.println(queue.dequeue());    // 8
        System.out.println(queue.dequeue());    // 4
        System.out.println(queue.first());      // 2
    }
}
