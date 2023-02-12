public class pokemon {

    private int hp;
    private String typ;
    private String weak;
    private String strong;

    public void Pokemon(int hp, String typ) {

        this.hp = hp;
        this.typ = typ;

    }

    public boolean isDead() {

        if (this.hp <= 0) {
            return true;
        }
        return false;

    }

    public void takeDamage(int damage, pokemon enemy) {

        double multiplier = 1;

        if (this.strong == enemy.getType()) {
            multiplier = 1.5;
        } else if (this.weak == enemy.getType()) {
            multiplier = 0.75;
        }

        this.hp -= damage * multiplier;
    }

    public String getType() {
        return this.typ;
    }

}
