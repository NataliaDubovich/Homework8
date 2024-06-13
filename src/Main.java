public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.getName());

        Shape quad = new Quad();
        System.out.println(quad.getName());


        Shape square = new Square();
        System.out.println(square.getName());

        Shape rectangle = new Rectangle();
        System.out.println(rectangle.getName());

        Shape qube = new Qube();
        System.out.println(qube.getName());
    }
}