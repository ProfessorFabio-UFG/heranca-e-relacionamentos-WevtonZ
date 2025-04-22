package loja;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Cliente cli1 = new Cliente("Ana Silva", "Rua A, 123", "9999-0000", "123.456.789-00", 'F', 1, 5000.0, "Eletronicos", "Estudante");
        loja.cadastrarCliente(cli1);

        Funcionario func1 = new Funcionario("Joao Souza", "Av. B, 456", "9888-1111", "987.654.321-00", 'M', 2, 1001, 3500.0, "Vendedor");
        loja.contratarFuncionario(func1);

        Fornecedor forn1 = new Fornecedor("Tech Supplies Ltda", "Av. C, 789", "9777-2222", "12.345.678/0001-99", "Tech Supplies", "Hardware");
        loja.cadastrarFornecedor(forn1);

        loja.listarClientes();
        loja.listarFuncionarios();
        loja.listarFornecedores();
    }
}
