package pe.edu.upeu.ws;

import java.io.Console;

import javax.*;
import javax.xml.ws.Endpoint;


public class casoPublic {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1536/soap/caso",new casoDaoImp());
		System.out.println("Funcionando");
	}
	
	
	
	
}
