package pe.edu.upeu.ws;

public class ClienteService {
public static void main(String[] args) {
	CasoDaoImpService caso = new CasoDaoImpService();
	CasoDao cliente = caso.getCasoDaoImpPort();
	System.out.println("Tarea");
	System.out.println(cliente.calcularSueldo(40, 20));
	
}
}
