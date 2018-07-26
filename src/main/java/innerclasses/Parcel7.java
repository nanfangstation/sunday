
package innerclasses;

/**
 * 匿名内部类
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 00:01
 */
public class Parcel7 {

    public Contents contents(){
        return new Contents(){//主意这个()
            private int i=11;
            public int value(){
                return i;
            }
        };//主意这个分号
    }
    public static void main(String[] args){
        Parcel7 p = new Parcel7();
        Contents c =p.contents();
        c.value();
    }
}
