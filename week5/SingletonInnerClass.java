import java.util.concurrent.CountDownLatch;


public class SingletonInnerClass {

    private final static class SingletonClass{
        private static SingletonInnerClass singletonClass = new SingletonInnerClass();
    }

    private SingletonInnerClass(){}

    public static SingletonInnerClass getInstance(){
        return SingletonClass.singletonClass;
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
                        SingletonInnerClass instance = SingletonInnerClass.getInstance();
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
