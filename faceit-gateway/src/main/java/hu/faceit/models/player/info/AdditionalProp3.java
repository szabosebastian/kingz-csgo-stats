
package hu.faceit.models.player.info;

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
    "faceit_elo",
    "game_player_id",
    "game_player_name",
    "game_profile_id",
    "region",
    "regions",
    "skill_level",
    "skill_level_label"
})
public class AdditionalProp3 {

    @JsonProperty("faceit_elo")
    private Integer faceitElo;
    @JsonProperty("game_player_id")
    private String gamePlayerId;
    @JsonProperty("game_player_name")
    private String gamePlayerName;
    @JsonProperty("game_profile_id")
    private String gameProfileId;
    @JsonProperty("region")
    private String region;
    @JsonProperty("regions")
    private Regions__ regions;
    @JsonProperty("skill_level")
    private Integer skillLevel;
    @JsonProperty("skill_level_label")
    private String skillLevelLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faceit_elo")
    public Integer getFaceitElo() {
        return faceitElo;
    }

    @JsonProperty("faceit_elo")
    public void setFaceitElo(Integer faceitElo) {
        this.faceitElo = faceitElo;
    }

    @JsonProperty("game_player_id")
    public String getGamePlayerId() {
        return gamePlayerId;
    }

    @JsonProperty("game_player_id")
    public void setGamePlayerId(String gamePlayerId) {
        this.gamePlayerId = gamePlayerId;
    }

    @JsonProperty("game_player_name")
    public String getGamePlayerName() {
        return gamePlayerName;
    }

    @JsonProperty("game_player_name")
    public void setGamePlayerName(String gamePlayerName) {
        this.gamePlayerName = gamePlayerName;
    }

    @JsonProperty("game_profile_id")
    public String getGameProfileId() {
        return gameProfileId;
    }

    @JsonProperty("game_profile_id")
    public void setGameProfileId(String gameProfileId) {
        this.gameProfileId = gameProfileId;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("regions")
    public Regions__ getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(Regions__ regions) {
        this.regions = regions;
    }

    @JsonProperty("skill_level")
    public Integer getSkillLevel() {
        return skillLevel;
    }

    @JsonProperty("skill_level")
    public void setSkillLevel(Integer skillLevel) {
        this.skillLevel = skillLevel;
    }

    @JsonProperty("skill_level_label")
    public String getSkillLevelLabel() {
        return skillLevelLabel;
    }

    @JsonProperty("skill_level_label")
    public void setSkillLevelLabel(String skillLevelLabel) {
        this.skillLevelLabel = skillLevelLabel;
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
