import java.util.LinkedList;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
*/

public class hw_4_2 {
    public static LinkedList enqueue(LinkedList ll, int elem) {
        ll.addLast(elem);
        return ll;
    }

    public static LinkedList dequeue(LinkedList ll) {
        System.out.println(ll.poll());
        return ll;
    }

    public static Object first(LinkedList ll) {
        return ll.get(0);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        System.out.println("Original LinkedList:");
        System.out.println(enqueue(ll, 2));
        System.out.println(dequeue(ll));
        System.out.println(first(ll));;
    }
}
