package parcial;

public abstract class Profesional {
	protected int honorario = 500000;
	private String nombre;
	private String apellido;
	
	
	Profesional(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	};
	
	public abstract int sueldoMensual();

	public int getHonorario() {
		return honorario;
	}

	public void setHonorario(int honorario) {
		this.honorario = honorario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
