import java.util.Date;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Doacao {
    private int id_doacao;
    private int id_doador;
    private String tipo_doacao;
    private int quantidade;
    private Date data_doacao;

    public Doacao() {
    }

    public Doacao(int id_doacao, int id_doador, String tipo_doacao, int quantidade, Date data_doacao) {
        this.id_doacao = id_doacao;
        this.id_doador = id_doador;
        this.tipo_doacao = tipo_doacao;
        this.quantidade = quantidade;
        this.data_doacao = data_doacao;
    }

    public int getId_doacao() {
        return id_doacao;
    }

    public void setId_doacao(int id_doacao) {
        this.id_doacao = id_doacao;
    }

    public int getId_doador() {
        return id_doador;
    }

    public void setId_doador(int id_doador) {
        this.id_doador = id_doador;
    }

    public String getTipo_doacao() {
        return tipo_doacao;
    }

    public void setTipo_doacao(String tipo_doacao) {
        this.tipo_doacao = tipo_doacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_doacao() {
        return data_doacao;
    }

    public void setData_doacao(Date data_doacao) {
        this.data_doacao = data_doacao;
    }

    public void cadastrarDoacao(int id_doacao, int id_doador, String tipo_doacao, int quantidade, Date data_doacao) {
        this.id_doacao = id_doacao;
        this.id_doador = id_doador;
        this.tipo_doacao = tipo_doacao;
        this.quantidade = quantidade;
        this.data_doacao = data_doacao;
    }

    // Alterar doação
    public void alterarDadosDoacao(String tipo_doacao, int quantidade, Date data_doacao) {
        this.tipo_doacao = tipo_doacao;
        this.quantidade = quantidade;
        this.data_doacao = data_doacao;
    }

    // Buscar doação
    public Doacao buscarDoacao(int id_doacao) {
        if (this.id_doacao == id_doacao) {
            return this;
        } else {
            return null;
        }
    }

    // Listar doações
    public List<Doacao> listarDoacoes(List<Doacao> doacoes) {
        List<Doacao> doacoesList = new ArrayList<Doacao>();
        for (Doacao doacao : doacoes) {
            doacoesList.add(doacao);
        }
        return doacoesList;
    }

    // Calcular total de doações
    public double calcularTotalDoacoes(List<Doacao> doacoes) {
        double total = 0;
        for (Doacao doacao : doacoes) {
            total += doacao.getQuantidade();
        }
        return total;
    }
    public void salvarDadosDoacao() {
        try {
            // Cria um novo arquivo TXT ou abre um arquivo existente
            FileWriter writer = new FileWriter("doacoes.txt", true);

            // Escreve os dados da doação no arquivo
            writer.write("ID da Doação: " + this.id_doacao + "\n");
            writer.write("ID do Doador: " + this.id_doador + "\n");
            writer.write("Tipo de Doação: " + this.tipo_doacao + "\n");
            writer.write("Quantidade: " + this.quantidade + "\n");
            writer.write("Data da Doação: " + this.data_doacao + "\n\n");

            // Fecha o arquivo
            writer.close();

            System.out.println("Dados da doação salvos com sucesso no arquivo TXT!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados da doação no arquivo TXT: " + e.getMessage());
        }
    }

}

