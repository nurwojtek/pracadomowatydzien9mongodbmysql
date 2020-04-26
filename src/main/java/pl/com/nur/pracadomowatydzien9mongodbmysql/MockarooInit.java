package pl.com.nur.pracadomowatydzien9mongodbmysql;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import pl.com.nur.pracadomowatydzien9mongodbmysql.component.Start;

@Controller
public class MockarooInit {

    Start start;

    public MockarooInit(Start start) {
        this.start = start;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initAll() {
        start.initMongo();
        start.initSQL();
        start.readMongo();
        start.readSQL();
        start.delMongo();
        start. delSQL();
    }
}
