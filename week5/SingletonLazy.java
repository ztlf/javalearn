import java.util.concurrent.CountDownLatch;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;
    private SingletonLazy(){

    }
    public static synchronized SingletonLazy getInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int totalThread = 15;
        final CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        for (int i = 0; i < totalThread; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100000; j++) {
                        SingletonLazy instance = SingletonLazy.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
