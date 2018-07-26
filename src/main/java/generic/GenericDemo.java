
package generic;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 17:58
 */
public class GenericDemo {

    @Test
    public void test() {
        Info info1 = new Info(); // 没有指定泛型类型
        Info<Object> info2 = new Info<Object>(); // 指定泛型类型为Object
        Info<?> info3 = new Info<String>();
        /* info3.setVar("Lydia"); */ // 使用？接收泛型对象无法设置值
        info3.setVar(null); // 使用？接收泛型对象无法设置值但可以设置null
        info1.setVar("Lydia");
        System.out.println("内容: " + info1.getVar());
    }

    @Test
    public void testArray() {
        Integer i[] = fun4(1, 2, 3, 4, 5);
        fun5(i);
    }

    public <T> T[] fun4(T... arg) {
        return arg;
    }

    public static <T> void fun5(T... arg) {
        System.out.println("接收泛型数组");
        for (T t : arg) {
            System.out.print(t);
        }
        System.out.println();
    }

    // 通配符
    @Test
    public void testWildcard() {
        Info<String> i = new Info<String>();
        i.setVar("Lydia");
        fun2(i);
    }

    public void fun3(Info<?> temp) {
        System.out.println("内容: " + temp);
    }

    public void fun2(Info temp) {
        System.out.println("内容: " + temp);
    }

    public void fun1(Info<Object> temp) {
        System.out.println("内容: " + temp);
    }
}

class Info<T> {
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Info{" + "var=" + var + '}';
    }
}
