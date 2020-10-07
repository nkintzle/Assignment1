package cse360assignment02;

public class AddingMachine { // declare private variables
    private int total;
    private String printTotal;

    public AddingMachine () { // AddingMachine function initialises variables to 0
        total = 0;  // not needed - included for clarity
        printTotal = "0";
    }

    public int getTotal () { // getTotal returns total
        return total;
    }

    public void add (int value) { // add adds value and appends it to previous printTotal value
        total += value;
        printTotal = printTotal + " + " + value;
    }

    public void subtract (int value) { // subtract function adds value and appends it to previous printTotal value
        total -= value;
        printTotal = printTotal + " - " + value;
    }

    public String toString () { // returns printTotal in concatenated string format
        return printTotal.toString();
    }

    public void clear() { // clear function "resets memory"
        total = 0;
        printTotal = "0";
    }
}