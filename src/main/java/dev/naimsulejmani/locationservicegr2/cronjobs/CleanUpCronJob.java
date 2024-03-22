package dev.naimsulejmani.locationservicegr2.cronjobs;

import dev.naimsulejmani.locationservicegr2.infrastructure.data.DbDao;
import dev.naimsulejmani.locationservicegr2.services.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanUpCronJob {

    private final DbDao dbDao;

    private final UserService userService;

    public CleanUpCronJob(DbDao dbDao, UserService userService) {
        this.dbDao = dbDao;
        this.userService = userService;
    }


    @Scheduled(cron = "0 0 8 8 3 ?")
    public void sayHelloToJoniEvery5Seconds() {
        var users = userService.findAll();
        users.forEach(user -> {
            if(user.getGender()=='F') {
                System.out.println("Send SMS Happy womens days");
            }
        });

    }
}












