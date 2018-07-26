package everyobject;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-24 19:01
 */
public class EveryObject {
    // 作用域
    @Test
    public void scope() {
        {
            int x = 12;
            {
                int q = 96;
            }
            // q = 12; 越界
        }

        {
            String s = new String("a string");
        }// end of scope
    }
}
