public class MaDate {
    private int j;
    private int m;
    private int a;
    public String toString(){
        return this.j+"/"+this.m+"/"+this.a;
    }
    public int get_jour(){
        return this.j;
    }
    public int get_mois(){
        return this.m;
    }
    public int get_année(){
        return this.a;
    }
    public void set_jour(int j){
        this.j=j;
    }
    public void set_mois(int m){
        this.m=m;
    }
    public void set_année(int a){
        this.a=a;
    }
    public MaDate(int j,int m,int a){
        this.j=j;
        this.m=m;
        this.a=a;
    }
    public MaDate(int a){
        this(1,1,a);
    }
    public void ajout_jour(){
        if (this.j > 1 && this.j < 28){
            this.j+=1;
        }
        if (this.j == 30 && (this.m == 4 || this.m==6 || this.m==9 || this.m==11)){
            this.j=1;
            this.m+=1;
        }
        if (this.j==31 && this.m==12){
            this.j=1;
            this.m=1;
            this.a+=1;
        }
        if (this.m==2 && this.j==28){
            this.j=1;
            this.m+=1;
        }
        else{
            this.j=1;
            this.m+=1;
        }

    }
    public void ajout_mois(){
        if (this.m==12){
            this.m=1;
            this.a+=1;
        }
        else{
            this.m+=1;
        }
    }
    public void ajout_année(){
        this.a+=1;
    }
}
