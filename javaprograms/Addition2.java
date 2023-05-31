class Addition2{

  public float additionfloat(float number1,float number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      float sum;
      Addition2 addition=new Addition2();
	  sum= addition.additionfloat(1.5f,1.5f);
	  System.out.println("Addition of 2-numbers:" +sum);
  }
  
  
}
