public class Player {
    public String name;
    public Roles role;
    private boolean alive;
    private boolean isHexed;
    private boolean isDoused;
    private boolean isInfected;
    private boolean attacked;
    private boolean roleBlocked;
    private boolean isSilenced;
    private boolean isProtected;

    public Player(String name) {
        this.name = name;
        this.alive = true;
        this.isHexed = false;
        this.isDoused = false;
        this.isInfected = false;
        this.isProtected = false;
        this.roleBlocked = false;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setroles(Roles role) {
        this.role = role;
    }
    
    public Roles getrole() {
        return role;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public boolean getProtected(){
        return this.isProtected;
    }

    public void setRoleBlocked(boolean roleBlocked) {
        this.roleBlocked = roleBlocked;
    }

    public void setSilenced(boolean silenced) {
        isSilenced = silenced;
    }

    public void setHexed(boolean hexed) {
        isHexed = hexed;
    }

    public void attack(){
        attacked = true;
    }

    public void kill(){
        alive = false;
    }





}
