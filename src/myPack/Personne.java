package myPack;

public class Personne {

    //Proprieties
    private String nom;
    private String prenom;
    private String telephone;
    private Email mail = new Email();
    private String groupe;


    //Constructors
    public Personne(String nom,String prenom,String telephone,String groupe){
        this.nom = nom ;
        this.prenom = prenom;
        this.telephone = telephone;
        this.mail.setAdr(mail.Email_Gen(nom,prenom));
        this.mail.setPassword(mail.Pass_Gen());
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Nom : "+nom+" Prenom : "+prenom+" Telephone : "+telephone+" Mail : \n Adresse : "+mail.getAdr()+" Password : "+mail.getPassword()+" Groupe : "+groupe;
    }


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Email getMail() {
        return mail;
    }
    public void setMail(Email mail) {
        this.mail = mail;
    }

    public String getGroupe() {
        return groupe;
    }
    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

}
