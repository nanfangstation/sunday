
package typeinfo;

import static util.Print.print;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 22:18
 */
public class FamilyVSExactType {

    static void test(Object x){
        print("Testing x of type "+x.getClass());
        print("x instanceof Base "+(x instanceof Base));
        print("x instanceof Derived "+(x instanceof Derived));
        print("Base.isIntance(x) "+(Base.class.isInstance(x)));
        print("Derived.isIntance(x)  "+(Derived.class.isInstance(x)));
        print("x.getClass() == Base.class "+(x.getClass()==Base.class));
        print("x.getClass() == Derived.class "+(x.getClass()== Derived.class));
        print("x.getClass().equals(Base.class) "+x.getClass().equals(Base.class));
        print("x.getClass().equals(Derived.class) "+x.getClass().equals(Derived.class));
    }
    public static void main(String[] args){
        test(new Base());
        test(new Derived());
    }
}

class Base{}
class Derived extends Base{}
