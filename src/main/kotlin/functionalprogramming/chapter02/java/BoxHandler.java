package functionalprogramming.chapter02.java;

// Plastic <- Toy <- Car
//                <- Robot
public class BoxHandler {
    public Toy outBox(Box<? extends Toy> box) {
//        box.set(new Toy());
        return box.get();
    }

    public void inBox(Box<? super Toy> box) {
//        Toy toy = box.get();
        box.set(new Toy());
    }
}
