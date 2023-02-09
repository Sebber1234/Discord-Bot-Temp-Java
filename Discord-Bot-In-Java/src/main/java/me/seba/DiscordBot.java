package me.seba;

import commands.BotCommands;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;

public class DiscordBot {
    public static void main(String[] args) throws InterruptedException {

        JDA jda = JDABuilder.createDefault("TOKEN")
                .setActivity(Activity.listening("POP SMOKE"))
                .addEventListeners(new BotCommands())
                .build().awaitReady();

 //*       Guild guild = jda.getGuildById("DISCORD"GUILDED"ID");
        if (guild != null){

            guild.upsertCommand("test", "test").queue();
        }
    }
    }
