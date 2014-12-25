package gr.cloudbiz.camelimporttool.runner;

import gr.cloudbiz.camelimporttool.routes.TextToHttpRoute;
import org.apache.camel.main.Main;

public class ImportToolMain {

    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.enableHangupSupport();

        main.addRouteBuilder(new TextToHttpRoute());
        // Use the following runner in order to have your camel app always running 
        // until someone kills the process (like Ctrl + C)
        //main.run(args);
        main.start();
        Thread.sleep(2000);
        System.out.println("Done");
        main.stop();
    }

}
