// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    // enqueue() - помещает элемент в конец очереди
    void enqueue(int item) {
        linkedList.addLast(item);
    }
    // dequeue() - возвращает первый элемент из очереди и удаляет его
    Integer dequeue() {
//        if(linkedList.size() > 0) {
        if(!linkedList.isEmpty()) {
            return linkedList.pollFirst();
        }
        return null;
    }
    // first() - возвращает первый элемент из очереди, не удаляя
    Integer first() {
        if(!linkedList.isEmpty()) {
            return linkedList.peekFirst();
        }
        return null;
    }
    // метод для вывода в консоль
    String lListToString() {
        return linkedList.toString();
    }
}
