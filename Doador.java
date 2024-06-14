import java.util.List;
import java.util.ArrayList;
public class Doador {

    private int id_doador;
    private String nome;
    private String email;
    private String telefone;

    public Doador() {
    }

    public Doador(int id_doador, String nome, String email, String telefone) {
        this.id_doador = id_doador;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId_doador() {
        return id_doador;
    }

    public void setId_doador(int id_doador) {
        this.id_doador = id_doador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //cadastrar doador
    public void cadastrarDoador(int id_doador, String nome, String email, String telefone){
        this.id_doador = id_doador;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    //alterar dados do doador
    public void alterarDadosDoador(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    //buscar doador
    public Doador buscarDoador(int id_doador){
        if (this.id_doador == id_doador){
        return this;
    } else {
            return null;
    }
    }

    //listar doadores
    public List<Doador> listarDoadores(List<Doador> doadores){
        List<Doador> doadoresList = new ArrayList<Doador>(); 
        for (Doador doador : doadores) { 
              doadoresList.add(doador);
        }
     return doadoresList;
    }
}
    


    