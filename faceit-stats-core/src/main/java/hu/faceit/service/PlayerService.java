package hu.faceit.service;

import hu.faceit.FaceitGatewayIF;
import hu.faceit.models.FaceItData;
import hu.faceit.models.player.history.PlayerHistory;
import hu.faceit.models.player.info.PlayerInfo;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Service
public class PlayerService extends FaceItData {
    private final FaceitGatewayIF faceitGatewayIF;

    public PlayerService(FaceitGatewayIF faceitGatewayIF) {
        this.faceitGatewayIF = faceitGatewayIF;
    }

    public PlayerInfo getPlayerByName(String name) {
        return faceitGatewayIF.getPlayer(bearerToken, players.get(name));
    }

    public PlayerHistory getPlayerHistory(String name, Integer from, Integer to, Integer offset, Integer limit) {
        if (from == null) {
            from = 1332257416;
        }
        if (to == null) {
            to = 0;
        }
        if (offset == null) {
            offset = 0;
        }
        if (limit == null) {
            limit = 100;
        }
        return faceitGatewayIF.getPlayerHistory(bearerToken,
                players.get(name),
                "csgo",
                dayToTimestamp(from),
                dayToTimestamp(to),
                offset, limit);
    }

    private Integer dayToTimestamp(Integer day) {
        return (int) Instant.now().minus(day, ChronoUnit.DAYS).getEpochSecond();
    }
}
