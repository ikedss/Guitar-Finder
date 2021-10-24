public class Guitarra {
    private String nome;
    private int investimento;
    private int experiencia;
    private int cor;
    private int casas;
    private int tarraxa;

    public Guitarra(String nome, int investimento, int experiencia, int cor, int casas, int tarraxa){
        this.nome = nome;
        this.investimento = investimento;
        this.experiencia = experiencia;
        this.cor = cor;
        this.casas = casas;
        this.tarraxa = tarraxa;
    }

    public int getInvestimento() {
        return investimento;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getCor() {
        return cor;
    }

    public int getCasas() {
        return casas;
    }

    public int getTarraxa() {
        return tarraxa;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirDadosIniciante(){
        System.out.println("Nome: " + this.getNome() + " Preço: " + this.getInvestimento() + " Cor: " + this.getCor() + " casas: " + this.getCasas() + " cordas: " + this.getTarraxa());
    }
}