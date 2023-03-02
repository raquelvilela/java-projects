public class Produto {

    // ATRIBUTOS
    private int codigo;
    private String descricao;
    private double valor;
    private int quantidadeEstoque;

    // METODOS
    public void imprimir(){
        System.out.println("Codigo = " + codigo);
        System.out.println("Descricao = " + descricao);
        System.out.println("Valor = " + valor);
        System.out.println("Quantidade de estoque = " + quantidadeEstoque);
    }

    public void darEntrada(int quantidade){
        quantidadeEstoque += quantidade;
    }

    public boolean darSaida(int quantidade){
        if(quantidade <= quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }


    // METODOS ASSOCIADOS


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}


