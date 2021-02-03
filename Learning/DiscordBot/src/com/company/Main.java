package com.company;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException
    {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NzAyODE2NTkxNTQ4NTE0MzA1.XqFjcw.E2mMOJu1vP5UGXf9_h4w37RBP7k";
        builder.setToken(token);
        builder.addEventListeners(new Bot());
        builder.build();
    }
}
