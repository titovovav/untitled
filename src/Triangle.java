class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {

        if (sideA <= 0 || sideB <= 0 || sideC <= 0 ||
                sideA + sideB <= sideC ||
                sideA + sideC <= sideB ||
                sideB + sideC <= sideA) {
            throw new IllegalTriangleException("Стороны не могут образовать треугольник.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getPerimeter() {
        return sideA + sideB + sideC;
    }


    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
