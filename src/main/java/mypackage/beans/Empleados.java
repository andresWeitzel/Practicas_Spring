package mypackage.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import mypackage.interfaces.I_Empleados;
import mypackage.interfaces.I_SoporteTecnico;


@Component
public class Empleados implements I_Empleados {
	
	/*@Autowired: Spring busca si hay alguna clase que implemente la interfaz I_SoporteTecnico, 
	* y si la encuentra es de esa clase de donde obtiene la inyeccion 
	* de depencia(clase GestionSoporteTecnico). Los autowired se pueden crear en constructores,
	* metodos, etc. */
	/*@Qualifier: Al trabajar con mas de 2 clases que implementan la misma interfaz
	 * se debe indicar a traves de esta anotattion cual sera la empleada*/
	
	@Autowired
	@Qualifier("reclutadoresSoporteTecnico")
	private I_SoporteTecnico nuevoSoporteTecnico;
	
//	//Atenti al Qualifier del constructor
//	@Autowired
//	public Empleados(
//			@Qualifier("reclutadoresSoporteTecnico")
//			I_SoporteTecnico nuevoSoporteTecnico
//			)
//	{
//		super();
//		this.nuevoSoporteTecnico = nuevoSoporteTecnico;
//	}



	
	public Empleados() {
		super();
	}

	
	@Override
	public String getTareas() {
		// Aca estamos usando el autowired junto a inyeccion de depencias
	return nuevoSoporteTecnico.getPuesto();
	}


	
	@Override
	public String getSalario() {
		// TODO Auto-generated method stub
		return "30.000";
	}

	
	
	
	//------TEST DE BEANS----------
	
	//Metodo Init
	public void metodoInit() {
		System.out.println("Desntro del metodo Init para las tareas"
				+ " a ejecutar antes del que el bean este listo");
	}
	
	//Metodo Destroy
	public void metodoDestroy() {
		System.out.println("Desntro del metodo Destroy  para las tareas"
				+ " despues de ejecutar el bean");
	}
	//------FIN TEST DE BEANS--------





	

}
