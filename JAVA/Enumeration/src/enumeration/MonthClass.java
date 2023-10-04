package enumeration;
import java.util.Scanner;

public class MonthClass {
    public static void displayDaysInMonths(){
        Scanner scanner=new Scanner(System.in);
        enum months {January(31), February(28), March(31), April(30), May(31), June(30), July(31), Auguest(31), September(30), October(31), November(30), December(31);
            final int days;
            months(int days) {
                this.days=days;
            }
        }
        months monthDays=months.February;
        switch (monthDays){
            case January:
                months m=months.January;
                System.out.println("January ="+m.days);
                break;
            case February:
                months m1=months.February;
                System.out.println("January ="+m1.days);
                break;
            case March:
                months m2=months.March;
                System.out.println("January ="+m2.days);
                break;
            case April:
                months m3=months.April;
                System.out.println("January ="+m3.days);
                break;
            case May:
                months m4=months.May;
                System.out.println("January ="+m4.days);
                break;
            case June:
                months m5=months.June;
                System.out.println("January ="+m5.days);
                break;
            case July:
                months m6=months.July;
                System.out.println("January ="+m6.days);
                break;
            case Auguest:
                months m7=months.Auguest;
                System.out.println("January ="+m7.days);
                break;
            case September:
                months m8=months.September;
                System.out.println("January ="+m8.days);
                break;
            case October:
                months m9=months.October;
                System.out.println("January ="+m9.days);
                break;
            case November:
                months m10=months.November;
                System.out.println("January ="+m10.days);
                break;
            case December:
                months m11=months.December;
                System.out.println("January ="+m11.days);
                break;
            default:
                System.out.println("Invalid days.");
        }
    }
}