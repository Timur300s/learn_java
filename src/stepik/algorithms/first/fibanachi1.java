package stepik.algorithms.first;

public class fibanachi1 {
    private int fibanachi(int n) {
        if (n < 2)
            return n;
        return fibanachi(n - 2) + fibanachi(n - 1);
    }
    private void run(){
            System.out.println(fibanachi(40));
        }
    public static void main(String[] args) {
        long time1= System.currentTimeMillis();
        new fibanachi1().run();
        long time2= System.currentTimeMillis();
        System.out.println(time2-time1+"ms");
    }

}
