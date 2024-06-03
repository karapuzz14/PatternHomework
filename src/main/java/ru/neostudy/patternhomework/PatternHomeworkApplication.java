package ru.neostudy.patternhomework;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neostudy.patternhomework.adapter.CardAdapter;
import ru.neostudy.patternhomework.adapter.Computer;
import ru.neostudy.patternhomework.adapter.MemoryCard;
import ru.neostudy.patternhomework.adapter.USB;
import ru.neostudy.patternhomework.factory.CoffeeFactory;
import ru.neostudy.patternhomework.factory.CoffeeShop;
import ru.neostudy.patternhomework.factory.CoffeeType;
import ru.neostudy.patternhomework.proxy.DatabaseConnection;
import ru.neostudy.patternhomework.proxy.ProxyConnection;
import ru.neostudy.patternhomework.singleton.LoggerSingleton;

@SpringBootApplication
public class PatternHomeworkApplication {

  public static void main(String[] args) throws SQLException {
    System.out.println("[SINGLETON]");
    LoggerSingleton logger = LoggerSingleton.getInstance();
    logger.classLog(logger, "Класс-одиночка для ведения журнала.");

    System.out.println("[FACTORY]");
    CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
    coffeeShop.makeCoffee(CoffeeType.AMERICANO);

    System.out.println("[ADAPTER]");
    USB usb = new USB();
    Computer computer = new Computer();
    computer.connect(usb);

    MemoryCard memoryCard = new MemoryCard();
    computer.connect(new CardAdapter(memoryCard));

    System.out.println("[PROXY]");
    DatabaseConnection connection = new DatabaseConnection("postgres");
    ProxyConnection proxy = new ProxyConnection("localhost:5432/", connection);
    proxy.connect();

    SpringApplication.run(PatternHomeworkApplication.class, args);
  }

}
