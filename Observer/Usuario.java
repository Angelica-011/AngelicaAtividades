package Observer;

import java.util.ArrayList;

public class Usuario implements Observer {

    private String nome;
    private ArrayList<Trilha> trilhasFavoritas;

    @Override
    public void atualizar(Trilha trilha) {
        System.out.println("Usuário " + nome +
            " notificado: a trilha " + trilha.getNome() + " foi atualizada.");
    }


public void adicionarFavorita(Trilha trilha) {
    trilhasFavoritas.add(trilha);
    trilha.adicionarObserver(this);
}
}
