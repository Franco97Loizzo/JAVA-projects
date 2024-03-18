package parcial;

import java.util.Scanner;

public class MiniPrgoman {
	static int salida = 1;
	static int opc;
	static int popc;
	static Scanner es = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		while(salida!=0) {
			
			System.out.println("Ingrese una Opcion");
			System.out.println("1 Registrar un profesional");
			System.out.println("2 Listar Profesionales");
			System.out.println("0 salir");
			opc= es.nextInt();
			es.nextLine();
			switch(opc) {
			case 1:
				System.out.println("Ingrese nombre");
				String nombre = es.nextLine();
				System.out.println("Ingrese Apellido");
				String apellido = es.nextLine();
				System.out.println("Ingrese tipo de Profesional");
				System.out.println("1 Medico");
				System.out.println("2 Cirujano");
				System.out.println("3 Cirujano Especial");
				popc = es.nextInt();
				es.nextLine();
				switch(popc) {
				case 1:
					Medico nuevoMedico = new Medico (nombre,apellido);
					nuevoMedico.sueldoMensual();
					hospital.contratarPro(nuevoMedico);
					break;
				case 2:
					Cirujano nuevoCirujano = new Cirujano(nombre,apellido);
					hospital.contratarPro(nuevoCirujano);
					break;
				case 3:
					CirujanoEspecial nuevoCirujanoEspecial = new CirujanoEspecial(nombre,apellido);
					hospital.contratarPro(nuevoCirujanoEspecial);
					break;
					}
				break;
			
			case 2:
				hospital.listarPro();
				break;
			case 0:
				salida=0;
				break;
			}
		}
		
	}

}
