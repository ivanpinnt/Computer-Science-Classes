//

// Ivan Pinnt

// CSC 160 Computer Science I, section 680

// Feb 19, 2022

// Using While-Do statement, write a program that will print 25 prime numbers, each on a new line.

//

class Main
{
    public static void main(String[] args)
    {

        System.out.println("Prime numbers");

        // library
        int prime_number = 2;
        int counter  = 0;

        // do while loop
        do{

            //check if number is prime
            if(numberIsPrime(prime_number)){
                //print out number is prime
                System.out.println(prime_number);
                counter++;
            }

            //grab numbers from the counter
            prime_number++;
            // counter to make sure it doesnt fly to infinity
        } while( counter <= 25 ); //would it not be numero?

        // prime_number - the actual number, 0,1,2,3,4,5,6... infinity
        // counter  - signifies the number of prime numbers we want to find 25
    }

    //defined boolean to call in do-while loop
    public static boolean numberIsPrime(int p)
    {
        boolean returnValue = true;
        for(int x = 2; x <= (p/2); x++)
        {
            if(p%x == 0)  returnValue = false;
        }
        return returnValue;
    }
}