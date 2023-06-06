import java.util.Scanner;

public class Pessoa {

    Scanner tcd = new Scanner(System.in);
    String nome, cpf, rg, telefone, telefoneEmergencia, assinatura;


    public void preencherCadastro(){
        nome = tcd.nextLine();
        cpf = tcd.next();
        rg = tcd.next();
        telefone = tcd.next();
        telefoneEmergencia = tcd.next();

        assinatura = tcd.next();
    }
    public void busca(){

    }
    public void paga(){

    }
    public void voar(){
        System.out.println("ele voou");
    }
}
