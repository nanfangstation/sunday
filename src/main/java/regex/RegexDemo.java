
package regex;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-29 06:04
 */
public class RegexDemo {

    @Test
    public void test() {
        String num = "123456789";
        if (Pattern.compile("[0-9]+").matcher(num).matches()) {
            System.out.println("由数字组成");
        } else {
            System.out.println("非数字组成");
        }
    }
}
