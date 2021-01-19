package FINAL;

import java.util.*;

public class Airport {
  

    public Queue<String> Landing;
    public Queue<String> Takeoff;
    public LinkedList<String> Log;
    //          private String Flight_Num; 

    public Airport() {
                 Takeoff = new LinkedList<String>();
                 Landing = new LinkedList<String>();
                 Log = new LinkedList<String>();

    }
    
    public void addTakeOff(String flightSymbol) {
                 Takeoff.add(flightSymbol);
    }


    public void addLanding(String flightSymbol) {
                 Landing.add(flightSymbol);
    }

    public String handleNextAction() {    

        if (Landing.isEmpty() && Takeoff.isEmpty()) {
                      return "No activity exists.";                    

        }else if (Landing.isEmpty() && !Takeoff.isEmpty()) {
                      String plane = Takeoff.peek();
                      String his= "Flight " + plane + " took off";
                      Takeoff.remove();
                      Log.add(his);
                      return "Flight " + plane+ " is taking off";
        }else {

                      String plane = Landing.peek();
                      String his=  "Flight " + plane + " landed";
                      Landing.remove();
                      Log.add(his);
                      return "Flight " +plane + " is landing";
        }

}
    public String waitingPlanes() {
                 if(Takeoff.isEmpty() && Landing.isEmpty()) {
                               String val = "No plane is in the landing and take-off queues.";
                               return val;
                 }else {
                               return "Planes waiting for takeoff\n-------------------------\n"+Takeoff.toString();
                 }
    }



    public String log() {

              if (Log.isEmpty()) {
                            String val = "No activity exists.";
                            return val;
              }else {                        
            	  			String val="List of landing/takeoff activities\n----------------------\n";
            	  			for(int i=0; i< Log.size(); i++) {
            	  				val+=Log.get(i)+"\n";
           
            	  			}
                            return val;

              }           
    }
}

   

   

   

   


