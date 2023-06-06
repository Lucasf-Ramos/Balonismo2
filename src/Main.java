

public class Main {
    public static void main(String[] args) {

        Balao balao = new Balao();
        balao.numIdenti = "123";
        balao.regisRegularidade = "097";

        Piloto piloto = new Piloto();
        piloto.cpf = "12345678910";
        piloto.nome = "Rogerio";
        piloto.numRegis = "234";


        Pessoa pessoa = new Pessoa();


        pessoa.busca();
        pessoa.paga();
        pessoa.preencherCadastro();

        pessoa.voar();
        piloto.voar();
        balao.voar(piloto, pessoa);
    }
}