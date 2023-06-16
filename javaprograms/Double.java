class Double{
	public double Moddouble( double number1, double number2){
		return number1 % number2;
	}
}
class Doublemod{
	public static void main(String[] args){
		Double mod = new Double();
		double ans = mod.Moddouble(40.2f,10.1f);
		System.out.println(ans);
	}
}