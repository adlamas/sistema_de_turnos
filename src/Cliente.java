import java.util.Comparator;
import java.util.PriorityQueue;


public class Cliente implements  Comparable<Cliente> //, Comparator<Cliente>
{

	
	private String nombreCompleto;
	protected Ticket turno;
	private boolean estado;
	private boolean fueAtendido = false;
	private String tramiteRealizado;
	
	
	
	public Cliente(String nombre, boolean embarazo, String tramite){
		this.nombreCompleto = nombre;		
		this.estado = embarazo;
		this.tramiteRealizado = tramite;
	}
	
	public String getNombre(){
		return nombreCompleto;
	}
	public void setNombre(){
		this.nombreCompleto = nombreCompleto;
	}
	
	public boolean getEstado(){
		//Devuelve un boolean, si está, o no, embarazada la cliente
		return estado;
	}
	public void setEstado(boolean B){
		this.estado = B;
	}
	
	
	
	public int getNumeroTicket(){
		if(turno == null){ throw new Error("No sacaste, aún, un ticket"); }
		return turno.getNumero();
	}
	
	public Ticket darTicket(){
		return turno;
	}
	
	public void ClienteAtendido(){
		this.fueAtendido = true;
	}
	
	public boolean FueAtendido(){
		return this.fueAtendido;
	}
	
	public void tramiteRealizado(String tramite){
		this.tramiteRealizado = tramite;
	}
	
	public String devolverTramite(){
		
		return this.tramiteRealizado;
	}
	
	
	public int compareTo(Cliente C) {
		
		if(this.getEstado() == true && C.getEstado() == false){ return -1; }
		if(this.getEstado() == false && C.getEstado() == true){ return 1; }
		return  (this.getNumeroTicket() - C.getNumeroTicket());
	}
	

	
	
	



	
	
	

	
}
