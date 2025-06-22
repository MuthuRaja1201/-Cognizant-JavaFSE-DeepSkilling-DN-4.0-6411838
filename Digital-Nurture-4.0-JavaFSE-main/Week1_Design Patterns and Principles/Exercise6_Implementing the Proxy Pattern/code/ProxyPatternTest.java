public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature_photo.jpg");

        // Image will be loaded from remote server at first display
        image1.display();

        System.out.println();

        // Image will be displayed directly from cache on subsequent calls
        image1.display();

        System.out.println();

        // Another image
        Image image2 = new ProxyImage("sunset_photo.jpg");
        image2.display();
    }
}
