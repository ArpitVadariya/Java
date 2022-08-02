//  Write a class circle with radius as data member and count the number of instances created using default constructor only.

class Circle{
    int radius = 5;
    static int cnt = 0;

    Circle(){
        cnt++;
        System.out.println(cnt + " object created.");
    }
}

public class QuestionEight {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle();
        Circle c5 = new Circle();
    }
}
