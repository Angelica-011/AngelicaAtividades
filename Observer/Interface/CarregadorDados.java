package Interface;

import java.util.ArrayList;
import Observer.Trilha;
import Observer.Usuario;


public interface CarregadorDados {
    ArrayList<Usuario> carregarUsuarios();
    ArrayList<Trilha> carregarTrilhas();
}

