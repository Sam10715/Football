public class ProTeam extends Team {
    private String sponsor;
    private String budget;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSponsor() {
        return sponsor;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public ProTeam(String name, String b, String n) {
        this.sponsor = name;
        this.budget = b;
        this.name = n;

    }


    public String getNameOf() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }


    //Give Random Chance of winning depending on the Team budget.
    public double check() {

        double result = 0;
        if (this.budget.equals("High")) {


            result = (int) Math.floor(Math.random() * 51);


        } else if (this.budget.equals("Low")) {

            result = (int) Math.floor(Math.random() * 31);
        }

        return result;

    }


}
