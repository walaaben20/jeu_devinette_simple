import java.util.Scanner;
public class devinette {
    int choix;
    public void condition(){
        switch(choix){
            case 1:
                System.out.println("vous avez 3 indices seulement ");
                break;
            case 2:
                System.out.println("commencer sans indice ");
                break;
            default:
                System.out.println("choisir 1 ou 2");
                break;
        }
    }
    public devinette(int choix) {
        // If needed, use the choix parameter in the constructor logic
        this.choix = choix;
    }

    String mot;

    public  boolean motvalide(String mot) {
        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);
            if (!Character.isLetter(c)|| mot.length()==0) {
                return false;
            }
        }
        return true;
    }

    public devinette(String mot){
        this.mot=mot;
    }
           
}