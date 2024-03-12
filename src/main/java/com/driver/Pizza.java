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

        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingAdded) {
            extraToppingAdded = true;
            price += isVeg ? 70 : 120;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperbagAdded) {
            paperbagAdded = true;
            price += 20;

        }
    }
   // StringBuilder finalbill = new StringBuilder();
    public String getBill(){


        if(isBill==false) {
            this.bill += "Base Price Of The Pizza: " + basePrice + "\n";
            if(extraCheeseAdded){
                this.bill += "Extra Cheese Added: " + 80 + "\n";
            }
            if(extraToppingAdded){
                this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
            }
            if(paperbagAdded){
                this.bill += "Paperbag Added: " + 20 + "\n";
            }
            this.bill += "Total Price: " +price + "\n";
            isBill = true;
        }
        return bill;

    }
}




