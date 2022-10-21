public class Square extends Rectangle {

    private double side;

    public Double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.width = side;
        super.height = side;
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.height = width;
        this.side = width;
        super.setWidth(width);
    }

    @Override
    public void setHeight(double height) {
        super.width = height;
        this.side = height;
        super.setHeight(height);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public void print() {
        System.out.println("Пусть сторона равна --> " + side);
    }
}
