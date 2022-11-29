public class ObjectReferenceApp {
    public static void main(String[] args){
        //psvm + enter for public static void main() shortcut
        //        System.out.println("This file is working...!");
        Byte numberOfSeats=5;
        Short horsePower=392;
        Integer price=4999;
        Long registrationNumber=9989333332L;
        Float fuelConsumptionsCombine=15.5F;
        Double fuelConsumptionsPrecise=15.533777;

        Boolean isDamaged=true;
        Character energyEfficiencyCategory='G';

//        BUILD IN OBJECT PREFERENCES==> equals(),toUpperCase(),toLowerCase(),toFloat(),toInt()

        String carModel="Doudge Chellanger SRT-1544";
        String carModelNew=new String("Doudge Chellanger SRT-1544");
        System.out.println("number of Seats : "+numberOfSeats);
        System.out.println("Horse power: "+horsePower);
        System.out.println("Price: $"+price.floatValue());//to float
        System.out.println("Reg NO: "+registrationNumber);
        System.out.println("Fuel consumption combined: "+fuelConsumptionsCombine);
        System.out.println("Fuel consumption Precised: "+fuelConsumptionsPrecise.intValue());// to int
        System.out.println("is car is Damaged :"+isDamaged);
        System.out.println("Efficiency category :"+energyEfficiencyCategory);
        System.out.println("car model :"+carModel.toUpperCase());
        System.out.println("car model New is :"+carModelNew.toLowerCase());
        System.out.println("Car model is equal to car model new? :"+carModel.equals(carModelNew));//true

    }
}
