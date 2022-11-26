import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Victor Rodriguez", "vrodriguez@victor.com.co");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        //System.out.println(myDoctor.getAvailableAppointments());
        /*
        for (Doctor.AvailableAppointment aAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(aAppointment.getDate() + " " + aAppointment.getTime());
        }*/

        Patient patient = new Patient("May Davila", "bmdavila06@hotmail.com");
        System.out.println(patient);



    }
}