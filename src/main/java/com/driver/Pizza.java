package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheeseAdded;
    private boolean extraToppingAdded;
    private boolean paperbagAdded;
    private int basePrice;
    private boolean isBill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.basePrice = isVeg ? 300 : 400;
        this.price = basePrice;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded) {
            extraCheeseAdded = true;
            price += 80;
            this.bill += "Extra Cheese Added: " + 80 + "\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingAdded) {
            extraToppingAdded = true;
            price += isVeg ? 70 : 120;
            this.bill += "Extra Topping Added: " + (isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperbagAdded) {
            paperbagAdded = true;
            price += 20;
            this.bill += "Paperbag Added: " + 20 + "\n";
        }
    }
    StringBuilder finalbill = new StringBuilder();
    public String getBill(){

        if(isBill==false) {

            finalbill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
            finalbill.append(bill);
            finalbill.append("Total Price: ").append(price).append("\n");
            return finalbill.toString();
        }
        return finalbill.toString();

    }
}
