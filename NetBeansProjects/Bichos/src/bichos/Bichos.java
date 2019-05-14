/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bichos;

import com.sun.org.apache.bcel.internal.generic.Select;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Estacio
 */
public class Bichos extends JFrame implements ActionListener {

    JComboBox Lista;
    JPanel painel, painelImagem;
    JLabel labelImagem;
    String[] bichos = {"Cachorro", "Coelho", "Gato", "Passaro", "Porco"};
    String[] imagens = {"Cachorro.gif", "Coelho.gif", "Gato.gif", "Passaro.gif", "Porco.gif"};
    GridBagConstraints gbc = new GridBagConstraints();

    public Bichos() {
        super("Lista de Animais");

        this.setLayout(new GridBagLayout());

        this.painel = new JPanel(new GridBagLayout());

        this.painelImagem = new JPanel(new GridBagLayout());

        this.Lista = new JComboBox(this.bichos);

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(this.painel, gbc);

        this.painel.add(this.Lista);

        gbc.gridy++;
        this.add(this.painelImagem, gbc);

        this.Lista.addActionListener(this);

        this.labelImagem = new JLabel(new ImageIcon(getClass().getResource("Cachorro.gif")));

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.painelImagem.add(this.labelImagem, gbc);

        this.painel.setPreferredSize(new Dimension(250, 150));
        this.painelImagem.setPreferredSize(new Dimension(250,150));
        // this.painel.setPreferredSize(new Dimension(200, 150));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        switch (Lista.getSelectedIndex()) {

            case 0:
                this.labelImagem.setIcon(new ImageIcon("C:/Users/Estacio.MGJDFESL02024/Documents/NetBeansProjects/Bichos/src/bichos/Cachorro.gif"));

                break;

            case 1:
                this.labelImagem.setIcon(new ImageIcon("C:/Users/Estacio.MGJDFESL02024/Documents/NetBeansProjects/Bichos/src/bichos/Coelho.gif"));
                break;

            case 2:
                this.labelImagem.setIcon(new ImageIcon("C:/Users/Estacio.MGJDFESL02024/Documents/NetBeansProjects/Bichos/src/bichos/Gato.gif"));
                break;

            case 3:
                this.labelImagem.setIcon(new ImageIcon("C:/Users/Estacio.MGJDFESL02024/Documents/NetBeansProjects/Bichos/src/bichos/Passaro.gif"));
                break;

            case 4:
                this.labelImagem.setIcon(new ImageIcon("C:/Users/Estacio.MGJDFESL02024/Documents/NetBeansProjects/Bichos/src/bichos/Porco.gif"));
                break;

        }

    }
;

}
