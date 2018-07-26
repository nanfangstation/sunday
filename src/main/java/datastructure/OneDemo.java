
package datastructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 15:36
 */
public class OneDemo {
    public static void main(String[] args) {
        List<Integer> P = Arrays.asList(1, 3, 4, 6);
        List<String> L = Arrays.asList("1", "3", "4", "5", "7", "6", "0");
        printLots(L, P);
    }

    public static <AnyType> void printLots(List<AnyType> L, List<Integer> P) {
        Iterator<AnyType> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();
        AnyType itemL = null;
        Integer itemP = 0;
        int start = 0;
        while (iterL.hasNext() && iterP.hasNext()) {
            itemP = iterP.next();
            System.out.println("Looking for position " + itemP);
            while (start < itemP && iterL.hasNext()) {
                start++;
                itemL = iterL.next();
            }
            System.out.println(itemL);
        }
    }
}
