public class Exercise {
    public static void main(String[] args) {
        String name="Satheesh";
        System.out.println("Hello my name is " +name);
        byte age=24;
        char grade='A';//use single quotation for char
        System.out.println("Age of "+ name +"is "+age + " and the grade is "+grade+".");
        birthYearCalculation(age,name);
    }

    public static void birthYearCalculation(int age,String name){
        System.out.println("The birth year of "+name +" is " +(2022-age));
    }
}
