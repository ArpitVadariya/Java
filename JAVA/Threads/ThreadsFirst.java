class Spiderman extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("First Spiderman");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class AmazingSpiderman extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Second Spiderman");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class MarvelSpiderman extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Third Spiderman");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsFirst {
    public static void main(String[] args) {
        Spiderman s = new Spiderman();
        AmazingSpiderman as = new AmazingSpiderman();
        MarvelSpiderman ms = new MarvelSpiderman();

        s.start();
        ms.start();
        as.start();
    }
}