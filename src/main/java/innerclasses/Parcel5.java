
package innerclasses;

/**
 * 局部内部类
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 23:59
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args){
        Parcel5 p = new Parcel5();
        p.destination("Tasmania");
    }
}
