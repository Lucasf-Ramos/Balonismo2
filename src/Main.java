

public class Main {
    public static void main(String[] args) {

        Balao b1 = new Balao(123);
        Pessoa pessoa = new Pessoa("LUCAS", "20", "20", "20", "30", "LUCAS");
        Piloto piloto = new Piloto("Jorge");


        String resultado = b1.voar() + "\n pessoa:" + pessoa.nome + "\n piloto: " + piloto.nome;
        System.out.println(resultado);





    }
}