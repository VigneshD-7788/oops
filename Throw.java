package oops;

public class Throw {

    static void checkEligibility(int stuage, int stuweight){
        if(stuage<12 && stuweight<40) {
            throw new ArithmeticException("Student is not eligible for registration");
        }
        else {
            System.out.println("Student Entry is Valid!!");
        }
    }

    public static void main(String args[]){
        System.out.println("Welcome to the Registration process!!");
        checkEligibility(10, 39);
        System.out.println("Have a nice day..");

    }
}

