package hu.faceit;

import hu.faceit.models.match.stats.MatchStats;
import hu.faceit.models.player.history.PlayerHistory;
import hu.faceit.models.player.info.PlayerInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "faceitFeignClient", url = "https://open.faceit.com/data/v4")
public interface FaceitGatewayIF {

    @GetMapping("/players/{id}")
    PlayerInfo getPlayer(@RequestHeader("Authorization") String bearerToken,
                         @PathVariable String id);

    @GetMapping("/players/{id}/history")
    PlayerHistory getPlayerHistory(@RequestHeader("Authorization") String bearerToken,
                                   @PathVariable String id,
                                   @RequestParam String game,
                                   @RequestParam Integer from,
                                   @RequestParam Integer to,
                                   @RequestParam Integer offset,
                                   @RequestParam Integer limit);

    @GetMapping("/matches/{id}/stats")
    MatchStats getPlayerMatchStats(@RequestHeader("Authorization") String bearerToken,
                                   @PathVariable String id);
}
