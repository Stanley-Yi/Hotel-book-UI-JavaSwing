import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 单例实现线程池类，管理组件滚动产生的线程
 * @author 崔耀强
 * @version 1.1
 *
 */
public class ThreadGroupUtil {

    private static ExecutorService pool = null;
    private static int size;
    static {

        size=400;
        System.out.println(size);
        pool = Executors. newFixedThreadPool(size);
    }

    /**
     * 得到单例的线程池，线程池有大小，大小为设备组件总数的二倍
     * @return ExecutorService 线程池
     */
    public static ExecutorService getInstance() {
        return pool;
    }
}
