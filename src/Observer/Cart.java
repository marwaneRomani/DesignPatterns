package Observer;

public class Cart implements Observer {
    private Store datasource;

    public Cart(Store datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("totalQty got updated to " + datasource.getTotalQty());
    }
}
