package myPack;

import javax.swing.*;
import java.util.ArrayList;

public class Contact {

    private ArrayList<Personne> liste = new ArrayList<>();

    public void ajoutContact(Personne p ){
    liste.add(p);
    }
    public void suppContact(String nom){
        for(Personne X : liste){
            if(X.getNom().equals(nom)){
                liste.remove(X);
            }
        }
    }
    public void modifierContact(String nom){
        int i = 0;
        for(Personne X : liste){
            if(X.getNom().equals(nom)){
                Personne tmp = new Personne(
                        JOptionPane.showInputDialog(null,"Entrer votre nom : "),
                        JOptionPane.showInputDialog(null,"Entrer votre prenom : "),
                        JOptionPane.showInputDialog(null,"Entrer votre telephone : "),
                        JOptionPane.showInputDialog(null,"Entrer votre groupe  : "));
                liste.set(i,tmp);
            }
            i++;
        }
    }

    public void mesAmis(){
        for(Personne X : liste){
            if(X.getGroupe().equals("mesAmis")){
                JOptionPane.showMessageDialog(null,X.toString());
            }
        }
    }

    public void maFamille(){
        for(Personne X : liste){
            if(X.getGroupe().equals("maFamille")){
                JOptionPane.showMessageDialog(null,X.toString());
            }
        }
    }
    public void colleguesTravail(){
        for(Personne X : liste){
            if(X.getGroupe().equals("colleguesTravail")){
                JOptionPane.showMessageDialog(null,X.toString());
            }
        }
    }
    public void mesFavoris(){
        for(Personne X : liste){
            if(X.getGroupe().equals("mesFavoris")){
                JOptionPane.showMessageDialog(null,X.toString());
            }
        }
    }
    public void afficheContact(){
        String Sort = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<Sort.length();i++){
            for(Personne X : liste){
                if(X.getNom().charAt(0)==Sort.charAt(i)){
                    JOptionPane.showMessageDialog(null,X.toString());
                }
            }
        }
    }
    public void chercher(String nom){
        for(Personne X : liste){
            if(X.getNom().equals(nom)){
                JOptionPane.showMessageDialog(null,X.toString());
            }
        }
    }
    public void chercherplus(char l, String groupe){
        for (Personne X : liste){
            if(X.getNom().charAt(0) == l && X.getGroupe().equals(groupe)){
                JOptionPane.showMessageDialog(null,X.toString());
            }
        }
    }


}
