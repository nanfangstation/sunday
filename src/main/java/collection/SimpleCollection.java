
package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 13:21
 */
public class SimpleCollection {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            c.add(i); //自动装箱
        }
        for(Integer i :c){
            System.out.print(i+" ");
        }
    }
}
