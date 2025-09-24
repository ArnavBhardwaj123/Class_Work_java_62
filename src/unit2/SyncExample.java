package unit2;

public class SyncExample {
    public static void main(String[] args) throws InterruptedException{
        counter counter = new counter();
        Thread t1 = new Thread(()->{
            for(int i=0 ; i<1000;i++){
                counter.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i =0 ; i < 1000 ; i++){
                counter.increment();
            }
        });
        t1.start();;
        t2.start();
        System.out.println("Final Count:" + counter.getCount());
        t1.join();
        t2.join();
        System.out.println("Final Count:" + counter.getCount());
    }
}
