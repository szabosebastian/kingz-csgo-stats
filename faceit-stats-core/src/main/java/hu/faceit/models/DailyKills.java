package hu.faceit.models;

public class DailyKills {

    String name;
    Double kills;

    public DailyKills() {
    }

    public DailyKills(String name, Double kills) {
        this.name = name;
        this.kills = kills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getKills() {
        return kills;
    }

    public void setKills(Double kills) {
        this.kills = kills;
    }
}
