public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(4, 6, 7);
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Площадь: " + triangle.getArea());
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Triangle invalidTriangle = new Triangle(1, 2, 3);
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
