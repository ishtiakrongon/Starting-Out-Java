package Chapter_6_Class;

public class Rectangle {
    
    private double length;
    private double width;

    /*
     * The setLength method stores a value in the length field.
     * @parameter len The value to store in length.
     */

    // Access Specifier | Return Type | Method Name
    public void setLength(double len) {

        length = len;

    }

    /*
     * The setWidth method stores a value in the width field.
     * @ parameter w The value to store in width.
     */

    public void setWidth(double w) {

        width = w;

    }

    /*
     * The getWidth method returns a Rectangle object's width.
     */
    public double getWidth() {
        return width;
    }

    /*
     * The getLength method returns a Rectangle object's length
     */

    public double getLength() {
        return length;
    }
}
