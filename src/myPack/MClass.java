package myPack;

import javax.swing.*;

public class MClass {

    public static void main(String[] args) {

        Personne me = new Personne(JOptionPane.showInputDialog(null, "Entrer votre nom : ")
                , JOptionPane.showInputDialog(null, "Entrer votre prenom : ")
                , JOptionPane.showInputDialog(null, "Entrer votre telephone : ")
                , "Moi");


        //adding contacts
        Contact c = new Contact();



    }
}
