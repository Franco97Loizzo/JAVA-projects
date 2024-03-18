package parcial;

public class CirujanoEspecial extends Cirujano {
	CirujanoEspecial(String nombre,String apellido){
		super(nombre,apellido);
	}
	
	@Override
	public int sueldoMensual() {
		int sueldoCiru = getHonorario()*25/100; //125000
		int sueldoCirujanoEspecial = honorario + sueldoCiru; //625000
		return honorario + (sueldoCirujanoEspecial *25/100); //156250
	}
	
}
