
package cloneable;

/**
 * 对象克隆
 * 覆写clone时必须implements Cloneable否则报错
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 18:53
 */
public class CloneDemo implements Cloneable {

    private String name = null;

    public static void main(String[] args) throws Exception {
        CloneDemo demo = new CloneDemo("Lydia");
        CloneDemo demo1 = (CloneDemo) demo.clone();
        demo1.setName("飞鸟");
        System.out.println("原始: " + demo);
        System.out.println("克隆: " + demo1);
    }

    public CloneDemo(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "姓名: " + this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
