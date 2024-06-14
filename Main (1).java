import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um novo objeto da classe Doacao
        Doacao doacao = new Doacao();

        // Recebe os dados da doação do usuário
        System.out.println("Informe o ID do doador:");
        doacao.setId_doador(scanner.nextInt());

        System.out.println("Informe o tipo de doação:");
        doacao.setTipo_doacao(scanner.nextLine());

        System.out.println("Informe a quantidade:");
        doacao.setQuantidade(scanner.nextInt());

        System.out.println("Informe a data da doação (dd/MM/yyyy):");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data_doacao = sdf.parse(scanner.nextLine());
            doacao.setData_doacao(data_doacao);
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data: " + e.getMessage());
        }

        // Cadastra a doação
        doacao.cadastrarDoacao(doacao.getId_doacao(), doacao.getId_doador(), doacao.getTipo_doacao(), doacao.getQuantidade(), doacao.getData_doacao());

        // Salva os dados da doação em um arquivo TXT
        doacao.salvarDadosDoacao();

        System.out.println("Doação cadastrada com sucesso!");
    }

}
