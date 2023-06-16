class LongMod{
	public long ModLong(long number1, long number2){
		return number1 % number2;
	}
}
class LongModulo{
	public static void main(String[] args){
		LongMod longmod = new LongMod();
		long ans = longmod.ModLong(2000,439);
		System.out.println(ans);
	}
}