package Observer;

import java.util.ArrayList;
import Interface.CarregadorDados;
import Interface.CarregadorJson;

public class CarregadorJsonAdapter implements CarregadorDados {

    private CarregadorJson carregadorJson;

    public CarregadorJsonAdapter() {
        this.carregadorJson = new CarregadorJson();
    }

    public ArrayList<Usuario> carregarUsuarios() {
        return new ArrayList<>(carregadorJson.lerUsuariosJson());
    }

    public ArrayList<Trilha> carregarTrilhas() {
        return new ArrayList<>(carregadorJson.lerTrilhasJson());
    }

}