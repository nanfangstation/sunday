
package util;

import java.io.PrintStream;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 22:19
 */
public class Print {
    //打印对象, 并打印换行符
    public static void print(Object obj) {
        System.out.println(obj);
    }

    //打印空行
    public static void print() {
        System.out.println();
    }

    //打印对象, 不打印换行符(no line break)
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    //类型于c语的printf
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
