import telas.Tela;

public class Principal {

    static void main() {

        Tela recolherAnoNascimento = new Tela("Ano de nascimento:", "Digite seu ano de nascimento aqui.");
        
        recolherAnoNascimento.configurarJanela("Atividade 1", 500, 500, 466, 266);
    }
}