
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author nanfang
 * @version V1.0
 * @since 2018-06-11 06:50
 */
public class ParameterizedArrayType {

    @SuppressWarnings({ "unused", "unchecked" })
    public static void main(String[] args) {
        List<Integer>[] intLists; // 虽然这样可以定义, 其实是不能实例化的
        // 不能实例化具有参数化类型的数组
        // 擦除会移除类型参数信息 数组必须知道他们所持有的确切类型以强制保证类型安全
        // 可以参数化数组本身的类型
//        		List<Integer>[] intLists = new ArrayList<Integer>[10]; // 不能编译
        intLists = ((List<Integer>[]) new ArrayList[3]);//但你可以实例化一个, 然后转换它

        Integer[] ints = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles = MethodParameter.f(doubles);
        System.out.println(Arrays.deepToString(ints2));
        System.out.println(Arrays.deepToString(doubles));
    }
}

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}
