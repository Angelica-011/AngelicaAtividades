package Singleton;

import java.util.ArrayList;
import Observer.Usuario;
import Observer.CarregadorJsonAdapter;
import Observer.Trilha;

public class BaseDados {

    private static BaseDados instancia;

    private ArrayList<Usuario> usuarios;
    private ArrayList<Trilha> trilhas;

    private BaseDados() {
        usuarios = new ArrayList<>();
        trilhas = new ArrayList<>();
    }

    public static BaseDados getInstancia() {
        if (instancia == null) {
            instancia = new BaseDados();
        }
        return instancia;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Trilha> getTrilhas() {
        return trilhas;
    }

}
