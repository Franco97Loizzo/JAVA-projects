package parcial;

import java.util.ArrayList;

public class Hospital {
	private ArrayList <Profesional> profesionales;
	
	public Hospital(){
		this.profesionales = new ArrayList<Profesional>();
	}
	
	public void contratarPro(Profesional e) {
		profesionales.add(e);
	}
	
	public void listarPro() {
		for(Profesional m: profesionales) {
			System.out.println("Nombre: " + m.getNombre() + " Apellido: " + m.getApellido() + " Sueldo: " + m.sueldoMensual());
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
