// Interface Banavyu
interface Drawable {
    void draw();
}

// Interface implement karyu
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
// ahiya pan Interface Implement karyu
class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class TestInterface {
    public static void main(String args[]) {
        // ahiya khali circle class no object banavyo chhe
        Drawable d = new Circle();
        d.draw();
    }
}