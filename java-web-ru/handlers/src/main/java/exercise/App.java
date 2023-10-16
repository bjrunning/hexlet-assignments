package exercise;

import io.javalin.Javalin;
import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        // Получаем список телефонов
        List<String> phones = Data.getPhones();
        // Получаем список доменных имен
        List<String> domains = Data.getDomains();
        Javalin app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        app.get("/phones", ctx -> ctx.writeJsonStream(phones.stream()));
        app.get("/domains", ctx -> ctx.writeJsonStream(domains.stream()));
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
