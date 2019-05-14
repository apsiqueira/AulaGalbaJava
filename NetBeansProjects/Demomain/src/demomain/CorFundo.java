/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demomain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Estacio
 */
public class CorFundo extends JFrame implements ActionListener {

    private JList lista;
    private JPanel painel;
    private String[] cor = {"Preto", "Branco", "Azul", "Vermelho", "Amarelo"};
    private Color [] colors = {Color.BLACK, Color.WHITE, Color.BLUE, Color.RED, Color.YELLOW};
    private JComboBox jcb; 
    public CorFundo(){
        super("Lista de Cores");
        this.painel = new JPanel (new FlowLayout());
        //this.lista = new JList(this.cor);
       // this.lista.setVisibleRowCount(5);
       // this.lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.add(this.painel);
        this.jcb = new JComboBox(this.cor);
      
        
        
       this.jcb.addActionListener(this);
        this.jcb.setSelectedIndex(0);
     
       this.painel.setPreferredSize (new Dimension(400, 300));
      // this.painel.add(this.lista);
       this.painel.add(jcb);
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       this.pack();
       
       this.setVisible(true);
        
        
        
        
    }
    
    
    
       
   //  painel.setBackground(colors[lista.getSelectedIndex()]);

    @Override
    public void actionPerformed(ActionEvent ae) {
        
     painel.setBackground(colors[jcb.getSelectedIndex()]);
  
 
    
    
    
    }
     
     
        
        
    } 
           
  
    
    

