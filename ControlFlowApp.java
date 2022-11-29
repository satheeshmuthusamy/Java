public class ControlFlowApp {
    public static void main(String[] args){
        boolean isCarDamaged=true;
        String carColor="red";
        char energyEfficiencyCat='A';

        if(isCarDamaged){
            System.out.println("Car is damaged");
        }else {
            System.out.println("Car is damage free.");
        }

        if(carColor=="red"){
            System.out.println("This car color is red");
        } else if (carColor=="green") {
            System.out.println("Car color is green");
        }else if (carColor=="blue") {
            System.out.println("Car color is blue");
        }else{
            System.out.println("Car color is not defined.");
        }

//        switch case
        switch(energyEfficiencyCat){
            case 'A':
                System.out.println("Absolute great in energy efficiency.");
                break;
            case 'B':
                System.out.println("Lesser compared to other cars");
                break;

            case 'C':
            case 'D':
                System.out.println("Poor energy efficiency category.");
            default:
                System.out.println("Energy consumption is not defined");
        }

//        global and local variable
        {
            int numberOfOwners=5;  //==>global variable
            {
//                int numberOfOwners=5;//local variable
              numberOfOwners++;
            }
            System.out.println("The number of owners count is "+numberOfOwners +".");
        }


    }
}
