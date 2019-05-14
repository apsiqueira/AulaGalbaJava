/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trocacor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TrocaCor2 extends JFrame implements ActionListener {
    JPanel painel1, painel2, painel3,painel4;
    JButton azul, amarelo, vermelho, verde, preto,abrirClaculadora;
    
    public TrocaCor2(){
        super("Cor do Painel");
        this.painel1 = new JPanel(new GridBagLayout());
        this.painel2 = new JPanel(new GridBagLayout());
        this.painel3 = new JPanel();
        this.painel4=new JPanel();
        this.amarelo = new JButton("Amarelo");
        this.azul = new JButton("Azul");
        this.vermelho = new JButton("Vermelho");
        this.verde = new JButton("Verde");
        this.preto = new JButton("Preto");
        this.abrirClaculadora=new JButton("Abrir Calculadora");
        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
    
        this.amarelo.addActionListener(this);
        this.azul.addActionListener(this);
        this.vermelho.addActionListener(this);
        this.verde.addActionListener(this);
        this.preto.addActionListener(this);
        this.abrirClaculadora.addActionListener(this);
        
        
        this.painel1.setPreferredSize(new Dimension(200,200));
        this.painel2.setPreferredSize(new Dimension(200,200));
        this.painel3.setPreferredSize(new Dimension(175,175));
        this.painel4.setPreferredSize(new Dimension(400,40));
        this.painel1.setBorder(BorderFactory.createTitledBorder("Cores"));     
        this.painel2.setBorder(BorderFactory.createTitledBorder("Painel"));
        this.painel4.setBorder(BorderFactory.createTitledBorder(""));     
        
        // MONTAR PAINEL 1
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.painel1.add(this.amarelo, gbc);
        gbc.gridy++;
        this.painel1.add(this.azul, gbc);
        gbc.gridy++;
        this.painel1.add(this.vermelho, gbc);
        gbc.gridy++;
        this.painel1.add(this.verde, gbc);
        gbc.gridy++;
        this.painel1.add(this.preto, gbc);
        
        // MONTAR PAINEL 2
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.painel2.add(this.painel3, gbc);
        
        // Painéis no Frame ************************
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(this.painel1, gbc);
        gbc.gridx++;
        this.add(this.painel2, gbc);
        
        
        // MONTAR PAINEL 4
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.painel2.add(this.painel3,gbc);
        
        // Painéis no Frame ************************
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=2;
        this.add(this.painel4, gbc);
        
        
        gbc.gridx=0;
        gbc.gridy=0;
        this.painel4.add(this.abrirClaculadora,gbc);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.amarelo)
            this.painel3.setBackground(Color.YELLOW);
        if(ae.getSource() == this.azul)
            this.painel3.setBackground(Color.BLUE);
        if(ae.getSource() == this.vermelho)
            this.painel3.setBackground(Color.red);
        if(ae.getSource() == this.verde)
            this.painel3.setBackground(Color.green);
        if(ae.getSource() == this.preto)
            this.painel3.setBackground(Color.black);
        if(ae.getSource() == this.abrirClaculadora)
           new Calculadora();
    }
    
}