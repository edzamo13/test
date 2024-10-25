package tdd;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import ec.com.tdd.dto.Cuenta;
import junit.framework.TestCase;

public class CuentaTest extends TestCase {

	@Test
	public void testAlCrearCuentaElSaldoEsCero() {
		Cuenta c = new Cuenta(1111, 0.0);
		assertEquals(0.0, c.getSaldo());

	}

	@Test
	public void testAlIngresar100EnCuentaVaciaElSaldoEs100() {
		Cuenta c = new Cuenta(1112, 0);
		c.depositar(100);
		assertEquals(100.0, c.getSaldo());

	}

	@Test
	public void testAlCrearUnacuentaCon100YhacemosUnDeposito300ElSaldoEs400() {
		Cuenta c = new Cuenta(1112, 100);
		c.depositar(300);
		assertEquals(400.0, c.getSaldo());
	}

	@Test
	public void testAlIngresar3000EnCuentaCon100ElSaldoEs3100() {
		//Arrange (set up)
		Cuenta c = new Cuenta(1112, 0.0);
		c.depositar(100);
		
		//Act
		c.depositar(3000);
		
		  //Assert
		assertEquals(3100.0, c.getSaldo());
		
	}
	
	@Test
	public void testNoSePuedeIngresarCantidadNegativa() {
		Cuenta c = new Cuenta(1112, 0.0);
		c.depositar(-100);
		assertNotEquals(0.0, c.getSaldo());
	}

	@Test
	public void testIngresoCantidad2Decimales() {
		Cuenta c = new Cuenta(1112, 0.0);
		c.depositar(100.45);
		assertEquals(100.45, c.getSaldo());
	}
}
