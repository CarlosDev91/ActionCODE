package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Usuario;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void adicionarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome, email, senha, idade, sexo, endereco, telefone, cpf, sus) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getIdade());
            stmt.setString(5, usuario.getSexo());
            stmt.setString(6, usuario.getEndereco());
            stmt.setString(7, usuario.getTelefone());
            stmt.setString(8, usuario.getCpf());
            stmt.setString(9, usuario.getSus());
            stmt.executeUpdate();
        }
    }

    public Usuario buscarUsuarioPorId(int id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("idade"), 
                        rs.getString("sexo"),
                        rs.getString("endereco"),
                        rs.getString("telefone"),
                        rs.getString("cpf"),
                        rs.getString("sus")
                    );
                }
            }
        }
        return null;
    }

    public List<Usuario> listarUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario(
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("senha"),
                    rs.getString("idade"), 
                    rs.getString("sexo"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("cpf"),
                    rs.getString("sus")
                );
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }

    public void atualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET nome = ?, email = ?, senha = ?, idade = ?, sexo = ?, endereco = ?, telefone = ?, cpf = ?, sus = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getIdade());
            stmt.setString(5, usuario.getSexo());
            stmt.setString(6, usuario.getEndereco());
            stmt.setString(7, usuario.getTelefone());
            stmt.setString(8, usuario.getCpf());
            stmt.setString(9, usuario.getSus());
            stmt.setInt(10, usuario.getId());
            stmt.executeUpdate();
        }
    }

    public void deletarUsuario(int id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
