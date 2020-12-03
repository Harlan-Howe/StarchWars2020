public class EvilPotato extends Potato
{
    private String weapon;

    public EvilPotato()
    {
        super();
        setHair("helmet");
        setEyes("Beedy");
        setEars("Hidden");
        setNose("Hidden");
        setFeet("Boots");
        weapon = "Laser Masher";
    }

    public void sayGreeting()
    {
        System.out.println("Fries! Don't move!");
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void useWeapon()
    {
        System.out.println("Die, rebel spud!");
    }
    public void sayFriendlyGreeting()
    {
        super.sayGreeting();

    }

    public String toString()
    {
        String result = super.toString();
        result += "\n Weapon: "+weapon;
        return result;
    }
}
