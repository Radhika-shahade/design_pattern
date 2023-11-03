package designpattern.creational.singleton.printer;
//n this example, the Printer class is a Singleton, ensuring that there's only one printer instance in the office.
// Users can use the printDocument method to print their documents,
// and the paper count is decremented each time something is printed.
public class Printer {
    private static Printer instance;
    private int paperCount;

    //private constructor to prevent instantiation from other class
    private Printer() {
        paperCount = 100;
    }
  public static Printer getInstance()
  {
      if(instance==null)
      {
          instance=new Printer();
      }
      return instance;
  }

  public void printDocument(String document)
  {
      if(paperCount>0)
      {
          System.out.println("printing:" +document);
          paperCount--;
      }
      else {
          System.out.println("Please refill the paper tray");
      }
  }

}
