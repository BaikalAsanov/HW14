public class Circle {
    private static final double PI=3.14;
    private static double Radius;
    static void area() {
        double area=PI*(Radius*Radius);
        System.out.printf("Площадь: "+"%f",area);
    }
    static void circumference() {
        double circumference=PI*2*Radius;
        System.out.println("\n"+"Длина окружности: "+circumference);
    }

    public static void setRadius(double radius) {
        Radius = radius;
    }
}
