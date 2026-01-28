package Observer;

import Singleton.BaseDados;

public class Main {
	
	CarregadorJsonAdapter carregador = new CarregadorJsonAdapter();

	BaseDados base = BaseDados.getInstancia(); {
	base.getUsuarios().addAll(carregador.carregarUsuarios());
	base.getTrilhas().addAll(carregador.carregarTrilhas());

}
}
