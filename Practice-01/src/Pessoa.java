public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private int altura;
    private double peso;
    private double imc;

    public Pessoa(String nome, String sobrenome, int idade, int altura, double peso, double imc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }
    public Pessoa(){
        nome = "Caio";
        sobrenome = "Damasceno";
        idade = 18;
        altura = 171;
        peso = 110;
        imc = 30;
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
    void setAltura(int altura){
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
    int getAltura(){
        return this.altura;
    }
    double getPeso(){
        return this.peso;
    }
    double getImc(){
        return this.imc;
    }

    void exibirInformacoes(){
            System.out.println("Nome: "+nome +" "+sobrenome);
            System.out.println("Nome: "+idade);
            System.out.println("Nome: "+altura);
            System.out.println("Nome: "+peso);
            System.out.println("Nome: "+imc);

    }
}
