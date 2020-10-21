import java.util.Enumeration;

public class Statement {
    public String printHeader(Customer aCustomer,  String begin,  String end) {
        return begin + aCustomer.getName() + end;
    }

    public String printInfo(Rental aRental, String begin, String mid, String end) {
        return begin + aRental.getMovie().getTitle()+ mid +
               String.valueOf(aRental.getCharge()) + end;
    }

    public String printFooter(Customer aCustomer, String begin, String mid1, String mid2, String end) {
        return begin + String.valueOf(aCustomer.getTotalCharge()) + mid1 + mid2 + 
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + end;
    }
    
    public String value(Customer aCustomer, String b1, String e1, String b2, String m2, String e2,
                        String b3, String m3, String m4, String e3) {
        Enumeration rentals = aCustomer.getRentals();
        String result = printHeader(aCustomer, b1, e1);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += printInfo(each, b2, m2, e2);
        }

        result += printFooter(aCustomer, b3, m3, m4, e3);
        return result;
    }
}
