class Spiderman implements  Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("First Spiderman");
        }
    }
}

class AmazingSpiderman implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Second Spiderman");
        }
    }
}

class MarvelSpiderman implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Third Spiderman");
        }
    }
}
public class ThreadSecond {
    public static void main(String[] args) {
        Spiderman s = new Spiderman();
        Thread s1 = new Thread(s);
        AmazingSpiderman as = new AmazingSpiderman();
        Thread as1 = new Thread(as);
        MarvelSpiderman ms = new MarvelSpiderman();
        Thread ms1 = new Thread(ms);

        s1.start();
        as1.start();
        ms1.start();
    }
}