/*----------------------------------------------------------------------------------------------------------------------
	Soyut bir tür ne zaman interface ne zaman abstract sınıf yapılmalıdır? Programcı buna nasıl karar verecektir? Önce
	her zaman interface düşünülmeli, interface özellikleri soyut türe ilişkin domanin'de yetersiz kalıyorsa abstract
	sınıf tercih edilmelidir. Örneğin soyut türün non-static veri elemanı olması gerekiyorsa zaten interface yapılamaz.

	interface yapılabildiği durumda abstract sınıf kesinlikle yapılmamalıdır. Bu durumda interface'i destekleyen bir sınıf
	başka bir sınıftan da türetilebilir. Ayrıca soyut bir türün interface yapılması, abstract sınıfların bakış açısı olarak
	okıunabilirliğini artırır
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
	public static void main(String [] args)
	{

	}
}
