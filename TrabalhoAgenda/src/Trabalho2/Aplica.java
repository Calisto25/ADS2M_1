package Trabalho2;

public class Aplica {
	
	public static void main(String[] args) {
		Controllerr controlador = new Controllerr();

		//instruções para criar e imprimir 50 contatos.
		for ( int i = 0 ; i < 50 ; i++)
		{
			controlador.listarContato(controlador.gerarContatoAleatorio());
			System.out.println("");
		}

	}
}
