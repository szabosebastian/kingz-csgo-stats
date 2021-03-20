
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
    "team_id",
    "premade",
    "team_stats",
    "players"
})
public class Team {

    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("premade")
    private Boolean premade;
    @JsonProperty("team_stats")
    private TeamStats teamStats;
    @JsonProperty("players")
    private List<Player> players = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("premade")
    public Boolean getPremade() {
        return premade;
    }

    @JsonProperty("premade")
    public void setPremade(Boolean premade) {
        this.premade = premade;
    }

    @JsonProperty("team_stats")
    public TeamStats getTeamStats() {
        return teamStats;
    }

    @JsonProperty("team_stats")
    public void setTeamStats(TeamStats teamStats) {
        this.teamStats = teamStats;
    }

    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
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
