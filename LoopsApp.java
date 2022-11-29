public class LoopsApp {
    public static void main(String[] args){
//        while loop
        int i=1;
        while(i<=5){
            System.out.println(i+". hello this is while loop.");
            i++;
        }
        System.out.println();

        //    Do while loop
        int j=1;
        do{
//            do something
            System.out.println("hello from do while loop");
//            incrementation
            j++;
        } while(j<=5);
        System.out.println("Value of i is :"+j);
        System.out.println();

//        For loop
        for(int k=1;k<=5;k++){
            if(k==3){
//                continue;//prints only 1 2  4 5 ->while 3 it escapes sout
                break;
            }
            System.out.println(k+".Hello from for loop");
        }
//        System.out.println(k);// here k is not accesible putside the loop
        System.out.println();

//        loop inside the loop
        for (int k = 0; k <5 ; k++) {
            for(int l=0;l<5;l++){
                System.out.println("k is ="+k +" l is equals to :"+l+" loop inside another loop");
            }
            System.out.println();
        }
        System.out.println();
    }

}
