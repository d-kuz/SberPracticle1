public class Philosophers implements Runnable {
    public Object leftFork;
    public Object rightFork;

    public Philosophers(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void Action(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep((int) Math.random());
    }

    @Override
    public void run() {
        try {
            while (true) {
                Action(" размышляет");
                synchronized (leftFork) {
                    Action(" взял левую вилку");
                    synchronized (rightFork) {
                        Action(" ест");
                        Action(" положил правую вилку");
                    }
                    Action(" размышляет");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}