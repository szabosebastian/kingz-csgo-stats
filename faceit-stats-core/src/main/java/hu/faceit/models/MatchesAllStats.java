package hu.faceit.models;

import java.util.List;

public class MatchesAllStats {

    private List<String> matchesId;
    private int games;
    private String playerId;
    private String nickName;
    private int tripleKills;
    private Double kDRatio;
    private int assists;
    private Double deaths;
    private Double headshotPercentage;
    private Double kills;
    private int headshots;
    private Double kRratio;
    private int mvps;
    private int pentaKills;
    private int quadroKills;
    private int playedRounds;

    @Override
    public String toString() {
        return "Player id: " + this.playerId + "\n" +
                "Nickname: " + this.nickName + "\n" +
                "Games: " + this.games + "\n" +
                "Played rounds: " + this.playedRounds + "\n" +
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
        this.deaths = 0.0;
        this.kills = 0.0;
        this.kRratio = 0.0;
        this.kDRatio = 0.0;
        this.headshotPercentage = 0.0;
    }

    public int getPlayedRounds() {
        return playedRounds;
    }

    public void setPlayedRounds(int playedRounds) {
        this.playedRounds = playedRounds;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
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

    public Double getDeaths() {
        return deaths;
    }

    public void setDeaths(Double deaths) {
        this.deaths = deaths;
    }

    public Double getKills() {
        return kills;
    }

    public void setKills(Double kills) {
        this.kills = kills;
    }

    public int getHeadshots() {
        return headshots;
    }

    public void setHeadshots(int headshots) {
        this.headshots = headshots;
    }

    public Double getkRratio() {
        return kRratio;
    }

    public void setkRratio(Double kRratio) {
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
