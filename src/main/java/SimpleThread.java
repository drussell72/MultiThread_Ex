import java.util.Calendar;
import java.util.Date;

/**
 * Created by drussell on 3/23/2015.
 */
class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());

            try {
                sleep((500));
            } catch (InterruptedException e) {}
        }
        System.out.println("DONE! " + getName());
    }
}

class SimpleThreadTwo extends Thread {
    public SimpleThreadTwo(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((int)(1000));
            } catch (InterruptedException e) {}
        }
        System.out.println("DONE! " + getName());
    }
}