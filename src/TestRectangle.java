public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 5.5);

        double areal = r1.getArea();
        double perimeter = r1.getPerimeter();
        System.out.printf("area: %f perimeter: %f\n", areal, perimeter);

        System.out.printf("area: %f perimeter: %f\n",
                r2.getArea(), r2.getPerimeter());
    }
}
