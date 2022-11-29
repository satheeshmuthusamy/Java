public class OperatorApp {
    public static void main(String[] args){
        String carModel="Dodge chellanger SRT-392";
        int price=29999;
        int moneyInBank=100000;
        boolean isDamaged=true;

//        arithmetic operators
        System.out.println("Price of the car model" +carModel +" is $ "+price+".");
        int increasedPrise=price+2000;
        System.out.println("The increased prise of car model "+carModel +" is "+increasedPrise);

        int decreasedPrise=price+3000;
        System.out.println("The decreased prise of car model "+carModel +" is "+decreasedPrise);

        int twoCarsPrice=price*2;
        System.out.println("The price of two cars are "+twoCarsPrice);

        int doudgesYouCanBuy=moneyInBank/price;
        System.out.println("The number of cars you can buy with your bank balance us "+doudgesYouCanBuy);

        int remainingAmount=moneyInBank%price;
        System.out.println("The money remaining after buying the cars is "+remainingAmount);
        System.out.println();

        int priceNegative=-49999;
        int priceNegtiveWithPlusSign=+priceNegative;//remains negative
        System.out.println("The price with positive sigh with negative sign is "+priceNegtiveWithPlusSign);

        int priceNegativeWithNegativeSign=-priceNegative;//turns positive
        System.out.println("The price negative with negative sign is "+priceNegativeWithNegativeSign);

        int priceOneDollerIncreased=++price;//price+1
        System.out.println("The price increased one doller is "+priceOneDollerIncreased);

        int priceOneDollerDecreased=--price;//price-1
        System.out.println("The price doller decreased is"+priceOneDollerDecreased);
        System.out.println("This car is damaged :"+isDamaged);
        System.out.println();

//        Equality and relational operator
        System.out.println("Car price is equals the money in the bank : "+(price==moneyInBank));
        System.out.println("Cars price doesn't equals to money in the bank : "+(price!=moneyInBank));
        System.out.println("Cars price is greater than the money in the bank :"+(price>moneyInBank));
        System.out.println("Cars price is greater less the money in the bank :"+(price<moneyInBank));
        System.out.println("Cars price is greater than or equals tothe money in the bank :"+(price>=moneyInBank));
        System.out.println("Cars price is greater less or equals to the money in the bank :"+(price<=moneyInBank));
        System.out.println("The car model variables datatype is String : "+(carModel instanceof String));
        System.out.println();

//        ternary operator
        String damagedText=isDamaged?"The car is damaged":"The car is not damaged.";
        System.out.println(damagedText);
        System.out.println();

//        logical operators
        String worthSeeingText=!isDamaged || price<=20000?"It's worth seeing the car.":"It's not worth seeing the car.";//OR
        System.out.println(worthSeeingText);
        String worthRepairingText=isDamaged && price<=10000?"It's worth Repairing the car.":"It's not worth repairing the car.";//AND
        System.out.println(worthRepairingText);
        System.out.println();

//        Assignment operators
        price+=1000;
        System.out.println("The price increased is $ "+price);
        price-=1000;
        System.out.println("The price decreased is $ "+price);
        price*=2;
        System.out.println("The price doubled is $ "+price);
        price/=2;//gives rounded values only
        System.out.println("The price divided is $ "+price);
        price%=1000;//subtracts and gives the remaining
        System.out.println("Price remaining is "+price);










    }
}
