package mypackage.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mypackage.beans.Empleados;
import mypackage.interfaces.I_Empleados;

@SpringBootApplication
public class TestEmpleado {

	public static void main(String[] args) {
	
		//Leemos el xml de configuracion
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pedimos el Bean al contenedor con autoWired(comienzo del nombre de los beans en minuscula)
		Empleados empleado1=context.getBean("empleados",Empleados.class);
		
		//Usamos el beans
		System.out.println(empleado1.getTareas());
		System.out.println(empleado1.getSalario());
		
		//Cerramos el contexto
		context.close();
	}

}
 