
package datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 15:41
 */
public class TwoDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void swapWithNextA(Node beforep) {
        Node p, afterp;
        p = beforep.next;
        afterp = p.next; // Both p and afterp assumed not null.
        p.next = afterp.next;
        beforep.next = afterp;
        afterp.next = p;
    }

    public static void swapWithNextB(Node p) {
        Node beforep, afterp;
        beforep = p.prev;
        afterp = p.next;
        p.next = afterp.next;
        beforep.next = afterp;
        afterp.next = p;
        p.next.prev = p;
        p.prev = afterp;
        afterp.prev = beforep;
    }
}
