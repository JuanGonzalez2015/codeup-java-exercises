package shapesreview;

abstract class GraphicObject {

    int x, y;

    void moveTo(int newX, int newY){
        System.out.printf("this shape's new coordinates are: %s, %s",
                newX, newY);
    }

    abstract void draw();
    abstract void resize();
    abstract void fillColor();
}
