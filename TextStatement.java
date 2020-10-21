import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String begin = "Rental Record for ";
      String result = printHeader(aCustomer, begin, "\n");
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += printInfo(each, "\t", "\t", "\n");
      }
      //add footer lines
      result += printFooter(aCustomer, "Amount owed is", "\n", "You earned ", "frequent renter points");
      return result;
   }
}
