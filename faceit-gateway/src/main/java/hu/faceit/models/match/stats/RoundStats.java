
package hu.faceit.models.match.stats;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Score",
    "Region",
    "Winner",
    "Map",
    "Rounds"
})
public class RoundStats {

    @JsonProperty("Score")
    private String score;
    @JsonProperty("Region")
    private String region;
    @JsonProperty("Winner")
    private String winner;
    @JsonProperty("Map")
    private String map;
    @JsonProperty("Rounds")
    private String rounds;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Score")
    public String getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(String score) {
        this.score = score;
    }

    @JsonProperty("Region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("Winner")
    public String getWinner() {
        return winner;
    }

    @JsonProperty("Winner")
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @JsonProperty("Map")
    public String getMap() {
        return map;
    }

    @JsonProperty("Map")
    public void setMap(String map) {
        this.map = map;
    }

    @JsonProperty("Rounds")
    public String getRounds() {
        return rounds;
    }

    @JsonProperty("Rounds")
    public void setRounds(String rounds) {
        this.rounds = rounds;
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
