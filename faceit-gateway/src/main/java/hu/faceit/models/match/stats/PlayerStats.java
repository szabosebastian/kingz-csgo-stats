
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
    "HeadshotsPercentage",
    "Penta Kills",
    "K/D Ratio",
    "Headshots",
    "Deaths",
    "K/R Ratio",
    "Result",
    "Kills",
    "Triple Kills",
    "Assists",
    "Quadro Kills",
    "MVPs"
})
public class PlayerStats {

    @JsonProperty("HeadshotsPercentage")
    private String headshotsPercentage;
    @JsonProperty("Penta Kills")
    private String pentaKills;
    @JsonProperty("K/D Ratio")
    private String kDRatio;
    @JsonProperty("Headshots")
    private String headshots;
    @JsonProperty("Deaths")
    private String deaths;
    @JsonProperty("K/R Ratio")
    private String kRRatio;
    @JsonProperty("Result")
    private String result;
    @JsonProperty("Kills")
    private String kills;
    @JsonProperty("Triple Kills")
    private String tripleKills;
    @JsonProperty("Assists")
    private String assists;
    @JsonProperty("Quadro Kills")
    private String quadroKills;
    @JsonProperty("MVPs")
    private String mVPs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("HeadshotsPercentage")
    public String getHeadshotsPercentage() {
        return headshotsPercentage;
    }

    @JsonProperty("HeadshotsPercentage")
    public void setHeadshotsPercentage(String headshotsPercentage) {
        this.headshotsPercentage = headshotsPercentage;
    }

    @JsonProperty("Penta Kills")
    public String getPentaKills() {
        return pentaKills;
    }

    @JsonProperty("Penta Kills")
    public void setPentaKills(String pentaKills) {
        this.pentaKills = pentaKills;
    }

    @JsonProperty("K/D Ratio")
    public String getKDRatio() {
        return kDRatio;
    }

    @JsonProperty("K/D Ratio")
    public void setKDRatio(String kDRatio) {
        this.kDRatio = kDRatio;
    }

    @JsonProperty("Headshots")
    public String getHeadshots() {
        return headshots;
    }

    @JsonProperty("Headshots")
    public void setHeadshots(String headshots) {
        this.headshots = headshots;
    }

    @JsonProperty("Deaths")
    public String getDeaths() {
        return deaths;
    }

    @JsonProperty("Deaths")
    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("K/R Ratio")
    public String getKRRatio() {
        return kRRatio;
    }

    @JsonProperty("K/R Ratio")
    public void setKRRatio(String kRRatio) {
        this.kRRatio = kRRatio;
    }

    @JsonProperty("Result")
    public String getResult() {
        return result;
    }

    @JsonProperty("Result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("Kills")
    public String getKills() {
        return kills;
    }

    @JsonProperty("Kills")
    public void setKills(String kills) {
        this.kills = kills;
    }

    @JsonProperty("Triple Kills")
    public String getTripleKills() {
        return tripleKills;
    }

    @JsonProperty("Triple Kills")
    public void setTripleKills(String tripleKills) {
        this.tripleKills = tripleKills;
    }

    @JsonProperty("Assists")
    public String getAssists() {
        return assists;
    }

    @JsonProperty("Assists")
    public void setAssists(String assists) {
        this.assists = assists;
    }

    @JsonProperty("Quadro Kills")
    public String getQuadroKills() {
        return quadroKills;
    }

    @JsonProperty("Quadro Kills")
    public void setQuadroKills(String quadroKills) {
        this.quadroKills = quadroKills;
    }

    @JsonProperty("MVPs")
    public String getMVPs() {
        return mVPs;
    }

    @JsonProperty("MVPs")
    public void setMVPs(String mVPs) {
        this.mVPs = mVPs;
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
