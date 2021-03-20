
package hu.faceit.models.player.history;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "competition_id",
    "competition_name",
    "competition_type",
    "faceit_url",
    "finished_at",
    "game_id",
    "game_mode",
    "match_id",
    "match_type",
    "max_players",
    "organizer_id",
    "playing_players",
    "region",
    "results",
    "started_at",
    "status",
    "teams",
    "teams_size"
})
public class Item {

    @JsonProperty("competition_id")
    private String competitionId;
    @JsonProperty("competition_name")
    private String competitionName;
    @JsonProperty("competition_type")
    private String competitionType;
    @JsonProperty("faceit_url")
    private String faceitUrl;
    @JsonProperty("finished_at")
    private Integer finishedAt;
    @JsonProperty("game_id")
    private String gameId;
    @JsonProperty("game_mode")
    private String gameMode;
    @JsonProperty("match_id")
    private String matchId;
    @JsonProperty("match_type")
    private String matchType;
    @JsonProperty("max_players")
    private Integer maxPlayers;
    @JsonProperty("organizer_id")
    private String organizerId;
    @JsonProperty("playing_players")
    private List<String> playingPlayers = null;
    @JsonProperty("region")
    private String region;
    @JsonProperty("results")
    private Results results;
    @JsonProperty("started_at")
    private Integer startedAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("teams")
    private Teams teams;
    @JsonProperty("teams_size")
    private Integer teamsSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("competition_id")
    public String getCompetitionId() {
        return competitionId;
    }

    @JsonProperty("competition_id")
    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    @JsonProperty("competition_name")
    public String getCompetitionName() {
        return competitionName;
    }

    @JsonProperty("competition_name")
    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    @JsonProperty("competition_type")
    public String getCompetitionType() {
        return competitionType;
    }

    @JsonProperty("competition_type")
    public void setCompetitionType(String competitionType) {
        this.competitionType = competitionType;
    }

    @JsonProperty("faceit_url")
    public String getFaceitUrl() {
        return faceitUrl;
    }

    @JsonProperty("faceit_url")
    public void setFaceitUrl(String faceitUrl) {
        this.faceitUrl = faceitUrl;
    }

    @JsonProperty("finished_at")
    public Integer getFinishedAt() {
        return finishedAt;
    }

    @JsonProperty("finished_at")
    public void setFinishedAt(Integer finishedAt) {
        this.finishedAt = finishedAt;
    }

    @JsonProperty("game_id")
    public String getGameId() {
        return gameId;
    }

    @JsonProperty("game_id")
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("game_mode")
    public String getGameMode() {
        return gameMode;
    }

    @JsonProperty("game_mode")
    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    @JsonProperty("match_id")
    public String getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("match_type")
    public String getMatchType() {
        return matchType;
    }

    @JsonProperty("match_type")
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @JsonProperty("max_players")
    public Integer getMaxPlayers() {
        return maxPlayers;
    }

    @JsonProperty("max_players")
    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    @JsonProperty("organizer_id")
    public String getOrganizerId() {
        return organizerId;
    }

    @JsonProperty("organizer_id")
    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    @JsonProperty("playing_players")
    public List<String> getPlayingPlayers() {
        return playingPlayers;
    }

    @JsonProperty("playing_players")
    public void setPlayingPlayers(List<String> playingPlayers) {
        this.playingPlayers = playingPlayers;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("results")
    public Results getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Results results) {
        this.results = results;
    }

    @JsonProperty("started_at")
    public Integer getStartedAt() {
        return startedAt;
    }

    @JsonProperty("started_at")
    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("teams")
    public Teams getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    @JsonProperty("teams_size")
    public Integer getTeamsSize() {
        return teamsSize;
    }

    @JsonProperty("teams_size")
    public void setTeamsSize(Integer teamsSize) {
        this.teamsSize = teamsSize;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
