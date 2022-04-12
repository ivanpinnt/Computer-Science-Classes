package csc.currentproject;

//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 11, 2022

// Coffee dispenser project

class CoffeeDispenser
{
    // LIBRARY
    int ouncesRemaining;

    // CONSTRUCTOR
    CoffeeDispenser() {
        // connect
        this.ouncesRemaining = 128;
    }

    // METHODS
    void dispense(int num)
    {
        // connect
        if (num <= this.ouncesRemaining) {
            this.ouncesRemaining = this.ouncesRemaining - num;
        }
    }
    // *
    int returnOuncesRemaining() {
        return this.ouncesRemaining;
    }
    // *
    void refillDispenser() {
        this.ouncesRemaining = 128;
    }

    // OUTPUT (DO NOT NEED FOR ASSIGNMENT)
    public static void main(String[] args)
    {
        CoffeeDispenser coffeeDisp = new CoffeeDispenser(); // new class
        System.out.println("Starting amount: " + coffeeDisp.returnOuncesRemaining()); // what number we start at

        // DISPENSE AMOUNT
        coffeeDisp.dispense(90); // minus from starting amount, unless number is too big

        System.out.println("After dispensing: " + coffeeDisp.returnOuncesRemaining()); // return aftermath
        coffeeDisp.refillDispenser(); // refill time!
        System.out.println("Refilled back to (" + coffeeDisp.returnOuncesRemaining() + ")");
    }
}