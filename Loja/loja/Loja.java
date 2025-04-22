package loja;

import java.util.ArrayList;
import java.util.List;

class Loja {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public void contratarFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.println("Funcionario contratado: " + f.getNome());
    }

    public void demitirFuncionario(int matricula) {
        funcionarios.removeIf(f -> f.getMatricula() == matricula);
        System.out.println("Funcionario demitido (matricula): " + matricula);
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println(c.getNome());
        System.out.println("Cliente cadastrado: " + c.getNome());
    }

    public void cadastrarFornecedor(Fornecedor f) {
        fornecedores.add(f);
        System.out.println("Fornecedor cadastrado: " + f.getNome());
    }

    public void listarClientes() {
        System.out.println("=== Clientes ===");
        clientes.forEach(c -> System.out.println(c));
    }

    public void listarFuncionarios() {
        System.out.println("=== Funcionarios ===");
        funcionarios.forEach(f -> System.out.println(f));
    }

    public void listarFornecedores() {
        System.out.println("=== Fornecedores ===");
        fornecedores.forEach(f -> System.out.println(f));
    }
}