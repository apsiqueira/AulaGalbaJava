package vitordepaulanascimento_201702210766;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.xml.bind.Marshaller.Listener;

public class MenuCadastro extends JFrame implements ActionListener {

    JPanel Painel1, Painel2;
    JButton Botao;
    ListenerBotao Listener;
    JLabel Label1, Label2, Label3, Label4, Label5, Label6;
    JTextField Nome, CPF, Telefone, Numero1_JTF, Numero2_JTF, Resultado_JTF;

    public MenuCadastro() {
        super("Cadastro Cliente");

        this.Painel1 = new JPanel(new GridBagLayout());
        this.Painel2 = new JPanel(new GridBagLayout());

        this.Numero1_JTF = new JTextField(11);
        this.Numero2_JTF = new JTextField(11);
        this.Resultado_JTF = new JTextField(11);

        this.Nome = new JTextField(10);
        this.CPF = new JTextField(10);
        this.Telefone = new JTextField(10);

        this.Botao = new JButton("Calcular estadia");
        this.Botao.addActionListener((ActionListener) Listener);

        this.Label1 = new JLabel("Nome: ");
        this.Label2 = new JLabel("CPF: ");
        this.Label3 = new JLabel("Telefone: ");

        this.Label4 = new JLabel("Valor por dia: ");
        this.Label5 = new JLabel("Quantidade de dias: ");
        this.Label6 = new JLabel("Valor: ");

        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.LINE_END;

        this.Painel1.setPreferredSize(new Dimension(200, 143));
        this.Painel2.setPreferredSize(new Dimension(250, 170));

        gbc.gridx = 0;
        gbc.gridy = 0;

        this.Painel1.add(Label1, gbc);
        this.add(this.Painel1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.Painel1.add(Nome, gbc);

//----------------------------------------------------------//   
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.Painel1.add(Label2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.Painel1.add(CPF, gbc);

//----------------------------------------------------------//
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.Painel1.add(Label3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        this.Painel1.add(Telefone, gbc);

//-----------------------------------------------------------//
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.Painel2.add(Label4, gbc);
        this.add(this.Painel2, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        this.Painel2.add(Numero1_JTF, gbc);

//---------------------------------------------------------------//       
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.Painel2.add(Label5, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        this.Painel2.add(Numero2_JTF, gbc);

        //--------------------------------------------------------------//
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.Painel2.add(Label6, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        this.Painel2.add(Resultado_JTF, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        this.Painel2.add(Botao, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1, n2;

        n1 = Integer.parseInt(this.Numero1_JTF.getText());
        n2 = Integer.parseInt(this.Numero2_JTF.getText());

        if (e.getSource() == this.Botao) {
            this.Resultado_JTF.setText(Integer.toString(n1 + n2));

        }
    }
}
