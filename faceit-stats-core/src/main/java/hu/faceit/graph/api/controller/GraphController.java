package hu.faceit.graph.api.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import hu.faceit.service.TeamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController {

    private final TeamService teamService;

    public GraphController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/displayBarGraph")
    public String barGraph(Model model) {
        Map<String, Double> surveyMap = new LinkedHashMap<>();
        for (var members : teamService.getDailyKillStat()) {
            surveyMap.put(members.getName(), members.getKills());
        }
        model.addAttribute("surveyMap", surveyMap);
        return "barGraph";
    }

    @GetMapping("/displayPieChart")
    public String pieChart(Model model) {
/*        Double andorKills = null;
        Double laciKills = null;
        Double szebiKills = null;
        Double damniKills = null;
        Double mikiKills = null;
        Double lajosKills = null;
        var stats = teamService.getDailyKillStat();
        for (var member : stats) {
            switch (member.getName()) {
                case "andor":
                    andorKills = member.getKills();
                    break;
                case "laci":
                    laciKills = member.getKills();
                    break;
                case "szebi":
                    szebiKills = member.getKills();
                    break;
                case "damni":
                    damniKills = member.getKills();
                    break;
                case "miki":
                    mikiKills = member.getKills();
                    break;
                case "lajos":
                    lajosKills = member.getKills();
                    break;
            }
        }

        model.addAttribute("andor", andorKills);
        model.addAttribute("laci", laciKills);
        model.addAttribute("szebi", szebiKills);
        model.addAttribute("damni", damniKills);
        model.addAttribute("miki", mikiKills);
        model.addAttribute("lajos", lajosKills);*/
        return "pieChart";
    }

}
