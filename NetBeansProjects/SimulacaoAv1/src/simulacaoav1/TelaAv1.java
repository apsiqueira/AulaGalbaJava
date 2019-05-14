/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacaoav1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Estacio
 */
public class TelaAv1 extends JFrame {

    JComboBox jcbContinentes;
    JPanel painel1, painel2, painel3, painel4;
    JList PDisp, PEsc;
    JButton botao1, botao2;
    private String[] Continentes = {"Asia", "Europa", "America", "Africa", "Oceania", "Antartica"};
    private String[] africa = {"Sudão", "Seychelles", "Maurício", "Chade", "Reunião", "Serra Leoa"};
    private String[] asia = {};
    private String[] europa = {};
    private String[] america = {"Brasil" , "Suriname", "Colômbia", "Suriname", "Chile e Uruguai", "Bolívia"};
    private String[] oceania = {};
    private String[] antartica = {};

    public TelaAv1() {
        super("Lista de Paises");
        this.painel1 = new JPanel(new GridBagLayout());
        this.painel2 = new JPanel(new GridBagLayout());
        this.painel3 = new JPanel(new GridBagLayout());
        this.painel4 = new JPanel(new GridBagLayout());
        this.jcbContinentes = new JComboBox();

        this.PDisp = new JList();
        this.PEsc = new JList();
        this.botao1 = new JButton("Mover ====>");
        this.botao2 = new JButton("Limpar Destino");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;

        this.add(painel1);

        this.add(painel2);
        this.add(painel3);
        this.add(painel4);

        gbc.gridy = 0;
        gbc.gridy = 0;
        this.painel3.add(botao1, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(10, 10, 10, 10);
        this.painel3.add(botao2, gbc);

        this.painel2.add(PDisp);
        this.painel4.add(PEsc);

        this.painel1.add(this.jcbContinentes);

        this.setLayout(new GridBagLayout());

        this.painel1.setPreferredSize(new Dimension(120, 50));
        this.painel2.setPreferredSize(new Dimension(200, 400));
        this.painel3.setPreferredSize(new Dimension(200, 400));
        this.painel4.setPreferredSize(new Dimension(200, 400));
        this.jcbContinentes.setPreferredSize(new Dimension(100, 25));

        // this.painel3.setPreferredSize(new Dimension(175,175));
        //  this.painel4.setPreferredSize(new Dimension(400,40));
        this.painel1.setBorder(BorderFactory.createTitledBorder("Continentes"));
        this.painel2.setBorder(BorderFactory.createTitledBorder("Paises Disponiveis"));
        this.painel4.setBorder(BorderFactory.createTitledBorder("Paises Escolhidos"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }

}
