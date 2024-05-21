package com.saudeparatodos;

import java.util.Scanner;

public class App {
    private static Usuario usuario = null;
    private static boolean loggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao SUTD");

        while (!loggedIn) {
            System.out.println("Digite 'Cadastrar' para criar uma nova conta ou 'Login' para acessar sua conta:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Cadastrar")) {
                Cadastro.cadastrarUsuario(scanner);
            } else if (input.equalsIgnoreCase("Login")) {
                usuario = Login.fazerLogin(scanner);
                if (usuario != null) {
                    loggedIn = true;
                } else {
                    System.out.println("Email ou senha inválidos. Por favor, tente novamente.");
                }
            } else {
                System.out.println("Comando inválido. Por favor, tente novamente.");
            }
        }

        System.out.println("Login bem-sucedido! Bem-vindo, " + usuario.getNome());

        boolean running = true;
        while (running) {
            System.out.println("Escolha uma opção: \nPerfil \nHelp \nSair");
            String option = scanner.nextLine();

            switch (option.toLowerCase()) {
                case "help" -> Help();
                case "perfil" -> Perfil(scanner);
                case "login" -> Login();
                case "agenda" -> Agendamentos();
                case "calendario" -> Calendario();
                case "sair" -> running = false;
                default -> System.out.println("Comando inválido");
            }
        }

        scanner.close();
        ConexaoBD.fecharConexao();
    }

    public static void Perfil(Scanner scanner) {
        boolean viewingProfile = true;

        while (viewingProfile) {
            System.out.println("Perfil do usuário:");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("Sexo: " + usuario.getSexo());
            System.out.println("Endereço: " + usuario.getEndereco());
            System.out.println("Telefone: " + usuario.getTelefone());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("SUS: " + usuario.getSus());

            System.out.println("\nEscolha uma opção: \n1. Voltar \n2. Editar Perfil");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    viewingProfile = false;
                    break;
                case "2":
                    editarPerfil(scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }

    public static void editarPerfil(Scanner scanner) {
        System.out.println("Editar perfil do usuário");
        Cadastro.cadastrarUsuario(scanner);
        System.out.println("Perfil atualizado com sucesso.");
    }

    public static void Help() {
        // Implementação do método Help
    }

    public static void Login() {
        // Implementação do método Login
    }

    public static void Agendamentos() {
        // Implementação do método Agendamentos
    }

    public static void Calendario() {
        // Implementação do método Calendario
    }
}
