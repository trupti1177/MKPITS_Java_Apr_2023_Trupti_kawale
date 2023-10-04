import enumeration.ClassEnumeration;
import enumeration.MonthClass;

public class Main {

    public static void main(String[] args) {
//        ================CitiesClass=======================
        ClassEnumeration.display();

//===================MonthClass========================================
        MonthClass.displayDaysInMonths();

//  ===============We create enum outside the class and call the values of enum in the main class ================================
        months monthDays=months.February;
        System.out.println(monthDays);
    }
}
enum months {January, February, March}