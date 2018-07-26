
package everyobject;

import org.junit.Test;

/**
 * 操作符
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-24 19:34
 */
public class Operators {

    @Test
    public void testEquals() {
        Value value1 = new Value();
        Value value2 = new Value();
        value1.i = value2.i = 100;
        System.out.println(value1.equals(value2));
    }
}

class Value {
    int i;
}
