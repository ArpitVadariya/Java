class Animal {
    Animal(){
        System.out.println("Animal class called");
    }
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    Dog(){
        System.out.println("Dog class called");
    }
    void bark() {
        System.out.println("barking...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}