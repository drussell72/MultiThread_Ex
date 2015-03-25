/**
 * Created by drussell on 3/25/2015.
 */
public class SleepMessages {
    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        int programlength = 8*60*60*2;
        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(500);
            //Print a message
            System.out.println(importantInfo[i]);
            System.out.println(programlength);
        }
    }
}
