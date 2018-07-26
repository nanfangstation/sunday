
package collection;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 14:50
 */
public class DequeTest {

    @Test
    public void testList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(list);
    }
    static void fillTest(Deque<Integer> deque) {
        for (int i = 0; i < 27; i++) {
            deque.addFirst(i);
        }
        for (int i = 50; i < 55; i++) {
            deque.addLast(i);
        }
    }

    public static void main(String[] args) {
        Deque<Integer> di = new Deque<Integer>();
        fillTest(di);
        System.out.println(di);
        while (di.size() != 0) {
            System.out.print(di.removeFirst() + " ");
        }
        System.out.println();
        fillTest(di);
        System.out.println(di);
        while (di.size() != 0) {
            System.out.print(di.removeLast() + " ");
        }
        System.out.println();
    }
}

class Deque<T> {
    private LinkedList<T> deque = new LinkedList<T>();

    public void addFirst(T e) {
        deque.addFirst(e);
    }

    public void addLast(T e) {
        deque.addLast(e);
    }

    public T getFirst() {
        return deque.getFirst();
    }

    public T getLast() {
        return deque.getLast();
    }

    public T removeFirst() {
        return deque.removeFirst();
    }

    public T removeLast() {
        return deque.removeLast();
    }

    public int size() {
        return deque.size();
    }

    @Override
    public String toString() {
        return deque.toString();
    }

}
