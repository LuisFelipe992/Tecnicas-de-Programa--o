package model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Corpo;
import controller.Pessoa;
import controller.UFO;


public class Banco {
	//selecionar todas as pessoas
	public String selecionarTodasPessoas() {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		String nome = "";
		try {
			Connection conexao = new Conexao().getConexao();
			
			String query = "select * from javalar where nome = 'Felipe' ";
			ResultSet dados = conexao.prepareStatement(query).
			executeQuery();
			
			while(dados.next()) {
				nome += dados.getString("nome")+"\n";
				
				
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nome;
	}
	
	// insere linha na tabela
	public void gravaRelatorio(ArrayList<Corpo> planetas, ArrayList<UFO> dev, ArrayList<UFO> bug) {
		String nome = "Felipe";
		String matricula = "556762";
		try {
			Connection conexao = new Conexao().getConexao();

			String query = "insert into javalar(nome,matricula, nome_arquivo,"
					+ "bug_python, bug_javascript, bug_ruby, bug_php, bug_csharp, bug_cmais, bug_c,"
					+ "dev_python, dev_javascript, dev_ruby, dev_php, dev_csharp, dev_cmais, dev_c,"
					+ "v_python, v_javascript, v_ruby, v_php, v_csharp, v_cmais, v_c,"
					+ "d_python, d_javascript, d_ruby, d_php, d_csharp, d_cmais, d_c,"
					+ "a_python, a_javascript, a_ruby, a_php, a_csharp, a_cmais, a_c,"
					+ "bug_q1, bug_q2, bug_q3, bug_q4, dev_q1, dev_q2, dev_q3, dev_q4) values('"+nome+"','"+matricula+"','"+"nome_arquivo"+"',"
							+ planetas.get(0).nColisoesBug+","+planetas.get(1).nColisoesBug+","
							+ planetas.get(2).nColisoesBug+","+planetas.get(3).nColisoesBug+","
							+ planetas.get(4).nColisoesBug+","+planetas.get(5).nColisoesBug+","
							+ planetas.get(6).nColisoesBug+","
							+ planetas.get(0).nColisoesDev+","+planetas.get(1).nColisoesDev+","
							+ planetas.get(2).nColisoesDev+","+planetas.get(3).nColisoesDev+","
							+ planetas.get(4).nColisoesDev+","+planetas.get(5).nColisoesDev+","
							+ planetas.get(6).nColisoesDev+","
							+ planetas.get(0).getVel()+","
							+ planetas.get(1).getVel()+","
							+ planetas.get(2).getVel()+","
							+ planetas.get(3).getVel()+","
							+ planetas.get(4).getVel()+","
							+ planetas.get(5).getVel()+","
							+ planetas.get(6).getVel()+","
							
							+ planetas.get(0).getQtdDias()+","
							+ planetas.get(1).getQtdDias()+","
							+ planetas.get(2).getQtdDias()+","
							+ planetas.get(3).getQtdDias()+","
							+ planetas.get(4).getQtdDias()+","
							+ planetas.get(5).getQtdDias()+","
							+ planetas.get(6).getQtdDias()+","
							
							+ planetas.get(0).getAno()+","
							+ planetas.get(1).getAno()+","
							+ planetas.get(2).getAno()+","
							+ planetas.get(3).getAno()+","
							+ planetas.get(4).getAno()+","
							+ planetas.get(5).getAno()+","
							+ planetas.get(6).getAno()+","
							+ 0+","+0+","+0+","+0+","
							+ 0+","+0+","+0+","+0+")";
			int rowsAffected = conexao.prepareStatement(query).executeUpdate();
			
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}