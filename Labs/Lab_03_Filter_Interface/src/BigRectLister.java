import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 3)); // Perimeter = 10
        rectangles.add(new Rectangle(1, 4)); // Perimeter = 10
        rectangles.add(new Rectangle(3, 4)); // Perimeter = 14
        rectangles.add(new Rectangle(5, 2)); // Perimeter = 14

        Filter filter = new BigRectangleFilter();

        for (Rectangle rectangle : Main.collectAll(rectangles.toArray(new Rectangle[0]), filter)) {
            System.out.println(rectangle);
        }
    }
}
