package hu.faceit.service;

import hu.faceit.models.DailyKills;
import hu.faceit.models.FaceItData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TeamService extends FaceItData {

    private final MatchService matchService;

    public TeamService(MatchService matchService) {
        this.matchService = matchService;
    }

    public List<DailyKills> getDailyKillStat() {
        List<DailyKills> dailyKillsList = new ArrayList<>();
        for (Map.Entry<String, String> name : players.entrySet()) {
            dailyKillsList.add(new DailyKills(name.getKey(),
                    matchService.getMatchesAllStats(name.getKey(),
                            3,
                            null,
                            null,
                            null).getKills()));
        }
        return dailyKillsList;
    }
}
