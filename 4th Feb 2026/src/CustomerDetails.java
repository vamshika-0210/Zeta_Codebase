import java.util.Date;
import java.time.Year;
import java.time.LocalDate;

public class CustomerDetails {
    LocalDate date;
    String CustomerName;
    int currentYear = Year.now().getValue();
    int AgeCalculate(LocalDate date){
        int year = date.getYear();
        int Age = currentYear - year;
        return Age;
    }
    private String PAN;
    String Address;
}
