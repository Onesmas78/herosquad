import java.util.ArrayList;
import java.util.List;

public class squad {
    String squadName;
    String squadCause;
    int squadID;
    private static List<squad> squadList = new ArrayList<>();

    public squad(String name, String cause, hero hero) {
        squadName = name;
        squadCause = cause;

    }

    public String getName() {
        return squadName;
    }

    public int getSquadId() {
        return squadID;
    }

    public String getCause() {
        return squadCause;
    }

    public static List<squad> getSquadsList() {
        return squadList;
    }



}