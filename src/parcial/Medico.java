package parcial;

public class Medico extends Profesional {

	Medico(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public int sueldoMensual() {
		return getHonorario();
	}
	
}
