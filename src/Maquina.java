
public class Maquina {
	
	 int NumeroA = 1;
	 int NumeroB = 1;
	
	public TicketA DarTicketA(){
		//Devuelve un ticketA con un n�mero espec�fico
		int n = NumeroA;
		TicketA miTicketA = new TicketA(n);
		NumeroA++;
		return  miTicketA;
		
	}
	
	

}
