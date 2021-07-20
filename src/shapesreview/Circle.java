package shapesreview;

public class Circle extends GraphicObject{
    void draw(){
        System.out.println("draw a circle by making a round line without" + " any corners");
    }

    public static void main(String[] args) {

    }

    void resize() {
        System.out.println("lets make the circle smalller");
    }

    void fillColor() {
        System.out.println("lets make the circle red");
    }
}
