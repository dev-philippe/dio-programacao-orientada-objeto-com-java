package Escola;

public class Escola {
    public static void main(String[] args) {

        Aluno philippe = new Aluno();
        philippe.setNome("Philippe Diniz");
        philippe.setIdade(32);

        System.out.println("O aluno " + philippe.getNome() + " tem " + philippe.getIdade() + " anos ");

    }
}
