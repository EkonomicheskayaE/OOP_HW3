public class Rectangle extends Figure {
    protected double width;
    protected double height;

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   
    @Override
    public double getArea() {
        return width * height;
    }

}
