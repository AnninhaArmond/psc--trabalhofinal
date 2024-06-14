import java.util.List;
import java.util.ArrayList;
public class TotalDoacao {

    private double total_doacoes;

    public TotalDoacao() {
    }

    public TotalDoacao(double total_doacoes) {
        this.total_doacoes = total_doacoes;
    }

    public double getTotal_doacoes() {
        return total_doacoes;
    }

    public void setTotal_doacoes(double total_doacoes) {
        this.total_doacoes = total_doacoes;
    }

    //obter total de doações
    public double obterTotalDoacoes(List<Doacao> doacoes) {
        double total = 0;
        for (Doacao doacao : doacoes) {
            total += doacao.getQuantidade();
        }
        return total;
    }
    }

