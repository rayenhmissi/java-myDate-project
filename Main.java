import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        int j,m,a;
        Scanner s=new Scanner(System.in);
        System.out.println("jour=");
        j=s.nextInt();
        System.out.println("mois=");
        m=s.nextInt();
        System.out.println("année=");
        a=s.nextInt();
        MaDate d1=new MaDate(j,m,a);
        d1.set_jour(j);
        d1.set_année(a);
        d1.set_mois(m);
        d1.get_année();
        d1.ajout_année();
        d1.ajout_mois();
        d1.ajout_jour();
        System.out.println(d1.toString());
        s.close();
    }

}
