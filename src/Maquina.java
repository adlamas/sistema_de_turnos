
public class Maquina {
	
	 int NumeroA = 1;
	 int NumeroB = 1;
	
	public TicketA DarTicketA(){
		//Devuelve un ticketA con un número específico
		int n = NumeroA;
		TicketA miTicketA = new TicketA(n);
		NumeroA++;
		return  miTicketA;
		
	}
	
	

}
