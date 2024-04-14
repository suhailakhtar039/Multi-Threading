import java.util.ArrayList;
import java.util.List;

public class PlayAround {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm going for a walk");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm going to swim");
            }
        });
        List<Runnable> list = new ArrayList<>();
        list.add(thread1);
        list.add(thread2);

        for(Runnable runnable: list)
            runnable.run();


        thread1.start();
        thread2.start();
        System.out.println("I'm going home");
    }

}
