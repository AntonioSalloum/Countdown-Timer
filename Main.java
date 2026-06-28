import static java.lang.System.out;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int cnt = 10;
            @Override
            public void run(){
                out.println(cnt);
                cnt--;
                if(cnt == 0){
                    out.println("Happy New Year !!!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);

    }
}