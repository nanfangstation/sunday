
package innerclasses;

/**
 * 有资格访问外部类对象
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 23:36
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;//如果直接this会返回当前inner实例
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args){
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
