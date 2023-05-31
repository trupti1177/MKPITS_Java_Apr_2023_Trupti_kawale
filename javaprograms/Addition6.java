class Addition6{

  public long additionlong(long number1,long number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      long sum;
      Addition6 addition=new Addition6();
	  sum= addition.additionlong(123562,45268);
	  System.out.println("Addition of 2-numbers:" +sum);
  }
  
  
}

