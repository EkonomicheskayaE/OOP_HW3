public class Program {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setHeight((double) 20);
        sq.print();
        System.out.println("Тогда площадь будет равна --> " + sq.getArea());
             
    }
}