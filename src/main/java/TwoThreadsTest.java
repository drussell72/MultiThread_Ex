/**
 * Created by drussell on 3/23/2015.
 */
class TwoThreadsTest {
    public static void main (String args[]) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
        new SimpleThreadTwo("Meh").start();
        new SimpleThreadTwo("MehDos").start();
    }
}