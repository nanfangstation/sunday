
package jvm;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-23 12:53
 */
public class StackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackSOF stackSOF = new StackSOF();
        try {
            stackSOF.stackLeak();
        } catch (Exception e) {
            System.out.println("stack length: " + stackSOF.stackLength);
            e.printStackTrace();
        }
    }
}
