class TwoDObj {
   private double height, width;
   private String name;

    // constructor without params
    TwoDObj(){
        height = width = 0;
        name = "none";
    }

    // constructor with params
    TwoDObj(double h, double w, String n){
        height = h;
        width = w;
        name = n;
    }

    // constructor object from an object
    TwoDObj(TwoDObj ob){
        height = ob.height;
        width = ob.width;
        name = ob.name;
    }

    // construct object with equal width and height
    TwoDObj(double i, String n){
        height = width = i;
        name = n;
    }
    String showDim(){
        return "Width and height are " +width+ " and " +height;
    }
    double getHeight(){
        return height;
    }
    double getWidth(){
        return width;
    }
    void setHeight(double h) { height = h; }
    void setWidth(double width) { this.width = width; }
    String getName(){ return name; }
    double area(){
        System.out.println("Area must be overridden");
        return 0.0;
    }
}

// Subclass Triangle inherits from superclass TwoDObj
class Triangle extends TwoDObj{
    private String style;

    //constructor without params
    Triangle(){
        super();
        style = "none";
    }
    //constructor with params
    Triangle(String s,double h, double w) {
        super(h, w, "Triangle");
        style = s;
    }

    // constructor with ob param
    Triangle(Triangle ob){
        // super inherits from TwoDObj constructor
        super(ob); // pass Triangle reference to TwoDObj's constructor
        style = ob.style;
    }
    //constructor for object with equal width and height
    Triangle(double i){
        super(i, "Triangle");
        style = "outlined";
    }

    // override area() for Triangle
    double area(){
        return getHeight() * getWidth() / 2;
    }
    void showStyle(){
        System.out.println("Triangle is " +style);
    }

}
// Subclass for rectangles
class Rectangle extends TwoDObj {
    // default constructor
    Rectangle(){
        super();
    }

    //constructor for Rectangle
    Rectangle(double h, double w) {
        super(h, w, "Rectangle"); // calls superclass constructor
    }

    boolean isSquare(){
        if(getHeight() == getWidth())
            return true;
        return false;
    }

    // override area() for Rectangle
    double area(){
        return getHeight() * getWidth();
    }

}
class Shapes{
    public static void main(String[] args) {
        // array of objects
        // is valid, because superclass reference can refer to subclass objects
        TwoDObj[] shapes = new TwoDObj[5];

        shapes[0] = new Triangle("filled", 8.0, 3.0);
        shapes[1] = new Triangle(7.0);
        shapes[2] = new Rectangle(9.0, 5.0);
        shapes[3] = new Rectangle(10.0, 10.0);
        shapes[4] = new TwoDObj(10,20,"generic");

        for (int i = 0; i < shapes.length; i++){
            System.out.println("object is " +shapes[i].getName());
            System.out.println(shapes[i].showDim());
            System.out.println("Area is " +shapes[i].area());
            System.out.println(".");
        }
    }
}
