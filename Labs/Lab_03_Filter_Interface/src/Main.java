import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> List<T> collectAll(T[] objects, Filter filter) {
        List<T> acceptedObjects = new ArrayList<>();
        for (T obj : objects) {
            if (filter.accept(obj)) {
                acceptedObjects.add(obj);
            }
        }
        return acceptedObjects;
    }
}
