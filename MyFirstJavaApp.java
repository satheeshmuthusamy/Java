public class MyFirstJavaApp {

//    it is a special function tells the java execute from here

    public static void main(String[] args){
//        print values
//        System.out.println("Hello world..!");

//        int numberOfFollowers=1000;
//        System.out.println("The count of number of followers is :" +numberOfFollowers);

//        Data types =>1.Primitives ,2.Object references

//        whole numbers
        byte numberOfSeats=5;
        byte numberOfDoors=3;//ctrl + D for copy the same line down
        byte numberOfVehicleOwners=3;
        byte emissionSticker=4;

        short power=363;
        short horsePower=492;
        short co2Emission=333;
        short cubicCapacity=6417;

        int price=39999;
        int mileage=14999;

        long registrationNumber=333333333333333444L;//add L for long numbers and add d for double

        float fuelConsumptionCombined=15.5F;
        float fuelConsumptionUrban=21.4F;
        float fuelConsumptionExtraUrban=13.4F;

        double fuelConsumptionPreciseAverage=15.4444443432324e-1;//e=>10^0

        boolean isDamaged=true;

        char energyEfficientCategory='G';//char for single character

        System.out.println("2022 Dodge chelllange SRT 392.");//sout+tab for println
        System.out.println("Price: $" +price);
        System.out.println("Mileage: $" +mileage +"kms");
        System.out.println("This car is Damaged: $" +isDamaged);
        System.out.println("RegistrationNumber : " +registrationNumber);
        System.out.println("Cubic capacity : " +cubicCapacity);
        System.out.println("Power: " +power +"KWH");
        System.out.println("Horse Power: " +horsePower +"HP");
        System.out.println("co2 emission: " +co2Emission +" g/km");
        System.out.println("emission sticker: " +emissionSticker +" Energy efficiency category");
        System.out.println("Fuel consumption : " +fuelConsumptionCombined +" l/100km");
        System.out.println("Combined Fuel consumption : " +fuelConsumptionUrban +" l/100km");
        System.out.println("Extra Fuel consumption : " +fuelConsumptionExtraUrban +" l/100km");
        System.out.println("Number of previous owners :" +numberOfVehicleOwners);
        System.out.println("Fuel consumption precise average is : " +fuelConsumptionPreciseAverage  );
        System.out.println("Conversion");
        short newNumberOfSeats=numberOfSeats;
        System.out.println("The value of new number df seats: " +newNumberOfSeats);
        double newFuelConsumptions=fuelConsumptionCombined;
        System.out.println("The new fuel consumptions combined : " +newFuelConsumptions);

        byte newPower= (byte) power;//higher to lower (Narrowing)
        System.out.println("The value of the new power is : "+newPower);

    }
}
