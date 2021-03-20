package hu.faceit.presentation;

import hu.faceit.models.MatchesAllStats;
import hu.faceit.models.match.stats.MatchStats;
import hu.faceit.models.player.history.PlayerHistory;
import hu.faceit.models.player.info.PlayerInfo;
import hu.faceit.service.MatchService;
import hu.faceit.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/csgo")
public class Controller {
    private final PlayerService playerService;
    private final MatchService matchService;

    public Controller(PlayerService playerService, MatchService matchService) {
        this.playerService = playerService;
        this.matchService = matchService;
    }

    @GetMapping("/player/{name}")
    PlayerInfo getPlayer(@PathVariable String name) {
        return playerService.getPlayerByName(name);
    }

    @GetMapping("/player/history/{name}")
    PlayerHistory getPlayerHistory(@PathVariable String name,
                                   @RequestParam(required = false) Integer from,
                                   @RequestParam(required = false) Integer to,
                                   @RequestParam(required = false) Integer offset,
                                   @RequestParam(required = false) Integer limit) {
        return playerService.getPlayerHistory(name, from, to, offset, limit);
    }

    @GetMapping("/player/matches/{name}")
    List<String> getPlayerMatches(@PathVariable String name,
                                  @RequestParam(required = false) Integer from,
                                  @RequestParam(required = false) Integer to,
                                  @RequestParam(required = false) Integer offset,
                                  @RequestParam(required = false) Integer limit) {
        return matchService.getMatchIdListByDate(name, from, to, offset, limit);
    }

    @GetMapping("/player/matchstat/{name}")
    MatchStats getPlayerMatchStats(@PathVariable String name,
                                   @RequestParam(required = false) Integer from,
                                   @RequestParam(required = false) Integer to,
                                   @RequestParam(required = false) Integer offset,
                                   @RequestParam(required = false) Integer limit) {
        return matchService.getMatchStats(name, from, to, offset, limit);
    }

    @GetMapping("/matches/all-stats/{name}")
    MatchesAllStats getMatchesAllStats(@PathVariable String name,
                                       @RequestParam(required = false) Integer from,
                                       @RequestParam(required = false) Integer to,
                                       @RequestParam(required = false) Integer offset,
                                       @RequestParam(required = false) Integer limit) {
        return matchService.getMatchesAllStats(name, from, to, offset, limit);
    }
}
