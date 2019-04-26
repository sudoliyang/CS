public class Soldier {
    public String playerName;
    public Gun gun;

    public Soldier(String playerName){
        this.playerName = playerName;
        System.out.println("玩家 " + getPlayerName() + " 上線了");
    }

    public void setGun(Gun gun){
        this.gun = gun;
        System.out.println("武器：切換到了槍枝：" + this.gun.getName());
    }

    public void killEnemy(){
        if(this.gun == null) {
            System.out.println("請先裝備武器");
            return;
        }

        System.out.println("玩家 " + getPlayerName() + " 使用槍枝: " + this.gun.getName() + " 消滅了敵人");
    }

    public String getPlayerName(){
       return playerName;
    }

}
