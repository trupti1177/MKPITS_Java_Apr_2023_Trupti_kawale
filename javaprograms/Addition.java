class Addition{

  public int additionInteger(int number1,int number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      int sum;
      Addition addition1=new Addition();
	  sum= addition1.additionInteger(10,15);
	  System.out.println("Addition of 2-numbers:" +sum);
  }
  
  
}
