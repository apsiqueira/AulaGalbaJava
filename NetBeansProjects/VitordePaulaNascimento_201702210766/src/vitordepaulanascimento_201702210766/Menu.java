package vitordepaulanascimento_201702210766;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

    JMenuBar BarraMenu;
    JMenu Cliente;
    JMenuItem Cadastro;

    JLabel Label;
    String Texto;
    JPanel Painel;

    public Menu() {
        super("Painel do Cliente");

        this.Painel = new JPanel();
        JLabel Label = new JLabel();

        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(new GridBagLayout());

        this.BarraMenu = new JMenuBar(); 
        this.Cliente = new JMenu("Cliente"); 
        this.Cadastro = new JMenuItem("Cadastro"); 

        this.setJMenuBar(this.BarraMenu); 
        this.BarraMenu.add(this.Cliente); 

        this.Cliente.add(this.Cadastro); 

        this.Cadastro.addActionListener(this);

        this.Label = new JLabel(this.Texto);
        this.Texto = "Esolha 'Cadastro no menu Cliente acima'";
        this.Painel.setFont(new Font(Font.SERIF, Font.BOLD, 26));

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(this.Painel, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setSize(300, 300);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        new MenuCadastro();
    }
}
