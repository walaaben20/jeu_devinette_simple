import java.util.Scanner;


/**
 *
 * @author wala_ben
 */
public class testdevinette {
    public static void main(String[] args) {
            System.out.println("Bienvenue dans le jeu Devinette !");
            Scanner sc=new Scanner(System.in);
            System.out.println("joueur 1 :donner votre mot à deviner : ");
            String mot=sc.nextLine();
            devinette m=new devinette(mot); 
            if (m.motvalide(mot)==false || mot.length()==0){
                do{
                System.out.println("donner un autre mot :");
                mot=sc.nextLine();
                devinette m2=new devinette(mot); 
                }while(m.motvalide(mot)==false || mot.length()==0); 
            }
            System.out.println("joueur 2 : choisir 1 si vous voulez avoir un indice \n           sinon 2 si vous voulez commencer directement  \n");
            int  choix=sc.nextInt();
            devinette d=new devinette(choix);
            d.condition();
          if (d.choix==1){
            boolean test=false;
            int i=1;        
            do{
            System.out.println("joueur 1 : taper l'indice numéro :" +i);
            Scanner in=new Scanner(System.in);
            String indice=in.nextLine();
            System.out.println("joueur 2:deviner le mot: ");
            String j2=in.nextLine();
            Scanner s=new Scanner(System.in);
            if(j2.equals(mot)==false){
                if(i<3){
                System.out.println("vous avez perdu  la chance "+i);
                test=false;
                i++;
                }
                else{
                    System.out.println("fin de jeu , vous avez perdu");
                    break;
                        }
            }
            else{
                test=true;
                System.out.println("super ! vous avez gagné le jeu ");
                break;
            }
            }while(test==false);
            }
            if (d.choix==2){
                System.out.println("joueur 2: deviner le mot");
                int i=1;
                boolean test=false;
                do{
                Scanner s=new Scanner(System.in);
                String mot1=s.nextLine();
                if(mot1.equals(mot)==false){
                    if(i<4){
                    System.out.println("vous avez perdu la " +i +" chance, devinez une autre fois :");
                    test=false;
                    i++;
                    }
                    else{
                        System.out.println("désolé(e) , vous avez perdu le jeu .");
                        break;
                    }
                }
                else{
                    System.out.println("super! vous avez gagné !");
                    test=true;
                    break;
                }
                }while(test==false);
            }
            
    }
    
}
