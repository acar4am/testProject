class TwoDObj {
   private double height, width;

    // constructor without params
    TwoDObj(){
        height = width = 0;
    }
    // constructor with params
    TwoDObj(double h, double w){
        height = h;
        width = w;
    }
    // constructor with ob parameter
    TwoDObj(TwoDObj ob){
        height = ob.height;
        width = ob.width;
    }
    void showDim(){
        System.out.println("Width and height are " +width+ " and " +height);
    }
    double getHeight(){
        return height;
    }
    double getWidth(){
        return width;
    }
    void setHeight(double h) { height = h; }
    void setWidth(double width) { this.width = width; }
}

// Subclass Triangle inherits from superclass TwoDObj
class Triangle extends TwoDObj{
    private String style;

    //constructor without params
    Triangle(){
        super();
        style = "Empty";
    }
    //constructor with params
    Triangle(String s,double h, double w) {
        super(h, w);
        style = s;
    }

    // constructor with ob param
    Triangle(Triangle ob){
        // super inherits from TwoDObj constructor
        super(ob);
        style = ob.style;
    }
    double area(){
        return getHeight() * getWidth() / 2;
    }
    void showStyle(){
        System.out.println("Triangle is " +style);
    }

}
class Shapes{
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Hollow", 7.0, 4.0);
        var t2 = new Triangle();
        var t3 = new Triangle(t1);

        System.out.println("Triangle t1:");
        t1.showDim();
        System.out.println("Area is " +t1.area());
        t1.showStyle();

        System.out.println("Triangle t2:");
        t2.showDim();
        System.out.println("Area is " +t2.area());
        t2.showStyle();

        System.out.println("Triangle t3:");
        t3.showDim();
        System.out.println("Area is " +t3.area());
        t3.showStyle();

        t3.setWidth(99);
        t3.showDim();

    }
}
