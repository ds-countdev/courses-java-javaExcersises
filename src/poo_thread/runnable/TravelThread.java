package poo_thread.runnable;

public class TravelThread implements Runnable{

    private String travelName;

    public TravelThread (String name) {
        this.travelName = name;
    }

    public String getTravelName() { return this.travelName;}



    @Override
    public void run(){
        System.out.println("initiating travel to " + this.getTravelName());
        for (int i=0 ; i < 10; i ++){
            System.out.println("in " + i);
            try{
                Thread.sleep((long) (Math.random() * 1000));
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        System.out.println("The travel is going to start finally");
    }
}
