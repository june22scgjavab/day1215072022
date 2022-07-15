package com.infosys.exception.demo2;
class MobileShopee{
    static int stockAvailable = 400;
    public static void checkStock(int quantityRequired) {
        if(stockAvailable < quantityRequired)
            throw new Exception("There is not enough stock available.");
        System.out.println("Please proceed to the check-out");    
    }
    public static void buyMobiles(int quantityRequired) {
        checkStock(550);
        System.out.println("Please pay for the items in your cart.");    
    }
    public static void main(String[] args) {
        buyMobiles(550);
    }
}
