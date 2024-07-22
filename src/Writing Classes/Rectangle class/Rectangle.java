public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    

    // Put your methods here
    public int getHeight () {
        return height;
    }
    
    public int getWidth () {
        return width;
    }
    
    public int getArea () {
        return height * width;
    }
    
    public int getPerimeter () {
        return height * 2 + width * 2;
    }
    public void setHeight (int num) {
        height = num;
    }
    
    public void setWidth (int num) {
        width = num;
    }
    /**
     * This is the toString method. It returns a String
     * representation of the object. 
     */
    public String toString()
    {
        return "Rectangle width: " + width + ", Rectangle height: " + height;
    }
}