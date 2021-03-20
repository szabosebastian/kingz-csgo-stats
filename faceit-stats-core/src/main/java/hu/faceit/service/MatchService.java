package hu.faceit.service;

import hu.faceit.FaceitGatewayIF;
import hu.faceit.models.FaceItData;
import hu.faceit.models.MatchesAllStats;
import hu.faceit.models.match.stats.MatchStats;
import hu.faceit.models.match.stats.Player;
import hu.faceit.models.match.stats.PlayerStats;
import hu.faceit.models.match.stats.Team;
import hu.faceit.models.player.history.Item;
import hu.faceit.models.player.info.PlayerInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchService extends FaceItData {

    private final PlayerService playerService;
    private final FaceitGatewayIF faceitGatewayIF;

    public MatchService(PlayerService playerService, FaceitGatewayIF faceitGatewayIF) {
        this.playerService = playerService;
        this.faceitGatewayIF = faceitGatewayIF;
    }

    public List<String> getMatchIdListByDate(String name, Integer from, Integer to, Integer offset, Integer limit) {
        return playerService.getPlayerHistory(name, from, to, offset, limit).getItems().stream()
                .map(Item::getMatchId)
                .collect(Collectors.toList());
    }

    public MatchStats getMatchStats(String name, Integer from, Integer to, Integer offset, Integer limit) {
        return faceitGatewayIF.getPlayerMatchStats(bearerToken, getMatchIdListByDate(name, from, to, offset, limit).get(0));
    }

    public MatchesAllStats getMatchesAllStats(String name, Integer from, Integer to, Integer offset, Integer limit) {
        MatchesAllStats stats = new MatchesAllStats();

        PlayerInfo playerInfo = playerService.getPlayerByName(name);
        List<String> matchesIdList = getMatchIdListByDate(name, from, to, offset, limit);

        stats.setMatchesId(matchesIdList);
        stats.setPlayerId(players.get(name));
        stats.setNickName(playerInfo.getNickname());

        for (String matchId : matchesIdList) {
            MatchStats currentMatchStat = faceitGatewayIF.getPlayerMatchStats(bearerToken, matchId);
            for (Team team : currentMatchStat.getRounds().get(0).getTeams()) {
                for (Player player : team.getPlayers()) {
                    if (player.getPlayerId().equals(players.get(name))) {
                        PlayerStats playerStats = player.getPlayerStats();
                        stats.setTripleKills(stats.getTripleKills() + Integer.parseInt(playerStats.getTripleKills()));
                        //stats.setkRratio((stats.getkRratio() + Integer.parseInt(playerStats.getKDRatio())) / matchesIdList.size());
                        //stats.setkRratio((stats.getkRratio() + Integer.parseInt(playerStats.getKRRatio())) / matchesIdList.size());
                        stats.setAssists(stats.getAssists() + Integer.parseInt(playerStats.getAssists()));
                        stats.setDeaths(stats.getDeaths() + Integer.parseInt(playerStats.getDeaths()));
                        stats.setKills(stats.getKills() + Integer.parseInt(playerStats.getKills()));
                        stats.setHeadshots(stats.getHeadshots() + Integer.parseInt(playerStats.getHeadshots()));
                        stats.setMvps(stats.getMvps() + Integer.parseInt(playerStats.getMVPs()));
                        stats.setPentaKills(stats.getPentaKills() + Integer.parseInt(playerStats.getPentaKills()));
                        stats.setQuadroKills(stats.getQuadroKills() + Integer.parseInt(playerStats.getQuadroKills()));
                        //stats.setHeadshotPercentage((double) (stats.getKills() / stats.getHeadshots()));
                    }
                }
            }
        }
        return stats;
    }
}
