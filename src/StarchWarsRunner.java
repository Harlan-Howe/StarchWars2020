public class StarchWarsRunner
{
    public static void main(String[] args)
    {
        System.out.println("Start.");
        Potato mrPH = new Potato("toupee",true,
                "lidded","red","orange",
                "pinkish");
        System.out.println(mrPH);
        mrPH.setEars("pink");
        System.out.println(mrPH);
        System.out.println(mrPH.getEyes());

        Potato mrsPH = new Potato("flower hat",
                false, "purple lashed","orange",
                "red heels", "pierced");
        System.out.println(mrsPH);
        mrsPH.sayGreeting();
        mrPH.sayGreeting();
        System.out.println("=========");
        EvilPotato spudtrooper = new EvilPotato();
        spudtrooper.sayGreeting();
        System.out.println(spudtrooper);
        spudtrooper.sayFriendlyGreeting();
        spudtrooper.useWeapon();
        System.out.println("========");
        SithPotato darthTater = new SithPotato();
        System.out.println(darthTater);
        darthTater.sayGreeting();
        darthTater.useWeapon();
        darthTater.sayFriendlyGreeting();
        System.out.println("========");
        Potato anaskin;
        anaskin = new SithPotato();
        anaskin.sayGreeting();
        System.out.println(anaskin);
        ((SithPotato)anaskin).useWeapon();
        ((SithPotato)mrPH).useWeapon();

        System.out.println("End");
    }
}
