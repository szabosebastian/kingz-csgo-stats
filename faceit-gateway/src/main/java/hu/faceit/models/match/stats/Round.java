
package hu.faceit.models.match.stats;

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
    "best_of",
    "competition_id",
    "game_id",
    "game_mode",
    "match_id",
    "match_round",
    "played",
    "round_stats",
    "teams"
})
public class Round {

    @JsonProperty("best_of")
    private String bestOf;
    @JsonProperty("competition_id")
    private Object competitionId;
    @JsonProperty("game_id")
    private String gameId;
    @JsonProperty("game_mode")
    private String gameMode;
    @JsonProperty("match_id")
    private String matchId;
    @JsonProperty("match_round")
    private String matchRound;
    @JsonProperty("played")
    private String played;
    @JsonProperty("round_stats")
    private RoundStats roundStats;
    @JsonProperty("teams")
    private List<Team> teams = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("best_of")
    public String getBestOf() {
        return bestOf;
    }

    @JsonProperty("best_of")
    public void setBestOf(String bestOf) {
        this.bestOf = bestOf;
    }

    @JsonProperty("competition_id")
    public Object getCompetitionId() {
        return competitionId;
    }

    @JsonProperty("competition_id")
    public void setCompetitionId(Object competitionId) {
        this.competitionId = competitionId;
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

    @JsonProperty("match_round")
    public String getMatchRound() {
        return matchRound;
    }

    @JsonProperty("match_round")
    public void setMatchRound(String matchRound) {
        this.matchRound = matchRound;
    }

    @JsonProperty("played")
    public String getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(String played) {
        this.played = played;
    }

    @JsonProperty("round_stats")
    public RoundStats getRoundStats() {
        return roundStats;
    }

    @JsonProperty("round_stats")
    public void setRoundStats(RoundStats roundStats) {
        this.roundStats = roundStats;
    }

    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
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
