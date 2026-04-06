package chifoumi;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IHMSaisie extends JOptionPane {
    final static long serialVersionUID = 1;
    JDialog dialogue;
    Choix[] choix = {Choix.PIERRE, Choix.CISEAUX, Choix.PAPIER};
    public IHMSaisie(String nom) {
        setMessage(nom + ", que jouez-vous ?" );
        setOptions(choix);
        dialogue = createDialog(null, "chifoumi");
    }

    // Pour Afficher les choix disponibles
    Choix proposerChoix() {
        dialogue.setAlwaysOnTop(true);
        dialogue.setVisible(true);
        dialogue.setAlwaysOnTop(false);
        return (Choix)getValue();
    }
}