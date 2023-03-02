import java.util.Scanner;

public class ProdutoTeste {

    public Produto produto = new Produto();

    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ProdutoTeste produto1 = new ProdutoTeste();
        int opcao;

        System.out.println("MENU");
        System.out.println("1. Cadastrar");
        System.out.println("2. Consultar");
        System.out.println("3. Registrar Entrada");
        System.out.println("4. Registrar Saida");
        System.out.println("5. Valor em reais do produto");
        System.out.println("9. Fim");
        do{
            System.out.println("MENU");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Registrar Entrada");
            System.out.println("4. Registrar Saida");
            System.out.println("5. Valor em reais do produto");
            System.out.println("9. Fim");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(produto1.sc.nextLine());

            switch (opcao){
                case 1:
                    produto1.execCadastrar();
                    break;
                case 2:
                    produto1.execConsultar();
                    break;
                case 3:
                    produto1.execRegistrarEntrada();
                    break;
                case 4:
                    produto1.execRegistrarSaida();
                    break;
                case 5:
                    produto1.execValorEmReais();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        } while (opcao != 9);






    }

    public void execCadastrar(){

        if(produto.getDescricao()!=null){
            System.out.println("Produto ja foi cadastrado");
            return;
        }

        System.out.println("Digite o codigo: ");
        produto.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descricao");
        produto.setDescricao(sc.nextLine());
        System.out.println("Diigite o valor");
        produto.setValor(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a quantidade em estoque");
        produto.setQuantidadeEstoque(Integer.parseInt(sc.nextLine()));
        System.out.println("Cadastro realizado com sucesso!");
    }

    public void execConsultar(){
        produto.imprimir();
    }

    public void execRegistrarEntrada(){
        int entrada;
        System.out.println("Digite o valor da entrada: ");
        entrada = Integer.parseInt(sc.nextLine());
        produto.darEntrada(entrada);
        System.out.println("Entrada com sucesso");
    }

    public void execRegistrarSaida(){
        int saida;
        System.out.println("Digite o valor de saida: ");
        saida = Integer.parseInt(sc.nextLine());

        if(produto.darSaida(saida)){
            System.out.println("Saida com sucesso");
        } else {
            System.out.println("Nao a quantidade suficiente no estoque");
        }

    }

    public void execValorEmReais(){
        System.out.println("Valor total em reais: " + produto.getQuantidadeEstoque() * produto.getValor());
    }


}