public class Main {
    public static void main(String[] args) {
        // a) Obiectul clasei de bază folosind constructorul clasei de bază
        Figure figure = new Figure(5, 3);
        // b) Obiectul clasei derivate folosind constructorul clasei de bază
        Square square = new Square(4);
        // c) Obiectul clasei derivate folosind constructorul clasei derivate
        Square derivedSquare = new Square(3, 3);
        // d) Obiectul clasei de bază folosind constructorul clasei derivate
        Figure derivedFigure = new Square(6);
        // Apelarea metodelor folosind toate obiectele create
        figure.displayDetails();
        square.displayDetails();
        derivedSquare.displayDetails();
        derivedFigure.displayDetails();
    }
}

class Figure {
    protected double length;
    protected double width;


    public Figure(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public Figure(double side) {
        this(side, side);
    }

    public double calculateArea() {
        return length * width;
    }

    public void displayDetails() {
        System.out.println("Figure:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }
}


class Square extends Figure {

    public Square(double side) {
        // Apelarea constructorului cu un singur parametru din clasa de bază (Figure)
        super(side);
    }


    public Square(double length, double width) {
        // Apelarea constructorului cu doi parametri din clasa de bază (Figure)
        super(length, width);
    }


    public double calculatePerimeter() {
        return 4 * length;
    }


    @Override
    public void displayDetails() {
        super.displayDetails(); // Apelarea metodei din clasa de bază
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
}
