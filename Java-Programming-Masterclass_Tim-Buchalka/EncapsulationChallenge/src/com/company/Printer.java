package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrintedCount = 0;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner(int mililiters) {
        if(mililiters <= 0) {
            System.out.println("Yeah, right! Nice try dumbass");
        } else if (tonerLevel + mililiters > 100) {
            System.out.println("You can't overfill toner, maximum you can fill in is " + (100 - tonerLevel));
        } else {
            tonerLevel = tonerLevel + mililiters;
            System.out.println("You refilled toner with " + mililiters + "ml, current toner level is " + tonerLevel + "ml");
        }
    }

    public void printPage() {
        if (tonerLevel > 0) {
            System.out.println("Printing page.");
            pagesPrintedCount++;
            tonerLevel --;
            System.out.println("Toner level is now " + tonerLevel);
        } else {
            System.out.println("You don't have enough toner, please refill it.");
        }

    }
}
