public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg) {
        super(veg);
        super.addExtraTopping();
        super.addExtraCheese();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraTopping() {}
}
