package proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("p1.jpg");
        Image image2 = new ProxyImage("p2.jpg");

        // Image will be loaded and displayed
        image1.display();
        System.out.println();

        // Image will not be loaded again, it will be displayed directly
        image1.display();
        System.out.println();

        // Image will be loaded and displayed
        image2.display();
        System.out.println();

        // Image will not be loaded again, it will be displayed directly
        image2.display();
    }
}
