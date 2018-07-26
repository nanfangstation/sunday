
package everyobject;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-29 03:20
 */
public class InnerClass {
    @Test
    public void testInnerStatic() {

    }

    class InnerPerson {

        public static final String name = "hello";

        public static final int age = 1;

        private String test;

        public void test(String he) {
            System.out.println(he);
        }

        // 下面这行报错
//        public static final String address = new String("hello");
    }

    public void hello() {
        String a = InnerPerson.name;
        new InnerPerson().test(a);
    }
}

class Address {
    private String name;

    public Address(String name) {
        this.name = name;
    }
}