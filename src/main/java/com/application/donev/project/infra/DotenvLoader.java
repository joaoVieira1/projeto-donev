package com.application.donev.project.infra;

import io.github.cdimascio.dotenv.Dotenv;

public class DotenvLoader {

    public static void load() {
        Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );
    }

}
