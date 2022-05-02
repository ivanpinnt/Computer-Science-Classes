package csc.currentproject;

// Ivan Pinnt
// CSC 160 Computer Science I, section 680
// Apr 18, 2022

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
    Stock(String symbol, String name, double previousClosingPrice, double currentPrice)
    {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    // METHOD *
    void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    // *
    void setName(String name) {
        this.name = name;
    }
    // *
    void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }
    // *
    void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    // *
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
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