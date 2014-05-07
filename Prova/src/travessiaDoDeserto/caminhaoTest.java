package travessiaDoDeserto;

import static org.junit.Assert.*;

import org.junit.Test;

public class caminhaoTest {

	@Test
	public void testGetCaminhaoESetCaminhao() {
		caminhao caminhao = new caminhao();
		
		caminhao.setCaminhao( "caminhao" );
		
		assertEquals( "caminhao" , caminhao.getCaminhao() );
	}

}
