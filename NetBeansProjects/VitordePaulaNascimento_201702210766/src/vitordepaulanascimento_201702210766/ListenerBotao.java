package vitordepaulanascimento_201702210766;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerBotao implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent Botao) {
        new MenuCadastro();
         
    }
    
}
