
package innerclasses;

/**
 * 返回一个指向内部类的引用
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 23:32
 */
public class Parcel2 {
    class Contents{
        private int i =11;
        public int value(){
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
    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }
    public void ship(String dest){
        @SuppressWarnings("unused")
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    @SuppressWarnings("unused")
    public static void main(String[] args){
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
