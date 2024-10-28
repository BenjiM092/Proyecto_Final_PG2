package Proyecto.Progra2.Proyecto.Final;

import Proyecto.Progra2.Proyecto.Final.service.TelegramBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private TelegramBotService telegramBotService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        telegramBotService.startBot();
    }
}
