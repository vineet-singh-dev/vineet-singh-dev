public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 50;
    private int carryBagPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;



    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese (){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;


    }
    public void addExtraTopping (){
        isExtraToppingsAdded = true;
        this.price += extraToppingPrice;

    }
    public void addCarryBag (){
        isOptedForTakeAway = true;
        this.price += carryBagPrice;

    }
    public void getBill (){
        String bill = "";
        System.out.println("Pizza = "+basePizzaPrice);
        if(isExtraCheeseAdded) {
            System.out.print("Extra Cheese is Added = "+extraCheesePrice +"\n");
        }
        if(isExtraToppingsAdded) {
            System.out.print("Extra Toppings are Added = "+extraToppingPrice+"\n");
        }
        if(isOptedForTakeAway) {
            System.out.println("Carry Bag is Added = "+carryBagPrice+"\n");
        }
        bill += "Total Bill = "+ this.price+"\n";
        System.out.println(bill);
        System.out.println("Thanks! Have A Good Day.");

    }
}
