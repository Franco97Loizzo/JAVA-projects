package parcial;

public class Cirujano extends Medico {

	
	Cirujano(String nombre, String apellido){
		super(nombre,apellido);
	}
	
	
	@Override
	public int sueldoMensual() {
		int sueldoCirujano = getHonorario()*25/100;
		return honorario + sueldoCirujano;
	}
	
}
