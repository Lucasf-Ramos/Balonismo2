import java.util.Scanner;

public class Pessoa {

    Scanner tcd = new Scanner(System.in);
    String nome, cpf, rg, telefone, telefoneEmergencia, assinatura;


    Pessoa (String _nome, String _rg, String _cpf, String _telefone, String _telefoneEmergencia, String _assinatura){
        this.nome = _nome;
        this.cpf = _cpf;
        this.rg = _rg;
        this.telefone = _telefone;
        this.telefoneEmergencia = _telefoneEmergencia;
        this.assinatura = _assinatura;
    }
}
