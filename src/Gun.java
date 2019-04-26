
public class Gun implements Interface.Gun{
    String name;
    Gun(String name){
        this.name = name;
    }
    public void shoot(){
        System.out.println();
    }
    public String getName(){
        return this.name;
    }
}
