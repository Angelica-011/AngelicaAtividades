package Observer;

import java.util.ArrayList;

public class Trilha implements Subject {

    private ArrayList<Observer> observers;
    private ArrayList<Trilha> pontos;

    public Trilha(String nome) {
        this.observers = new ArrayList<>();
        this.pontos = new ArrayList<>();
    }

    public void adicionarPonto(Trilha ponto) {
        pontos.add(ponto);
        notificarObservers();
    }

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    public void notificarObservers() {
        for (Observer o : observers) {
            o.atualizar(this);
        }
    }

	public String getNome() {
		
		return null;
	}

}

