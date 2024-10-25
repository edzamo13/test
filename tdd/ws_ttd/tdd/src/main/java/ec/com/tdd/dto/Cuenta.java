package ec.com.tdd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Cuenta {

	private int numeroCuenta;

	private double saldo;

	public void depositar(double cantidad) {
		setSaldo(getSaldo() + cantidad);

	}

	public void retirar(double cantidad) {
		setSaldo(getSaldo() - cantidad);

	}
	
	
	
}
