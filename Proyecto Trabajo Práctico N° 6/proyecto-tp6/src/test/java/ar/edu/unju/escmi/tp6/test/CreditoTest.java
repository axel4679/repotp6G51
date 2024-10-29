package ar.edu.unju.escmi.tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.tp6.dominio.Detalle;

class CreditoTest {

	public static final int MONTO_1= 50000;
	public static final int MONTO_2= 20000;
	public static final int MONTO_3= 1000 ;
	@Test
	void testMontoCreditoValido() {
		double montoObtenido = crearFactura().calcularTotal();
		double montoPermitido = 1500000;
		assertTrue(montoObtenido <= montoPermitido, "El monto total no deberia superar al monto permitido");
	}

		private Factura crearFactura() {
			Factura factur = new Factura();
			Factura.setDetalles(crearListaDetalles());
			return factura;
		}
	private List<Detalle> crearListaDetalles(){
		List<Detalle> listaDetalles = new ArrayList<Detalle>();
		Detalle detalle1 = new Detalle();
		detalle1.setImporte(MONTO_1);
		Detalle detalle2 = new Detalle();
		detalle2.setImporte(MONTO_2);
		Detalle detalle3 = new Detalle();
		detalle3.setImporte(MONTO_3);
	}
}
