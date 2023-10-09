package test.alta.hooks;

import org.junit.After;
import test.driver.DriverPool;

import java.util.Optional;

public class BaseDriverHooks {
    public DriverPool driverPool = new DriverPool();

    @After
    public void afterTest(){
        quitAndroidDrivers(driverPool);
    }

    private void quitAndroidDrivers(DriverPool drivers) {
        Optional.ofNullable(drivers.getAndroidDriver()).ifPresent(
                driver -> {
                    driver.quit();;
                    drivers.setAndroidDriver(null);
                }
        );
    }
}
