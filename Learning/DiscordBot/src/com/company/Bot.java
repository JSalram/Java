package com.company;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class Bot extends ListenerAdapter
{

    int i = 0;
    String[] menciones = {" es mongol@", " es to buena gente", " que te den", " pa que me despiertas"};

    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event)
    {
        if (!event.getAuthor().isBot())
        {
            String msg = event.getMessage().getContentRaw();
            if (msg.equals("!help"))
            {
                event.getChannel().sendMessage("Comandos disponibles:").queue();
                event.getChannel().sendMessage("!hey          !qtal          !calla          !mola          !ping          !animu").queue();
                event.getChannel().sendMessage("!pim          !mencion          !reaccion          !dead          !life          !bye").queue();
            }

            if (msg.equals("!hey"))
            {
                event.getChannel().sendMessage("sup!").queue();
            }
            if (msg.equals("!qtal"))
            {
                event.getChannel().sendMessage("aqui estamos").queue();
            }
            if (msg.equals("!calla"))
            {
                event.getChannel().sendMessage("shut up!").queue();
            }
            if (msg.equals("!mola"))
            {
                event.getChannel().sendMessage("mazo!").queue();
            }
            if (msg.equals("!ping"))
            {
                event.getChannel().sendMessage("pong, set y partido!").queue();
            }
            if (msg.equals("!pim"))
            {
                event.getChannel().sendMessage("pam").queue();
                event.getChannel().sendMessage("pum").queue();
                event.getChannel().sendMessage("tengo una pistola!").queue();
            }
            if (msg.equals("!mencion"))
            {
                i++;
                if (i == 4)
                {
                    i = 0;
                }
                User autor = event.getMessage().getAuthor();
                event.getChannel().sendMessage("<@" + autor.getId() + ">" + menciones[i]).queue();
            }
            if (msg.equals("!reaccion"))
            {
                event.getMessage().addReaction("U+1F525").queue();
            }
            if (msg.equals("!dead"))
            {
                event.getChannel().sendMessage("https://www.youtube.com/watch?v=bub6dkYZI_Y").queue();
                event.getMessage().addReaction("U+26B0").queue();
                event.getMessage().addReaction("U+1F57A").queue();
            }
            if (msg.equals("!life"))
            {
                event.getMessage().addReaction("U+1F476").queue();
                event.getMessage().addReaction("U+1F9D2").queue();
                event.getMessage().addReaction("U+1F468").queue();
                event.getMessage().addReaction("U+1F474").queue();
                event.getMessage().addReaction("U+1F480").queue();
            }


            if (event.getMessage().getContentRaw().equals("!animu"))
            {
                event.getChannel().sendMessage("-play https://www.youtube.com/watch?v=o0X0QUwU-no&t=2717s").queue();
            }
        }
        if (event.getAuthor().getId().equals("190845485982941184"))
        {
            if (event.getMessage().getContentRaw().equals("!bye"))
            {
                event.getChannel().sendMessage("¡Hasta otra!").queue();
            }
        }
        if (event.getAuthor().isBot() && event.getMessage().getContentRaw().equals("¡Hasta otra!"))
        {
            event.getMessage().addReaction("U+1F44B").queue();
            System.exit(0);
        }
    }
}
