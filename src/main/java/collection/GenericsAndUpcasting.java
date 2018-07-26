
package collection;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 13:14
 */
public class GenericsAndUpcasting {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple c :apples){
            System.out.println(c);
        }
    }
}
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
