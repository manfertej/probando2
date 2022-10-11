package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private int value1;
	private int value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.value1 = 3;
		this.value2 = 5;
	}

	@AfterEach
	void tearDown() throws Exception {
		this.value1 = 0;
		this.value2 = 0;
	}

	@Test
	void testSuma() {
		int total = 8;
		int sum = Calculadora.suma(this.value1, this.value2);
		assertEquals(sum, total);
	}

	@Test
	void testResta() {
		int resultado = -2;
		int resta = Calculadora.resta(this.value1, this.value2);
		assertEquals(resta, resultado);
	}

	@Test
	void testMultiplica() {
		int total = 15;
		int mul = Calculadora.multiplica(this.value1, this.value2);
		assertEquals(mul, total);
	}

	@Test
	void testDivide() {
		int total = 0;
		int div = Calculadora.divide(this.value1, this.value2);
		assertEquals(div, total);
	}

}

