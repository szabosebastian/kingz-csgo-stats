
package hu.faceit.models.player.info;

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
    "avatar",
    "country",
    "cover_featured_image",
    "cover_image",
    "faceit_url",
    "friends_ids",
    "games",
    "infractions",
    "membership_type",
    "memberships",
    "new_steam_id",
    "nickname",
    "platforms",
    "player_id",
    "settings",
    "steam_id_64",
    "steam_nickname"
})
public class PlayerInfo {

    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("country")
    private String country;
    @JsonProperty("cover_featured_image")
    private String coverFeaturedImage;
    @JsonProperty("cover_image")
    private String coverImage;
    @JsonProperty("faceit_url")
    private String faceitUrl;
    @JsonProperty("friends_ids")
    private List<String> friendsIds = null;
    @JsonProperty("games")
    private Games games;
    @JsonProperty("infractions")
    private Infractions infractions;
    @JsonProperty("membership_type")
    private String membershipType;
    @JsonProperty("memberships")
    private List<String> memberships = null;
    @JsonProperty("new_steam_id")
    private String newSteamId;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("platforms")
    private Platforms platforms;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("settings")
    private Settings settings;
    @JsonProperty("steam_id_64")
    private String steamId64;
    @JsonProperty("steam_nickname")
    private String steamNickname;
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

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("cover_featured_image")
    public String getCoverFeaturedImage() {
        return coverFeaturedImage;
    }

    @JsonProperty("cover_featured_image")
    public void setCoverFeaturedImage(String coverFeaturedImage) {
        this.coverFeaturedImage = coverFeaturedImage;
    }

    @JsonProperty("cover_image")
    public String getCoverImage() {
        return coverImage;
    }

    @JsonProperty("cover_image")
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    @JsonProperty("faceit_url")
    public String getFaceitUrl() {
        return faceitUrl;
    }

    @JsonProperty("faceit_url")
    public void setFaceitUrl(String faceitUrl) {
        this.faceitUrl = faceitUrl;
    }

    @JsonProperty("friends_ids")
    public List<String> getFriendsIds() {
        return friendsIds;
    }

    @JsonProperty("friends_ids")
    public void setFriendsIds(List<String> friendsIds) {
        this.friendsIds = friendsIds;
    }

    @JsonProperty("games")
    public Games getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(Games games) {
        this.games = games;
    }

    @JsonProperty("infractions")
    public Infractions getInfractions() {
        return infractions;
    }

    @JsonProperty("infractions")
    public void setInfractions(Infractions infractions) {
        this.infractions = infractions;
    }

    @JsonProperty("membership_type")
    public String getMembershipType() {
        return membershipType;
    }

    @JsonProperty("membership_type")
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @JsonProperty("memberships")
    public List<String> getMemberships() {
        return memberships;
    }

    @JsonProperty("memberships")
    public void setMemberships(List<String> memberships) {
        this.memberships = memberships;
    }

    @JsonProperty("new_steam_id")
    public String getNewSteamId() {
        return newSteamId;
    }

    @JsonProperty("new_steam_id")
    public void setNewSteamId(String newSteamId) {
        this.newSteamId = newSteamId;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("platforms")
    public Platforms getPlatforms() {
        return platforms;
    }

    @JsonProperty("platforms")
    public void setPlatforms(Platforms platforms) {
        this.platforms = platforms;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("settings")
    public Settings getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @JsonProperty("steam_id_64")
    public String getSteamId64() {
        return steamId64;
    }

    @JsonProperty("steam_id_64")
    public void setSteamId64(String steamId64) {
        this.steamId64 = steamId64;
    }

    @JsonProperty("steam_nickname")
    public String getSteamNickname() {
        return steamNickname;
    }

    @JsonProperty("steam_nickname")
    public void setSteamNickname(String steamNickname) {
        this.steamNickname = steamNickname;
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
