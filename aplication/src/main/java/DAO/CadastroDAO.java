package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CadastroDAO {

    public static void cadastrarUsuario(Scanner scanner) {
        System.out.println("Cadastro usuário");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Idade: ");
        String idade = scanner.nextLine();

        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Cpf: ");
        String cpf = scanner.nextLine();

        System.out.print("Cartão do SUS: ");
        String sus = scanner.nextLine();

        try (Connection connection = ConexaoBD.obterConexao()) {
            String sql = "UPDATE usuarios SET nome = ?, senha = ?, idade = ?, sexo = ?, telefone = ?, endereco = ?, cpf = ?, sus = ? WHERE email = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, senha);
            statement.setString(3, idade);
            statement.setString(4, sexo);
            statement.setString(5, telefone);
            statement.setString(6, endereco);
            statement.setString(7, cpf);
            statement.setString(8, sus);
            statement.setString(9, email);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
