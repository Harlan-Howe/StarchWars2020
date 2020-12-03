public class SithPotato extends EvilPotato
{
    public SithPotato()
    {
        super();
        setWeapon("Light peeler");
        setHair("Helmet and Cape");
        setEyes("bloodshot");
    }

    public void sayGreeting()
    {
        System.out.println("Once I was the student; now I am the masher.");
    }

    public void useWeapon()
    {
        System.out.println("The fries are strong with this one.");
    }
}
