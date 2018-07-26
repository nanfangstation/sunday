
package collection;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 13:15
 */
public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
//        		apples.add(new Orange());//使用泛型以后不能往apple的arrayList中加入orange
        for(int i=0;i<apples.size();i++){
            System.out.println(apples.get(i).id());
        }
        //使用foreach
        for(Apple apple : apples){
            System.out.println(apple.id());
        }
    }
}
