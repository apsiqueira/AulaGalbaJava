
package TrocaCor3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TrocaCor3 extends JFrame implements ActionListener {
    JPanel painel1, painel2, painel3;
    JButton azul, amarelo, vermelho, verde, preto;
    
    public TrocaCor3(){
        super("Cor do Painel");
        this.painel1 = new JPanel(new GridBagLayout());
        this.painel2 = new JPanel(new GridBagLayout());
        this.painel3 = new JPanel();
        this.amarelo = new JButton("Amarelo");
        this.azul = new JButton("Azul");
        this.vermelho = new JButton("Vermelho");
        this.verde = new JButton("Verde");
        this.preto = new JButton("Preto");
        this.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        this.amarelo.addActionListener(this);
        this.azul.addActionListener(this);
        this.vermelho.addActionListener(this);
        this.verde.addActionListener(this);
        this.preto.addActionListener(this);
        
        
        this.painel1.setPreferredSize(new Dimension(200,200));
        this.painel2.setPreferredSize(new Dimension(200,200));
        this.painel3.setPreferredSize(new Dimension(175,175));
        this.painel1.setBorder(BorderFactory.createTitledBorder("Cores"));     
        this.painel2.setBorder(BorderFactory.createTitledBorder("Painel"));
        
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
    }
    
}
