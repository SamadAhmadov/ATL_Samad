package InClassTasks.TravelApp;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private List<Tour> reservedTours;

    public Customer(int customerId, String customerName, List<Tour> reserveTours) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.reservedTours = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Tour> getReserveTours() {
        return reservedTours;
    }

    public void setReserveTours(List<Tour> reserveTours) {
        this.reservedTours = reserveTours;
    }

    public void reserveTour(Tour tour) {
        if(!tour.isReserved()){
            tour.reserveTour();
            reservedTours.add(tour);
            System.out.println("Tur " + tour.getTourName() + " paket sizin siyahınıza əlavə olundu.");
        }else {
            System.out.println("Tur paketi artıq rezerv olunub.");
        }
    }

    public void cancelReserve(Tour tour){
        if (reservedTours.contains(tour)){
            tour.cancelReservation();
            reservedTours.remove(tour);
            System.out.println("Tur " + tour.getTourName() + " siyahınızdan silindi.");
        }else {
            System.out.println("Rezerv atrıq ləğv olunub.");
        }
    }

    public void displayCustomer (){
        System.out.println("Customer name: " + customerName +
                ", customer ID: " + customerId +
                ", reserved tours" + reservedTours);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", reserveTours=" + reservedTours +
                '}';
    }
}
