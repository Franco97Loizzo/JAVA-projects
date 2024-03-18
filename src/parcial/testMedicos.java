package parcial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class testMedicos {
	@Test
	public void medikitos() {
		
		Medico m = new Medico("Franco","Loizzo");
		assertEquals(500000, m.getHonorario());
		
		Cirujano j = new Cirujano("Lucas","Galeano");
		assertEquals(625000, j.sueldoMensual());
		
		CirujanoEspecial e = new CirujanoEspecial("Enzo", "Miramon");
		assertEquals(656250,e.sueldoMensual());
	}
}
