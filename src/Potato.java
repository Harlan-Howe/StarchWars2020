public class Potato
{
    private String hair;
    private boolean hasMustache;
    private String eyes;
    private String nose;
    private String feet;
    private String ears;

    public Potato()
    {
        hair = "Generic";
        hasMustache = false;
        eyes = "generic";
        nose = "generic";
        feet = "generic";
        ears = "generic";
    }
    public Potato(String hr, boolean must, String ey,
                  String ns, String ft, String er )
    {
        hair = hr;
        hasMustache = must;
        eyes= ey;
        nose = ns;
        feet = ft;
        ears = er;
    }
    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getFeet() {
        return feet;
    }

    public void setFeet(String feet) {
        this.feet = feet;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    public void sayGreeting()
    {
        System.out.println("I'm a peelin'!");
    }

    @Override
    public String toString() {
        return "Potato{" +
                "hair='" + hair + '\'' +
                ", hasMustache=" + hasMustache +
                ", eyes='" + eyes + '\'' +
                ", nose='" + nose + '\'' +
                ", feet='" + feet + '\'' +
                ", ears='" + ears + '\'' +
                '}';
    }
}
