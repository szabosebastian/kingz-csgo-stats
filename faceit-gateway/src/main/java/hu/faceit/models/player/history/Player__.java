
package hu.faceit.models.player.history;

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
    "avatar",
    "faceit_url",
    "game_player_id",
    "game_player_name",
    "nickname",
    "player_id",
    "skill_level"
})
public class Player__ {

    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("faceit_url")
    private String faceitUrl;
    @JsonProperty("game_player_id")
    private String gamePlayerId;
    @JsonProperty("game_player_name")
    private String gamePlayerName;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("skill_level")
    private Integer skillLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("faceit_url")
    public String getFaceitUrl() {
        return faceitUrl;
    }

    @JsonProperty("faceit_url")
    public void setFaceitUrl(String faceitUrl) {
        this.faceitUrl = faceitUrl;
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

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("skill_level")
    public Integer getSkillLevel() {
        return skillLevel;
    }

    @JsonProperty("skill_level")
    public void setSkillLevel(Integer skillLevel) {
        this.skillLevel = skillLevel;
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
