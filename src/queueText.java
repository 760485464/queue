import jdk.nashorn.internal.ir.Block;

import javax.print.attribute.HashAttributeSet;
import java.util.concurrent.*;

public class queueText {
    public static void main (String[] args) throws InterruptedException {


        ExecutorService ss = Executors.newCachedThreadPool();
        ss.execute(new Thread(()->{ while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行成果");
            break;
        }}));

        ss.shutdown();

    }

}
