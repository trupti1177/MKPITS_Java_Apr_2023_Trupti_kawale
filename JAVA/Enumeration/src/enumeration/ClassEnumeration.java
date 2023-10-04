package enumeration;

public class ClassEnumeration {
    public static void display(){
        enum cities{nagpur,wardha,amravati}
//        --------Display Single value------
        cities newCity=cities.amravati;
        System.out.println(newCity);
        System.out.println("====================================");

        //        --------Display all value------
        for(cities c:cities.values()){
            System.out.println(c);
            System.out.println("====================================");


        }



    }
}