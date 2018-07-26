
package collection;

import java.util.List;
import java.util.Vector;

import org.junit.Test;

/**
 * 线程安全
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 20:12
 */
public class VectorDemo {
    @Test
    public void testAdd() {
        List<String> list = new Vector<String>();
        list.add("hello");
        list.add("lydia");
        list.forEach(x -> System.out.println(x));
    }

    @Test
    public void testAddElement() {
        Vector<String> vector = new Vector<>();
        vector.addElement("hello");
        vector.addElement("lydia");
        vector.forEach(x -> System.out.print(x + " "));
    }
}
