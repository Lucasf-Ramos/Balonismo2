

public class Main {
    public static void main(String[] args) {

        Balao balao = new Balao();

        balao.regisRegularidade = "097";

        Piloto piloto = new Piloto();
        piloto.cpf = "12345678910";
        piloto.nome = "Rogerio";
        piloto.numRegis = "234";


        Pessoa pessoa = new Pessoa();


        pessoa.busca();
        pessoa.paga();
        pessoa.preencherCadastro();


    }
}