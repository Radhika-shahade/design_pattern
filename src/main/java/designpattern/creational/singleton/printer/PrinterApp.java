package designpattern.creational.singleton.printer;

import designpattern.creational.singleton.printer.Printer;

public class PrinterApp {
    public static void main(String[] args) {
//        example of using printer to print document
      Printer officePrinter = Printer.getInstance();
      Printer officePrinter2= Printer.getInstance();
      officePrinter.printDocument("document1");
      officePrinter.printDocument("document2");
      officePrinter2.printDocument("document3");
    }
}
