/*----------------------------------------------------------------------------------------------------------------------
  	Character toXXX metotları. Aşağıdaki örneği inceleyiniz
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String str = kb.nextLine();
		
		int len = str.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(i);
			
			ch = Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
			
			System.out.printf("%s", ch);
		}
		
		System.out.println();
	}
}

