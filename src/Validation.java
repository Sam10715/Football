public class Validation {


    public static boolean proValidation(ProTeam proTeam) {
        boolean x;
        switch (proTeam.getBudget()) {

            case "High":
                x = true;
                break;
            case "Low":
                x = true;
                break;
            default:
                x = false;
                throw new IllegalArgumentException("The input should be either High or Low");

        }

        return x;
    }

    public static boolean amuValidation(AmuTeam amuTeam) {
        boolean x;
        switch (amuTeam.getSpirit()) {
            case "Super":
                x = true;
                break;
            case "Queen":
                x = true;
                break;
            case "High":
                x = true;
                break;
            case "Low":
                x = true;
                break;
            default:
                x = false;
                throw new IllegalArgumentException("The input should be either High or Low or Super or Queen");

        }

        return x;
    }


}
