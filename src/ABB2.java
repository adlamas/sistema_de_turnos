import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ABB2 {
	
	
	
	Nodo raiz;
	ColaDePrioridadConArreglos cola = new ColaDePrioridadConArreglos();
	
	public ABB2(){
		raiz = null;
	}
	
	private void recorrerEnOrden(Nodo N){
		
		 if(N != null)
		{
			
			recorrerEnOrden(N.izq);
			//System.out.println(N.llave);
			cola.enqueue(N.valor);
			recorrerEnOrden(N.der);
		}
		
	}
	
	public Cliente devolver(){
		if (cola.isEmpty()){ recorrerEnOrden(raiz); }
		
		return (Cliente)cola.dequeue();
	}
	
	
	
	
	
	public void insertar(Cliente C){
		
		Nodo n = new Nodo(C.getNumeroTicket());
		n.valor = C;
		
		if(raiz == null)
		{
			raiz = n;
		}
		
		
	  else{ //si la raíz tiene algún elemento
			
		 	if(C.getEstado() == true && raiz.izq != null)//Si el cliente está embarazado y la primera izquiera llena:
			{
				
				Nodo temporal = raiz.izq;
				Nodo anterior = null;
				
			while(temporal != null)
			{
			 anterior = temporal;
			 
			 if(n.llave >= temporal.llave)
			 	{
				 temporal = temporal.der;
			 }
			 else{
				 temporal = temporal.izq;
			 	 }
			}
			
			if(n.llave < anterior.llave)
			{
			anterior.izq = n;
			}else{
				anterior.der = n;
			}
			
		}//------------IF */
		 	
		 	if(C.getEstado() == false && raiz.der != null)//Si el cliente está embarazado y la primera izquiera llena:
			{
				
				Nodo temporal = raiz.der;
				Nodo anterior = null;
				
			while(temporal != null)
			{
			 anterior = temporal;
			 
			 if(n.llave >= temporal.llave)
			 	{
				 temporal = temporal.der;
			 }
			 else{
				 temporal = temporal.izq;
			 	 }
			}
			
			if(n.llave < anterior.llave)
			{
			anterior.izq = n;
			}else{
				anterior.der = n;
			}
			
		}	
		 	
		 if(C.getEstado() == true && raiz.izq == null  ){//si cliente está embarazado y la izq de la raiz no tiene nada
					raiz.izq = n; 
					}
				
		 if(C.getEstado() == false && raiz.der == null  ){//si cliente está embarazado y la der de la raiz no tiene nada
					raiz.der = n; 
					}
			
			
			
	}//--------------------------------------------------------------------------- ELSE
		
		
		
}
	
	public class Nodo{
		
		public Nodo padre; //padre
		public Nodo der;
		public Nodo izq; 
		public int llave; //Como se pone en que lugar
		public Object valor;
	
	
	public Nodo(int key){
		
		llave = key;
		der = null;
		izq = null;
		padre = null;
		valor = null;
		}
	}
}
