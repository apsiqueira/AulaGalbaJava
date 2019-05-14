/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbox;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.PrintStream;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Estacio
 */
public class CheckboxModel extends JFrame implements ItemListener {

    private JCheckBox JAVA, C, Python, Pearl, Ruby;
    private JLabel menssagem;
    private JPanel painel;
    private static final String msn = "Linguagem Selecionadas";
    

    public CheckboxModel() {

        super("Qual Linguagens Você gostaria de Aprender?");

        this.painel = new JPanel(new FlowLayout());
        this.C = new JCheckBox("C/C++");
        this.JAVA = new JCheckBox("JAVA");
        this.Python = new JCheckBox("Phyton");
        this.Pearl = new JCheckBox("Pearl");
        this.Ruby = new JCheckBox("Ruby");
        this.menssagem = new JLabel(msn);

        this.C.addItemListener(this);

        this.JAVA.addItemListener(this);
        this.Python.addItemListener(this);
        this.Pearl.addItemListener(this);
        this.Ruby.addItemListener(this);

        this.painel.add(this.C);
        this.painel.add(this.JAVA);
        this.painel.add(this.Pearl);
        this.painel.add(this.Python);
        this.painel.add(this.Ruby);
        this.painel.add(this.menssagem);
        this.add(this.painel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
         String linguagensSelecionadas="";

        if (this.C.isSelected()) {
            linguagensSelecionadas += "-C/C++-";
                }
            if (this.JAVA.isSelected()) {
                linguagensSelecionadas += " Java-";
            }
                if (this.Pearl.isSelected()) {
                    linguagensSelecionadas += " Pearl-";
                }
                    if (this.Python.isSelected()) {
                        linguagensSelecionadas += " Phyton-";
                    }
                        if (this.Ruby.isSelected()) {
                         linguagensSelecionadas += " Ruby-";
                        }

                           

                    

      
         this.menssagem.setText(msn + linguagensSelecionadas);
    }
}
