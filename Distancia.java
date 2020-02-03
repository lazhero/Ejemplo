import java.io.*;
class Distancia{
	public static double MillastoMetros(double Millas){
	return Millas*1852;

	}
	public static double MillastoKilometros(double Millas){
	return Millas*(1852/1000);

	}
	public static String Lector(String Mensaje){
	BufferedReader Lectura= new BufferedReader(new InputStreamReader(System.in));
	String texto;
	try{
	texto=Lectura.readLine();

	}
	catch(Exception e){
	e.printStackTrace();
	texto="";

	}
	return texto;

	}
	public static void main(String[] args){
	double Numero=Double.parseDouble(Lector("Por favor indique la cantidad de millas correspondientes"));
	System.out.println(Numero+" millas equivalen a: "+MillastoKilometros(Numero)+ " kilometros");

	}	



}