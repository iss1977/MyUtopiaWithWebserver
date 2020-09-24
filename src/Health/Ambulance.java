<<<<<<< HEAD:src/Ambulance.java
public class Ambulance implements Event {

    public void happens(Citizen citizen) {
        int health = citizen.getCitizenStatus().getMainStatus().getHealthbar();
        Event hospital = GlobalStacker.registeredActivities.get(8);
        if (health < 10) {
            citizen.doEvent(hospital);
        }
    }

    public void tick() {

    }

    @Override
    public Category[] getCategory() {
        return new Category[]{Category.Health};
    }
=======
package Health;

import Citizen.Citizen;
import UtopiaCore.Category;
import UtopiaCore.Event;

public class Ambulance implements Event {

    public void happens(Citizen citizen){
        int health = citizen.getCitizenStatus().getMainStatus().getHealthbar();

        if (health < 10) {
            health = health + 25;
            citizen.getCitizenStatus().getMainStatus().setHealthbar(health);
        }
    };
    public void tick(){

    }

    @Override
    public Category[] getCategory() {
        return new Category[] {Category.Health};
    }

    ;
>>>>>>> 1d5401338bc8f9ca851e1c8f21c63264ac811f7f:src/Health/Ambulance.java
}