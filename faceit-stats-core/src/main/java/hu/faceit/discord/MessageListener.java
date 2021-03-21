package hu.faceit.discord;

import discord4j.core.object.entity.Message;
import hu.faceit.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.List;

public abstract class MessageListener {

    @Autowired
    private MatchService matchService;

    public Mono<Void> processCommand(Message eventMessage) {
        List<String> commandList = List.of("!lajos", "!miki", "!laci", "!andor", "!damni", "!szebi");
        String content = eventMessage.getContent();
        String name;
        Integer from;
        Integer to;


        //TODO: ne válaszoljon minden üzenetre
        if (commandList.contains(getName(content))) {
            name = content.substring(content.indexOf("!") + 1);
            if (content.contains("&")) {
                name = content.substring(content.indexOf("!") + 1, content.indexOf("&"));
                from = Integer.valueOf(content.substring(content.indexOf("&") + 1));
                return getMessage(eventMessage, name, from, null);
            }
            return getMessage(eventMessage, name, 1, null);
        }

        return Mono.just(eventMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .flatMap(Message::getChannel)
                .flatMap(channel -> channel.createMessage("Napi stat: !lajos, !miki, !laci, !andor, !damni, !szebi" + "\n" +
                        "X napra visszamenő összegzett stat: !andor&X, !laci&X ..."))
                .then();
    }

    private Mono<Void> getMessage(Message eventMessage, String name, Integer from, Integer to) {
        return Mono.just(eventMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .flatMap(Message::getChannel)
                .flatMap(channel -> channel.createMessage(matchService.getMatchesAllStats(name, from, to, null, null).toString()))
                .then();
    }

    private String getName(String longName) {
        if (longName.contains("&")) {
            return longName.substring(longName.indexOf("!"), longName.indexOf("&"));
        }
        return longName;
    }
}
