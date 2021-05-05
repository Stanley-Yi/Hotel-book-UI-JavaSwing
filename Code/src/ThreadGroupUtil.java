import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadGroupUtil {

    private static ExecutorService pool = null;
    private static int size;
    static {

        size=400;
        System.out.println(size);
        pool = Executors. newFixedThreadPool(size);
    }

    public static ExecutorService getInstance() {
        return pool;
    }
}
