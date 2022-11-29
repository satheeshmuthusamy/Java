public class Patterns {
    public static void main(String[] args) {
        pattern0();
        pattern1();
        pattern2();
    }


//    pattern0
//    *
//    **
//    ***
//    ****
//    *****
    public static void pattern0(){
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


    //    pattern1
//    1
//    22
//    333
//    4444
//    55555

    public static void pattern1(){
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }

//    pattern-3
//    1
//    12
//    123
//    1234
//    12345
    public static void pattern2(){
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
