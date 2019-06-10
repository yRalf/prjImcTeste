package testamodel;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import model.Imc;

public class TestaImc {

	@Test
	public void testaImc() {
		Imc imc = new Imc(null, 0, 65, 175);
		imc.setAltura(imc.getAltura()/100);			
		Assert.assertEquals((float) 21.22449, imc.calculaImc());	
	}
	
	@Test
	public void statusImc() {
		Imc imc = new Imc(null, 0, 48, 175);
		imc.setAltura(imc.getAltura()/100);			
		Assert.assertEquals("Baixo peso muito grave", imc.statusImc());	
	}
	
	@Test
	public void statusImc2() {
		Imc imc = new Imc(null, 0, 49, 175);
		imc.setAltura(imc.getAltura()/100);			
		Assert.assertEquals("Baixo peso grave", imc.statusImc());	
	}
	
	
	@Test
	public void statusPesoIdealM() {
		Imc imc = new Imc("m", 0, 65, 175);
		imc.setAltura(imc.getAltura());			
		Assert.assertEquals((float)67.5, imc.pesoIdeal());	
	}
	
	@Test
	public void statusPesoIdealF() {
		Imc imc = new Imc("f", 0, 65, 175);
		imc.setAltura(imc.getAltura());			
		Assert.assertEquals((float)63.75, imc.pesoIdeal());	
	}
	
	
	
}
