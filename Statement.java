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
}
