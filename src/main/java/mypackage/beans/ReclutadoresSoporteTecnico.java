package mypackage.beans;

import org.springframework.stereotype.Component;

import mypackage.interfaces.I_SoporteTecnico;

@Component 
public class ReclutadoresSoporteTecnico implements I_SoporteTecnico{

	@Override
	public String getPuesto() {
		// TODO Auto-generated method stub
		return "Recluiter Manager";
	}

}
