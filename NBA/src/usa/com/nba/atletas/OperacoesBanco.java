package usa.com.nba.atletas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.event.ActionEvent;

class OperacoesBanco {
	 public static void inserirAluno(ActionEvent event ) {
	     String sql = "INSERT INTO tabelaatletas (nome, sobrenome, Idade, posicao, equipe) VALUES (?, ?, ?, ?, ?)";
	     try (Connection conexao = Conexao.conectar();
	          PreparedStatement pstmt = conexao.prepareStatement(sql)) {
	         
	         pstmt.setString(1, nome_input.getText());
	         pstmt.setString(2, sobrenome_input.getText());
	         pstmt.setInt(3, idade_input.getText());
	         pstmt.setString(4, posicao_input.getText());
	         pstmt.setString(5, equipe_input.getText());
	         pstmt.executeUpdate();
	     } catch (SQLException e) {
	         e.printStackTrace();
	     }
	 }
}

