package Iterator.ProductCollection;

public interface Iterator {
    Product current();
    void next();
    boolean isDone();
}
