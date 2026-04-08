package telas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TelaMiniEditor extends JFrame{

    private final JPanel painel;

    private final JTextArea jtxaTexto;

    private final JScrollPane jspbarra;

    private final JLabel jlFonte, jlTamanho, jlCor;

    private final JComboBox jcbFonte, jcbTamanho, jcbCor;

    private final JRadioButton jrbNeg, jrbIta, jrbNormal;

    private final ButtonGroup grupoEstilo;

    private final JButton jbAlterar, jbLimpar, jbApagar;

    private String fonte, tamanho, cor;



    public TelaMiniEditor(){

        painel = new JPanel();

        jtxaTexto = new JTextArea(10,40);

        jspbarra = new JScrollPane(jtxaTexto);

        jlFonte = new JLabel("Fonte: ");

        jlTamanho = new JLabel("Tamanho: ");

        jlCor = new JLabel("Cor: ");

        jcbFonte = new JComboBox(new String[]{"", "Arial", "Arial Back", "Comic Sans"});

        jcbTamanho = new JComboBox(new String[]{"", "18", "20", "30"});

        jcbCor = new JComboBox(new String[]{"", "Rosa", "Azul", "Verde"});

        jrbNeg = new JRadioButton("Negrito");

        jrbIta = new JRadioButton("Itálico");

        jrbNormal = new JRadioButton("Normal");

        grupoEstilo = new ButtonGroup();

        jbAlterar = new JButton("Alterar formatação");

        jbLimpar = new JButton("Limpar formatação");

        jbApagar = new JButton("Apagar texto");
    }



    public TelaMiniEditor(int linhas){

        painel = new JPanel();

        jtxaTexto = new JTextArea(linhas,40);

        jspbarra = new JScrollPane(jtxaTexto);

        jlFonte = new JLabel("Fonte: ");

        jlTamanho = new JLabel("Tamanho: ");

        jlCor = new JLabel("Cor: ");

        jcbFonte = new JComboBox(new String[]{"", "Arial", "Arial Back", "Comic Sans"});

        jcbTamanho = new JComboBox(new String[]{"", "18", "20", "30"});

        jcbCor = new JComboBox(new String[]{"", "Rosa", "Azul", "Verde"});

        jrbNeg = new JRadioButton("Negrito");

        jrbIta = new JRadioButton("Itálico");

        jrbNormal = new JRadioButton("Normal");

        grupoEstilo = new ButtonGroup();

        jbAlterar = new JButton("Alterar formatação");

        jbLimpar = new JButton("Limpar formatação");

        jbApagar = new JButton("Apagar texto");
    }



    public TelaMiniEditor(int linhas, int colunas){

        painel = new JPanel();

        jtxaTexto = new JTextArea(linhas, colunas);

        jspbarra = new JScrollPane(jtxaTexto);

        jlFonte = new JLabel("Fonte: ");

        jlTamanho = new JLabel("Tamanho: ");

        jlCor = new JLabel("Cor: ");

        jcbFonte = new JComboBox(new String[]{"", "Arial", "Arial Back", "Comic Sans"});

        jcbTamanho = new JComboBox(new String[]{"", "18", "20", "30"});

        jcbCor = new JComboBox(new String[]{"", "Rosa", "Azul", "Verde"});

        jrbNeg = new JRadioButton("Negrito");

        jrbIta = new JRadioButton("Itálico");

        jrbNormal = new JRadioButton("Normal");

        grupoEstilo = new ButtonGroup();

        jbAlterar = new JButton("Alterar formatação");

        jbLimpar = new JButton("Limpar formatação");

        jbApagar = new JButton("Apagar texto");
    }


    private void configurarJanelaRepetitivas(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        add(painel);

        configurarPainel();

        setVisible(true);
    }


    public void configurarJanela(){

        setTitle("Aula 08/04");

        setSize(500,800);

        setLocation(150,10);

        configurarJanelaRepetitivas();
    }


    public void configurarJanela(int largura, int altura){

        setTitle("Aula 08/04");

        setSize(largura, altura);

        setLocation(150,10);

        configurarJanelaRepetitivas();
    }


    public void configurarJanela(int largura, int altura, int x, int y){

        setTitle("Aula 08/04");

        setSize(largura, altura);

        setLocation(x, y);

        configurarJanelaRepetitivas();
    }


    public void configurarJanela(String titulo){

        setTitle(titulo);

        setSize(500,800);

        setLocation(150,10);

        configurarJanelaRepetitivas();
    }


    public void configurarJanela(String titulo, int largura, int altura){

        setTitle(titulo);

        setSize(largura, altura);

        setLocation(150,10);

        configurarJanelaRepetitivas();
    }


    public void configurarJanela(String titulo, int largura, int altura, int x, int y){

        setTitle(titulo);

        setSize(largura, altura);

        setLocation(x, y);

        configurarJanelaRepetitivas();
    }



    public void configurarPainel(){

        //LABEL + COMBOBOX

        painel.add(jlFonte);

        painel.add(jcbFonte);

        painel.add(jlTamanho);

        painel.add(jcbTamanho);

        painel.add(jlCor);

        painel.add(jcbCor);

        //RADIO BUTTON

        grupoEstilo.add(jrbNormal);

        grupoEstilo.add(jrbNeg);

        grupoEstilo.add(jrbIta);

        painel.add(jrbNormal);

        painel.add(jrbNeg);

        painel.add(jrbIta);

        //BARRA ROLAGEM + TEXTAREA
        //QUEBRA DE LINHA DA AREA DE TEXTO

        jtxaTexto.setLineWrap(true);

        painel.add(jspbarra);



        // BOTÕES

        painel.add(jbAlterar);

        jbAlterar.addActionListener(evento->{

            fonte = (String) jcbFonte.getSelectedItem();

            tamanho = (String) jcbTamanho.getSelectedItem();

            cor = (String) jcbCor.getSelectedItem();


            if (jrbNormal.isSelected()) jtxaTexto.setFont(new Font(fonte,Font.PLAIN, Integer.parseInt(tamanho)));

            else if (jrbNeg.isSelected()) jtxaTexto.setFont(new Font(fonte,Font.BOLD, Integer.parseInt(tamanho)));

            else if (jrbIta.isSelected()) jtxaTexto.setFont(new Font(fonte,Font.ITALIC, Integer.parseInt(tamanho)));


            if (cor.contains("sa")) jtxaTexto.setForeground(Color.PINK);

            else if (cor.contains("z")) jtxaTexto.setForeground(Color.BLUE);

            else if (cor.contains("d")) jtxaTexto.setForeground(Color.GREEN);
        });

        painel.add(jbLimpar);

        jbLimpar.addActionListener(evento -> {

            jtxaTexto.setFont(new Font("Arial",Font.PLAIN, 15));

            jtxaTexto.setForeground(Color.BLACK);
        });

        painel.add(jbApagar);

        jbApagar.addActionListener(evento -> jtxaTexto.setText(""));
    }
}
