
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
    "Second Half Score",
    "Final Score",
    "Overtime score",
    "Team",
    "Team Win",
    "Team Headshots",
    "First Half Score"
})
public class TeamStats {

    @JsonProperty("Second Half Score")
    private String secondHalfScore;
    @JsonProperty("Final Score")
    private String finalScore;
    @JsonProperty("Overtime score")
    private String overtimeScore;
    @JsonProperty("Team")
    private String team;
    @JsonProperty("Team Win")
    private String teamWin;
    @JsonProperty("Team Headshots")
    private String teamHeadshots;
    @JsonProperty("First Half Score")
    private String firstHalfScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Second Half Score")
    public String getSecondHalfScore() {
        return secondHalfScore;
    }

    @JsonProperty("Second Half Score")
    public void setSecondHalfScore(String secondHalfScore) {
        this.secondHalfScore = secondHalfScore;
    }

    @JsonProperty("Final Score")
    public String getFinalScore() {
        return finalScore;
    }

    @JsonProperty("Final Score")
    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    @JsonProperty("Overtime score")
    public String getOvertimeScore() {
        return overtimeScore;
    }

    @JsonProperty("Overtime score")
    public void setOvertimeScore(String overtimeScore) {
        this.overtimeScore = overtimeScore;
    }

    @JsonProperty("Team")
    public String getTeam() {
        return team;
    }

    @JsonProperty("Team")
    public void setTeam(String team) {
        this.team = team;
    }

    @JsonProperty("Team Win")
    public String getTeamWin() {
        return teamWin;
    }

    @JsonProperty("Team Win")
    public void setTeamWin(String teamWin) {
        this.teamWin = teamWin;
    }

    @JsonProperty("Team Headshots")
    public String getTeamHeadshots() {
        return teamHeadshots;
    }

    @JsonProperty("Team Headshots")
    public void setTeamHeadshots(String teamHeadshots) {
        this.teamHeadshots = teamHeadshots;
    }

    @JsonProperty("First Half Score")
    public String getFirstHalfScore() {
        return firstHalfScore;
    }

    @JsonProperty("First Half Score")
    public void setFirstHalfScore(String firstHalfScore) {
        this.firstHalfScore = firstHalfScore;
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
