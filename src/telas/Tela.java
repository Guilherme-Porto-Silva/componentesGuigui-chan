package telas;

import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class Tela extends JFrame {
    
    private static final Scanner scanf = new Scanner(System.in);
    
    private final JPanel PAINEL = new JPanel();
    
    private JLabel rotulo, habilidadesRotulo, formaPagamento;
    
    private JTextField linha;
    
    private JButton[] botoesTeste;
    
    private String dataNascimento;
    
    private JCheckBox jckPython, jckJava, jckSQL, jckC;
    
    private JRadioButton jrbDinheiro, jrbPix, jrbCartao;

    private ButtonGroup grupoPagamento;

    private JComboBox grupoHabilidades;

    
    
    public Tela(int quantosBotoes) {
        
        botoesTeste = new JButton[quantosBotoes];

        for(int i = 0; i < quantosBotoes; ++i) botoesTeste[i] = new JButton("Botão número " + (i + 1));
    }
    
    

    public Tela(String rotuloParametro, String linhaParametro) {
        
        rotulo = new JLabel(rotuloParametro);
        
        PAINEL.add(rotulo);
        
        linha = new JTextField(linhaParametro);
        
        PAINEL.add(linha);
        
        JButton botaoRecolher = configurarBotao("Recolher", Color.lightGray, Color.BLACK);
        
        botaoRecolher.addActionListener((evento) -> {
            
            dataNascimento = linha.getText().strip();
            
            JOptionPane.showMessageDialog(this, "Data de nascimento recolhida com sucesso.");
        });
        
        PAINEL.add(botaoRecolher);
        
        JButton botaoImprimir = configurarBotao("Imprimir", Color.lightGray, Color.BLACK);
        
        botaoImprimir.addActionListener((evento) -> JOptionPane.showMessageDialog(this, "Você nasceu no dia " + dataNascimento));
        
        PAINEL.add(botaoImprimir);
    }



    public Tela(String jCheckBoxTextoUm, String jCheckBoxTextoDois, String jCheckBoxTextoTres, String jRadioButtonTextoUm, String jRadioButtonTextoDois, String jRadioButtonTextoTres, String jRadioButtonTextoQuatro, String... opcoes) {

        jckPython = new JCheckBox(jCheckBoxTextoUm);

        jckJava = new JCheckBox(jCheckBoxTextoDois);

        jckSQL = new JCheckBox(jCheckBoxTextoTres);

        jckC = new JCheckBox(jRadioButtonTextoUm);

        jrbDinheiro = new JRadioButton(jRadioButtonTextoDois);

        jrbPix = new JRadioButton(jRadioButtonTextoTres);

        jrbCartao = new JRadioButton(jRadioButtonTextoQuatro);

        try{ grupoHabilidades = new JComboBox(opcoes); }

        catch (Exception e) { grupoHabilidades = null; }
    }
    
    

    private void configuracoesRepetitivas() {
        
        setDefaultCloseOperation(3);
        
        configurarPAINEL();
        
        add(PAINEL);
        
        setVisible(true);
    }
    
    

    public void configurarJanela() {
        
        System.out.print("\nDigite o título da janela: ");
        
        setTitle(scanf.nextLine());
        
        setSize(300, 300);
        
        setLocation(10, 10);
        
        configuracoesRepetitivas();
    }
    
    

    public void configurarJanela(int largura, int altura) {
        
        System.out.print("\nDigite o título da janela: ");
        
        setTitle(scanf.nextLine());
        
        setSize(largura, altura);
        
        setLocation(10, 10);
        
        configuracoesRepetitivas();
    }
    
    

    public void configurarJanela(int largura, int altura, int x, int y) {
        
        System.out.print("\nDigite o título da janela: ");
        
        setTitle(scanf.nextLine());
        
        setSize(largura, altura);
        
        setLocation(x, y);
        
        configuracoesRepetitivas();
    }
    
    

    public void configurarJanela(String titulo) {
        
        setTitle(titulo);
        
        setSize(300, 300);
        
        setLocation(10, 10);
        
        configuracoesRepetitivas();
    }
    
    

    public void configurarJanela(String titulo, int largura, int altura) {
        
        setTitle(titulo);
        
        setSize(largura, altura);
        
        setLocation(10, 10);
        
        configuracoesRepetitivas();
    }
    
    

    public void configurarJanela(String titulo, int largura, int altura, int x, int y) {
        
        setTitle(titulo);
        
        setSize(largura, altura);
        
        setLocation(x, y);
        
        configuracoesRepetitivas();
    }
    
    

    private JButton configurarBotao(String textoInterno, Color background, Color foreground, int font) {
        
        JButton botao = new JButton();
        
        botao.setBackground(background);
        
        botao.setForeground(foreground);

        try { botao.setFont(new Font("Arial Black", font, 20)); }

        catch (Exception e) { configurarBotao(textoInterno, background, foreground, 0); }

        return botao;
    }

    
    
    private JButton configurarBotao(String textoInterno, Color background, Color foreground) { return configurarBotao(textoInterno, background, foreground, 0); }

    
    
    private void configurarPAINEL() {

        PAINEL.setBackground(Color.BLACK);

        PAINEL.setForeground(Color.red);

        PAINEL.setFont(new Font("Arial Black", Font.PLAIN, 16));
    }



    private void configurarPAINEL(List<Integer> formaPagamentoBounds, List<Integer> jrbDinheiroBounds, List<Integer> jrbPixBounds, List<Integer> jrbCartaoBounds) {

        PAINEL.setLayout(null);

        if (formaPagamento == null) formaPagamento = new JLabel("Forma de Pagamento:");

        formaPagamento.setBounds(formaPagamentoBounds.get(0), formaPagamentoBounds.get(1), formaPagamentoBounds.get(2), formaPagamentoBounds.get(3));

        PAINEL.add(formaPagamento);

        jrbDinheiro.setBounds(jrbDinheiroBounds.get(0), jrbDinheiroBounds.get(1), jrbDinheiroBounds.get(2), jrbDinheiroBounds.get(3));

        PAINEL.add(jrbDinheiro);

        jrbPix.setBounds(jrbPixBounds.get(0), jrbPixBounds.get(1), jrbPixBounds.get(2), jrbPixBounds.get(3));

        PAINEL.add(jrbPix);

        jrbCartao.setBounds(jrbCartaoBounds.get(0), jrbCartaoBounds.get(1), jrbCartaoBounds.get(2), jrbCartaoBounds.get(3));

        PAINEL.add(jrbCartao);

        if (grupoPagamento == null) grupoPagamento = new ButtonGroup();

        grupoPagamento.add(jrbDinheiro);

        grupoPagamento.add(jrbPix);

        grupoPagamento.add(jrbCartao);

        PAINEL.setFont(new Font("Arial Black", Font.PLAIN, 16));
    }
}