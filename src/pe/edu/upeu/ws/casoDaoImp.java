package pe.edu.upeu.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upeu.ws.CasoDao")
public class casoDaoImp implements CasoDao {
	@Override
	public double calcularSueldo(double horas,  double pagohora) {
		double sueldo = 0;
		
			sueldo = horas <= pagohora ? horas * 10 : pagohora * 40 + (horas - 40) * (pagohora + (pagohora/ 2)) ;
			
		return sueldo;
		
			
		
	}
	
	
}
	
	

