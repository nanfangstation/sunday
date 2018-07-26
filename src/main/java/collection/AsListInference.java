
package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-01 13:47
 */
public class AsListInference {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        //		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy()); //不能编译, 需要List<Powder>;
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        List<Snow> snow4 =Arrays.<Snow>asList(new Light(),new Heavy());//这样可以
    }
}
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{};
class Crusty extends Snow{}
class Slush extends Snow{}
