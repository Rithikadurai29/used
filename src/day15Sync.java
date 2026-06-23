
public class day15Sync {
    static String[] items = {"Burger","Dosa","Coffee"};
    private static int nextOrderIndex = 0;
    private static final Object LOCK = new Object();
    static void pickOrder(){
        String order;
        while (true) {
            synchronized (LOCK) {
                if (nextOrderIndex >= items.length) {
                    return;
                }
                order = items[nextOrderIndex];
                nextOrderIndex++;
            }
            System.out.println(Thread.currentThread().getName() + " is preparing : " + order);
        }
    }
    static void main()throws InterruptedException{
        Thread chefOne = new Thread(()-> pickOrder(),"chef-one");
        Thread chefTwo = new Thread(()-> pickOrder(),"chef-two");
        chefOne.start();
        chefTwo.start();
        chefOne.join();
        chefTwo.join();
    }
}
