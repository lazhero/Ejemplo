import java.io.*;
class ParteDecimal{
	private float Numero;
	ParteDecimal(float Recepcion){
		Numero=Recepcion;
	}
	public void Decimal(){
		int comparar=Math.round(Numero);
		if (Numero-comparar!=0)System.out.println("Tiene parte decimal");
		else System.out.println("No tiene parte decimal");

	}
	public static double Lectura(){
		System.out.println("Digite un numero");
		double Numero=0;
		String Texto="";
		boolean nonValid=true;
		BufferedReader Lectura= new BufferedReader(new InputStreamReader(System.in));
		while(nonValid){
			Lectura= new BufferedReader(new InputStreamReader(System.in));
			try{
				Texto=Lectura.readLine();
				Numero=Double.parseDouble(Texto);
				nonValid=false;
			}
			catch(Exception e){
				nonValid=true;
				System.out.println("No se han indicado datos validos");
		
			}
		
		}
		return Numero;
	
	}


}