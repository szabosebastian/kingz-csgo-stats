package hu.faceit.models;

import java.util.List;

public class MatchesAllStats {

    private List<String> matchesId;
    private String playerId;
    private String nickName;
    private int tripleKills;
    private Double kDRatio;
    private int assists;
    private int deaths;
    private Double headshotPercentage;
    private int kills;
    private int headshots;
    private int kRratio;
    private int mvps;
    private int pentaKills;
    private int quadroKills;

    @Override
    public String toString() {
        return "player_id: " + this.playerId + "\n" +
                "nickname: " + this.nickName + "\n" +
                "MVPs: " + this.mvps + "\n" +
                "K/D Ratio: " + this.kDRatio + "\n" +
                "Penta Kills: " + this.pentaKills + "\n" +
                "Deaths: " + this.deaths + "\n" +
                "Kills: " + this.kills + "\n" +
                "Assists: " + this.assists + "\n" +
                "Headshots: " + this.headshots + "\n" +
                "Quadro Kills: " + this.quadroKills + "\n" +
                "Triple Kills: " + this.tripleKills + "\n" +
                "Headshots %: " + this.headshotPercentage + "\n" +
                "K/R Ratio: " + this.kRratio + "\n";
    }

    public MatchesAllStats() {
    }

    public MatchesAllStats(List<String> matchesId, String playerId, String nickName, int tripleKills, Double kDRatio, int assists, int deaths, Double headshotPercentage, int kills, int headshots, int kRratio, int mvps, int pentaKills, int quadroKills) {
        this.matchesId = matchesId;
        this.playerId = playerId;
        this.nickName = nickName;
        this.tripleKills = tripleKills;
        this.kDRatio = kDRatio;
        this.assists = assists;
        this.deaths = deaths;
        this.headshotPercentage = headshotPercentage;
        this.kills = kills;
        this.headshots = headshots;
        this.kRratio = kRratio;
        this.mvps = mvps;
        this.pentaKills = pentaKills;
        this.quadroKills = quadroKills;
    }

    public Double getHeadshotPercentage() {
        return headshotPercentage;
    }

    public void setHeadshotPercentage(Double headshotPercentage) {
        this.headshotPercentage = headshotPercentage;
    }

    public List<String> getMatchesId() {
        return matchesId;
    }

    public void setMatchesId(List<String> matchesId) {
        this.matchesId = matchesId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(int tripleKills) {
        this.tripleKills = tripleKills;
    }

    public Double getkDRatio() {
        return kDRatio;
    }

    public void setkDRatio(Double kDRatio) {
        this.kDRatio = kDRatio;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }


    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getHeadshots() {
        return headshots;
    }

    public void setHeadshots(int headshots) {
        this.headshots = headshots;
    }

    public int getkRratio() {
        return kRratio;
    }

    public void setkRratio(int kRratio) {
        this.kRratio = kRratio;
    }

    public int getMvps() {
        return mvps;
    }

    public void setMvps(int mvps) {
        this.mvps = mvps;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(int pentaKills) {
        this.pentaKills = pentaKills;
    }

    public int getQuadroKills() {
        return quadroKills;
    }

    public void setQuadroKills(int quadroKills) {
        this.quadroKills = quadroKills;
    }
}
