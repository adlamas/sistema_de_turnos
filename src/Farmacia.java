



public class Farmacia {

	static Maquina M = new Maquina();	
	
	ABBS arbolS = new ABBS();
	ABB2 arbol2 = new ABB2();
	
	public void sacarTurnoA( Cliente C){
		if(C.turno != null){ throw new Error("Ya ten�s un turno"); }
		C.turno = M.DarTicketA();
	}
	public void sumarALaColaA(Cliente C){
		arbol2.insertar(C);
		
	}	
	
	public void atenderClientes(){ //atiende de a uno a los clientes
			Cliente C = arbol2.devolver();
			arbolS.insertar(C);	
			System.out.println(C.getEstado() + ", Numero: " + C.getNumeroTicket() ); //As� es como salen de la cola de prioridad
			//Los primeros que son atendidos son los de prioridad de embarazo y despu�s los de n�mero m�s bajo
	}
	
	public void ClientesYTramites(){ //muestra los clientes ya atendidos en forma alfab�tica		
			arbolS.recorrerEnOrden(arbolS.raiz);			
	}
	
	
	public static void main(String args[]){		
		Farmacia miFarmacia = new Farmacia();
		
		
		Cliente C = new Cliente("Carlos Tevez", false, "Comprar medicamento");
		Cliente J = new Cliente("Juan Palacio", false, "Pago f�cil");
		Cliente R = new Cliente("Romi Yan", true, "Comprar medicamento");
		Cliente L = new Cliente("Laura Fidalgo", true, "extracci�n de sangre");
		Cliente D = new Cliente("David Parera", false,"Pago f�cil");
		Cliente G = new Cliente("Gimena Accardi", false,"extracci�n de sangre");
		Cliente V = new Cliente("Victoria Secret", true, "Comprar medicamento");
		
		miFarmacia.sacarTurnoA( C);
		miFarmacia.sacarTurnoA( V);
		miFarmacia.sacarTurnoA( R);
		miFarmacia.sacarTurnoA( J);	
		miFarmacia.sacarTurnoA( D);
		miFarmacia.sacarTurnoA( L);
		miFarmacia.sacarTurnoA( G);	

		
		miFarmacia.sumarALaColaA(C);
		miFarmacia.sumarALaColaA(V);
		miFarmacia.sumarALaColaA(R);
		miFarmacia.sumarALaColaA(J);
		miFarmacia.sumarALaColaA(D);
		miFarmacia.sumarALaColaA(L);
		miFarmacia.sumarALaColaA(G);
		
		miFarmacia.atenderClientes();
		miFarmacia.atenderClientes();
		miFarmacia.atenderClientes();
		miFarmacia.atenderClientes();
		miFarmacia.atenderClientes();
		miFarmacia.atenderClientes();
		miFarmacia.atenderClientes();
					
		miFarmacia.ClientesYTramites();	 	
		
	
		
		
	
		
	}
	
}
