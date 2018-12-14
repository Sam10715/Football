import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class AmuTeam extends Team {
    private String mascotte;
    private String spirit;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMascotte() {
        return mascotte;
    }

    public String getSpirit() {
        return spirit;
    }

    public void setSpirit(String spirit) {
        this.spirit = spirit;
    }

    public AmuTeam(String name, String s, String n) {
        this.mascotte = name;
        this.spirit = s;
        this.name = n;
    }

    public String getNameOf() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }


    //Give Random Chance of winning depending on the Team spirit.
    public double check() {
        double result = 0;
        if (spirit.equals("Low")) {

            result = (int) Math.floor(Math.random() * 26);
        } else if (spirit.equals("High")) {
            result = (int) Math.floor(Math.random() * 31);
        } else if (spirit.equals("Super")) {
            result = (int) Math.floor(Math.random() * 76);
        } else if (spirit.equals("Queen")) {
            //https://www.youtube.com/watch?v=HgzGwKwLmgM
            result = (int) Math.floor(Math.random() * (125 - 100) + 100);

        }
        return result;
    }

}

