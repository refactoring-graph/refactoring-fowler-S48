import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String begin = "<H1>Rentals for <EM>";
      String end = "</EM></H1><P>\n";
      String result = printHeader(aCustomer, begin, end);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += printInfo(each, "", ": ", "<BR>\n");
      }
      //add footer lines
      result += printFooter(aCustomer, "<P>You owe <EM>", "</EM><P>\n", 
                "On this rental you earned <EM>", "</EM> frequent renter points<P>");
      return result;
   }
}
