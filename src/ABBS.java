import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;



public class ABBS{
	
	
	Nodo raiz;
	
	public ABBS(){
		raiz = null;
	}
	
	public void recorrerEnOrden(Nodo N){
		
	
		if(N != null)
		{
			recorrerEnOrden(N.izq);
			System.out.println(N.llave +", trámite: " + N.tramite);		
			recorrerEnOrden(N.der);
		}
		
	}
	
	
	
	public void insertar(Cliente C){
		
		Nodo n = new Nodo(C.getNombre(), C.devolverTramite());
		n.valor = C;
		
		if(raiz == null)
		{
			raiz = n;
		}
		else{
			Nodo temporal = raiz;
			Nodo anterior = null;
			while(temporal != null)
			{
			 anterior = temporal;
			 if(n.llave.compareTo(temporal.llave) > 0)//si la llave del que tengo es mayor que el temporal, poner a la der
			 {
				 temporal = temporal.der;
			 }
			 else{
				 temporal = temporal.izq;
			 	 }
			}
			if(n.llave.compareTo(anterior.llave) < 0)
			{
			anterior.izq = n;
			}else{
				anterior.der = n;
			}
		
		}
	}
	
	public class Nodo{
		
		public Nodo p; //padre
		public Nodo der;
		public Nodo izq; 
		public String llave; //Como se pone en que lugar
		private String tramite;
		public Object valor;
	
	
	public Nodo(String key, String tarea){
		
		llave = key;
		tramite = tarea;
		der = null;
		izq = null;
		p = null;
		valor = null;
		}
	}
}
