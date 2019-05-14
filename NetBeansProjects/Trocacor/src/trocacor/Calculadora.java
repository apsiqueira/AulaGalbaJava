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
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estacio
 */
public class Calculadora extends JFrame implements ActionListener {
    
    JPanel painel1,painel2;
    JButton soma, subtrair, dividir, multiplicar;
    JLabel lblPrimiroNumro,lblSegundoNumero,lblResulatado;
    JTextField txtPrimiroNumro,txtSegundoNumero,txtResulatado;

    public Calculadora() {
        super("Calculadora");
        painel1=new JPanel(new GridBagLayout());
        painel2=new JPanel(new GridBagLayout());
        
        soma=new JButton("Somar");
        subtrair=new JButton("Subtrair");
        dividir=new JButton("Dividir");
        multiplicar=new JButton("Multiplicar");
        lblPrimiroNumro=new JLabel("Primeiro numero");
        lblSegundoNumero=new JLabel("Segundo numero");
        lblResulatado=new JLabel("           Resulatado");
        txtPrimiroNumro=new JTextField(10);
        txtSegundoNumero=new JTextField(10);
        txtResulatado=new JTextField(10);
        
        
        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        //adicionando listener nos botoes
        
        soma.addActionListener(this);
        subtrair.addActionListener(this);
        dividir.addActionListener(this);
        multiplicar.addActionListener(this);
        
        
      
        
        
        //titulo para o frame da calculadora
    
        
        
        this.soma.addActionListener(this);
        this.subtrair.addActionListener(this);
        this.dividir.addActionListener(this);
        this.multiplicar.addActionListener(this);
       
        
        gbc.anchor = GridBagConstraints.CENTER;
        
        gbc.gridx = 0;
        gbc.gridy=0;
        gbc.weightx=1;
        this.painel1.add(this.lblPrimiroNumro, gbc);
        gbc.gridx++;
        gbc.weightx=2;
        this.painel1.add(this.txtPrimiroNumro,gbc);
        
            
        
        gbc.gridx = 0;
        gbc.gridy=1;
        this.painel1.add(this.lblSegundoNumero, gbc);
        gbc.gridx++;
        this.painel1.add(this.txtSegundoNumero,gbc);
        
        gbc.gridx = 0;
        gbc.gridy=2;
        this.painel1.add(this.lblResulatado, gbc);
        
        gbc.gridx++;
        this.painel1.add(this.txtResulatado,gbc);
        
        
    
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.painel2.add(this.soma, gbc);
        
        gbc.gridx++;
        this.painel2.add(this.subtrair, gbc);
        
         gbc.gridx++;
        this.painel2.add(this.dividir, gbc);
        
        gbc.gridx++;
        this.painel2.add(this.multiplicar, gbc);
        
        
        gbc.gridx=0;
        gbc.gridy=0;
       
        this.add(this.painel1,gbc);
        
       
        gbc.gridy++;
        
       
        this.add(this.painel2,gbc);
        
        
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
        
        
        
    
        
        
        
    }
    
    
  

    @Override
    public void actionPerformed(ActionEvent ae) {
   if(ae.getSource() == soma){
       this.txtResulatado.setText(String.valueOf(somar()));
   
   }
    if(ae.getSource() == subtrair){
       this.txtResulatado.setText(String.valueOf(subtrair()));
   
   }
    if(ae.getSource() == dividir){
       this.txtResulatado.setText(String.valueOf(dividir()));
   
   }
    if(ae.getSource() == multiplicar){
       this.txtResulatado.setText(String.valueOf(multiplicar()));
   
   }
       
    
   
   
   

            
    }
      public double somar(){
   
       double n1= Double.parseDouble(this.txtPrimiroNumro.getText());
       double n2=Double.parseDouble(this.txtSegundoNumero.getText());
       return n1+n2;
   }  
       public double subtrair(){
   
       double n1= Double.parseDouble(this.txtPrimiroNumro.getText());
       double n2=Double.parseDouble(this.txtSegundoNumero.getText());
       return n1-n2;
   }  
        public double dividir(){
   
       double n1= Double.parseDouble(this.txtPrimiroNumro.getText());
       double n2=Double.parseDouble(this.txtSegundoNumero.getText());
       return n1/n2;
   }  
         public double multiplicar(){
   
       double n1= Double.parseDouble(this.txtPrimiroNumro.getText());
       double n2=Double.parseDouble(this.txtSegundoNumero.getText());
       return n1*n2;
   }  
        
        
        
    
}
