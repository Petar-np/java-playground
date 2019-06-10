package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(true);
	    printer.fillToner(30);
	    printer.printPage();
	    printer.printPage();
		System.out.println("Toner level: " + printer.getTonerLevel());
	    for (var i = 0; i < 100; i++) {
	        printer.printPage();
        }
		printer.fillToner(40);
		printer.fillToner(30);
    }
}
