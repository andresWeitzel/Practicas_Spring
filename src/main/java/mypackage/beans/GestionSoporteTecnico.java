package mypackage.beans;

import org.springframework.stereotype.Component;

import mypackage.interfaces.I_SoporteTecnico;

@Component 
public class GestionSoporteTecnico implements I_SoporteTecnico{

	@Override
	public String getPuesto() {
		// TODO Auto-generated method stub
		return "Cisco Admin";
	}

}
