/*----------------------------------------------------------------------------------------------------------------------
	+ operaörünün iki operandı da String türündense bu durumda bu opertör operandlara ilişkin yazıların birleştirilmesi
	ile elde edilen yeni bir String referansı üretir  
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{			
		String firstName = "Oğuz";
		String lastName = "Karan";
		String fullName;
		
		fullName = firstName + " " + lastName.toUpperCase();
		
		System.out.println(fullName);
	}
}

