class threaddemo1 extends Thread {
    int i;
    public void run() {
        for(i=1;i<=50;i++) {
            if(i%2==0) {
                System.out.println("Even Number: "+i);
                try {
                    sleep(500);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class threaddemo2 extends Thread {
    int i;
    public void run() {
        for(i=1;i<=50;i++) {
            if(i%2!=0) {
                System.out.println("Odd Number: "+i);
                try {
                    sleep(500);
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
class MainThread {
    public static void main(String args[]) {
        threaddemo1 t1=new threaddemo1();
        threaddemo2 t2=new threaddemo2();
        t1.start();
        t2.start();
    }
}