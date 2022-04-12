package csc.a;

//
// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 11, 2022

// Stock object Exercise 9.2 Pg. 363
// Using data fields, constructors, and methods to create a previous day and
// current day price of stocks

class Stock
{
    // LIBRARY
    String name;
    String symbol;
    double previousClosingPrice;
    double currentPrice;

    // CONSTRUCTORS
    Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
    }

    // METHOD
    String getSymbol() {
        return symbol;
    }

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }

    // CALL CONSTRUCTOR & METHOD
    public static void main(String[] args) {
        //Create a new Stock object with the specified data using the constructor.
        Stock ORCLStock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        Stock YAHOOStock = new Stock("YAHOO", "Yahoo", 34.5, 34.35);
        //Print the change in percent of the stock using the getChangePercent method.
        System.out.println("The percent change is " + ORCLStock.getChangePercent() + "%");
    }
}