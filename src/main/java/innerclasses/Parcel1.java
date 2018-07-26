
package innerclasses;

/**
 * 创建内部类
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 23:31
 */
public class Parcel1 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    //使用内嵌类
    public void ship(String dest){
        @SuppressWarnings("unused")
        Contents c = new Contents();
        Destination	d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
