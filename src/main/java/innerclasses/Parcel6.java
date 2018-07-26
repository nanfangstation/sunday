
package innerclasses;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 00:01
 */
public class Parcel6 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id=s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            @SuppressWarnings("unused")
            String s=ts.getSlip();
        }
        //		TrackingSlip ts = new TrackingSlip("x"); //不能在这里定义,超出范围
    }
    public void track(){
        internalTracking(true);
    }
    public static void main(String[] args){
        Parcel6 p = new Parcel6();
        p.track();
    }
}
