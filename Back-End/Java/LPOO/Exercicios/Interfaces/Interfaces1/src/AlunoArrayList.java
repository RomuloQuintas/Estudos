import java.util.ArrayList;
import java.util.List;

public class AlunoArrayList implements Aluno{
    List<Double> notas;

    public AlunoArrayList() {
        notas = new ArrayList<>();
    }

    @Override
    public double calMedia() {
        if(notas.isEmpty()){
            return 0;
        }
        double soma =0;
        for(double nota1 : notas){
            soma = soma + nota1;
        }
        return soma / notas.size();
    }

    @Override
    public void addNota(double nota) {
        notas.add(nota);
    }

    @Override
    public void removerNota() {
        
    }

    @Override
    public double mostrarNotaMax() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarNotaMax'");
    }

}
