package metier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalcul {
	
	private ICaclul calcul;

	@BeforeEach
	void setUp() throws Exception {
		// we have to get an instance from the class tested in the setUp methode
		calcul = new CalculImpl();
	}

	@Test
	void testSum() {
	    double number1 = 20.56;
	    double number2 = 40.69;
	    
	    double expected = 61.25;
	    double actual = calcul.sum(number1, number2);
	    System.out.println("resultat:" + actual );
	    assertEquals(expected, actual, 0.0001);
	}

}
