import java.io.*;
class ConversorDivisas{
	public static void main(String[] args){
	System.out.println("Digite el valor en euros");
	BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	String texto;
	try {
		texto=buff.readLine();
	}
	catch (Exception e) {
		e.printStackTrace();
		texto="";

	}
	double Valor=Double.parseDouble(texto);
	double Resultado=Euros_Colones(Valor);
	System.out.println("El valor en colones es: "+Resultado);
	
		

	


	}
	public static double Euros_Colones(double Euros){
	return Euros*625;


	}
	public static double Colones_Euros(double Colones){
	return Colones/625;


	}



}