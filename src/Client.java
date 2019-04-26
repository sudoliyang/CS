
public class Client {
    public static void main(String[] args){
        Soldier user = new Soldier("Liyang");
        HandGun handGun = new HandGun();
        MachineGun machineGun = new MachineGun();
        Rifle rifle = new Rifle();

        user.killEnemy();

        user.setGun(rifle);
        user.killEnemy();

        user.setGun(handGun);
        user.killEnemy();
        user.killEnemy();

        user.setGun(machineGun);
    }
}
