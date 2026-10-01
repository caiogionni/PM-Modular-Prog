public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, double altura, double peso, double imc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }

    void setNome(String nome){
        this.nome = nome;
    }
    void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    void setAltura(double altura){
        this.altura = altura;
    }
    void setPeso(double peso){
        this.peso = peso;
    }
    void setImc(double imc){
        this.imc = imc;
    }
    String getNome(){
        return this.nome;
    }
    String getSobrenome(){
        return this.sobrenome;
    }
    int getIdade(){
        return this.idade;
    }
    double getAltura(){
        return this.altura;
    }
    double getPeso(){
        return this.peso;
    }
    double getImc(){
        return this.imc;
    }
}
