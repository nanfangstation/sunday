
package innerclasses;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-30 23:33
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if(next<items.length){
            items[next++]=x;
            //			items[next]=x;
            //			next++;
        }
    }
    private class SequenceSelector implements Selector{
        private int i =0;
        public boolean end(){
            return i == items.length;
        }
        public Object current(){
            return items[i];
        }
        public void next(){
            if(i<items.length){
                i++;
            }
        }
        @SuppressWarnings("unused")
        public Sequence getSequence(){
            return Sequence.this;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i=0;i<10;i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        //		Selector selector = new Sequence.SequenceSelector(); //不能直接初始化
        while(!selector.end()){
            System.out.print(selector.current()+" ");
            selector.next();
        }
    }
}
