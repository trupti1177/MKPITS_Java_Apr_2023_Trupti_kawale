class Addition3{

  public double additiondouble(double number1,double number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      double sum;
      Addition3 addition=new Addition3();
	  sum= addition.additiondouble(10.5,15.5);
	  System.out.println("Addition of 2-numbers:" +sum);
  } 
}
