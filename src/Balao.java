public class Balao {
    int id, capacidade;
    double altura, peso;
    String regisRegularidade, cor, tipo, porte;


    public String voar(){
        return id + " voando";
    }
    Balao (int _id, double _altura, double _peso,  String regis, String _cor, String _tipo, String _porte){
        this.id = _id;
        this.altura = _altura;
        this.regisRegularidade = regis;
        this.cor = _cor;
        this.tipo = _tipo;
        this.porte = _porte;
    }
}
