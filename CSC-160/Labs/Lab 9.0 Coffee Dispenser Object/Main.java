package csc.a;

//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 3, 2022

// Coffee dispenser project

class Main
{
    // variables go here
    public int ouncesRemaining;

    // connector
    public void coffeeDispenser()
    {
        // connect with later method
        ouncesRemaining = 128;
    }

    // methods go here
    public void dispense(int num)
    {
        // on the ounceRemaining add with later method
        if (num <= ouncesRemaining) {
            ouncesRemaining = ouncesRemaining - num;
        }
    }

    public static int returnOuncesRemaining()
    {
        return ouncesRemaining;
    }

    public static void main(String[] args)
    {
        Main start = new Main();
        System.out.println("Ounces reamining: " + returnOuncesRemaining());

    }
}