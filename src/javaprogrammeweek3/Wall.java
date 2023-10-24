package javaprogrammeweek3;

public class Wall {
    //Declare two variable(Instance)
    double width;
    double height;

    //No - args constructor
    public Wall(){
        this.width = 0;
        this.height = 0;
    }

    //Contructor with parameters,setting width and height with check
    public double getWidth() { return width; }
    //2.method for height
    public double getHeight() {return height; }
   //setwidth with one parameter of type double
    public void setWidth(double width) {this.width= (width <0)? 0 : width;}
    //setheight with one parameter of type double
    public void setHeight(double height){ this.height = (height < 0)? 0:height;}
    //method name getArea without any parameters
    public double getArea(){
        return width * height;
    }
    //main mehtod
    public static void main(String[] args) {
        //Test input enter
        Wall wall = new Wall();
        System.out.println("area="+wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width="+wall.getWidth());
        System.out.println("height="+wall.getHeight());
        System.out.println("area="+wall.getArea());


    }
}
