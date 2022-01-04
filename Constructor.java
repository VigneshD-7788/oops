package oops;
// Java Program to illustrate constructor overloading
public class Constructor
{
    // constructor with one argument
    Constructor(String name)
    {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }

    // constructor with two arguments
    Constructor(String name, int age)
    {

        System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " "+ age);

    }

    // Constructor with one argument but with different
    Constructor(long id)
    {

        System.out.println("Constructor with one argument : " + "Long : " + id);
    }
}
class argument
{
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Constructor'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
        Constructor Constructor2 = new Constructor("Shikhar");

        // Invoke the constructor with two arguments
        Constructor Constructor3 = new Constructor("Dharmesh", 26);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Constructor Constructor4 = new Constructor(325614567);
    }
}

