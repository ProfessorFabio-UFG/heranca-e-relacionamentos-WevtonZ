package loja;

public class Fornecedor extends PessoaJuridica {
    private String produtos;
    private String nome, endereco, telefone, cnpj, razaoSocial;

    public Fornecedor(String nome, String endereco, String telefone,
                      String cnpj, String razaoSocial, String produtos) {
        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produtos = produtos;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "[Fornecedor] " + super.toString() + ", Produtos: " + produtos;
    }
}
