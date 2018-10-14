package myPack;

import java.util.Random;


public class Email {
    private String adr,password;

    public Email(){}

    public String Email_Gen(String nom,String prenom){

        return nom+'.'+prenom+"@company.com";
    }

    public String Pass_Gen(){
        char tab[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                '0','1','2','3','4','5','6','7','8','9'};
        String password ="";
        for (int i=0;i<8;i++){
            password = password + tab[new Random().nextInt(62)];
        }

        return password;
    }


    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
