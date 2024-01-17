

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		System.out.println("Replace this string with your answer!");
	}
	for (int i = 12; i <e.length(); i+=10){
    digits = e.substring(i-10,i);
    dNum = Double.parseDouble(digits);
System.out.println(dNum);
     if (isPrime(dNum)==false){
   System.out.println( "prime");
  } else  System.out.println( "not prime");
    }

	//Finish this function
	public boolean isPrime(double dNum){
        boolean True = false;
     for (int j = 2; j <= Math.sqrt(dNum); j++){
       if (dNum%j==0)
     True=true;
   } 
   if (True==false)
  return false;
 return true;
	}

}
