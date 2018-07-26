
package timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-06-29 06:07
 */
public class TimerDemo {

    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        timer.schedule(myTask, 1000, 2000);
    }
    @Test
    public void test() {
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        timer.schedule(myTask, 1000, 2000);
    }
}

class MyTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("当前线程: " + Thread.currentThread().getName() + " 当前系统时间为: " + sdf.format(new Date()));
    }
}
