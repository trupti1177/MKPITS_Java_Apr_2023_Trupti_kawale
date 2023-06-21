public class Main {
    public static void main(String[] args) {

        Perimeter peri = new Perimeter();

//        System.out.println(peri.PerimeterOfRectangle(50, 3));
        System.out.println(peri.PerimeterOfRectangle(2.5f,1.2f));

        //perimeter of triangle

        PerOfTriangle triangle=new PerOfTriangle();
        System.out.println(triangle.PerimeterOfTriangle(20,30,40));
        System.out.println(triangle.PerimeterOfTriangle(2.5f,3.2f,1.8f));

        //Televison example

        Television television=new Television();
        television.ShowContent("sony tv");
        television.ShowContent();

// module

        Module modulus =new Module();
        modulus.module(12,145);
        modulus.module(12.00F,144.144F);

//   Stringconcat

        Stringconcat stringconcat =new Stringconcat();
        stringconcat.squarecube(11L,12L);
        stringconcat.squarecube("11","12");
//square cube

        Squarecube squarecube =new Squarecube();
        squarecube.squarecube(11,12);
        squarecube.squarecube(2L,3L,4L);

        //multidiv
        Multidiv multidiv=new Multidiv();
        multidiv.div(14,12,10);
        //multiplication
        Multiplication multiplication =new Multiplication();
        multiplication.mul(12,2);
        //subtraction

        Substraction substract = new Substraction();
        substract.sub(85,25);

        //dvision

        Division division =new Division();
        division.div(12,144);
        division.div(12F,144.144F);



    }
}