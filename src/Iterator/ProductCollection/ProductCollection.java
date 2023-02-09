package Iterator.ProductCollection;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator{
        private final ProductCollection productsCollection;
        private int index;

        private ListIterator(ProductCollection productsCollection) {
            this.productsCollection = productsCollection;
        }

        @Override
        public Product current() {
            return productsCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean isDone() {
            return (index < productsCollection.products.size());
        }
    }
}
