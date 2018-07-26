
package everyobject;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-29 05:01
 */
public class LocaleResource {
    @Test
    public void test() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("localeresource.message", new Locale("en", "US"));
        System.out.println("内容: " + resourceBundle.getString("info"));
    }
}
