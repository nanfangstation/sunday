
package collection;

import java.util.LinkedList;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 20:19
 */
public class LinkedListDemo {
    @Test
    public void test() {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.add("B");
        link.add("C");
        System.out.println("初始化链表: " + link);
        link.addFirst("X");
        link.addLast("Y");
        System.out.println("链表: " + link);
        System.out.println("找到表头: " + link.element());

    }
}
