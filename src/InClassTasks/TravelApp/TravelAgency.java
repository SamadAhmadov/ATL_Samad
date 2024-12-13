package InClassTasks.TravelApp;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private String agencyName;
    private List<Tour> tours;
    private List<Customer> customers;

    public TravelAgency(String agencyName) {
        this.agencyName = agencyName;
        this.tours = new ArrayList<>();
        this.customers= new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addTour(Tour tour) {
        tours.add(tour);
        System.out.println("Tur " + tour.getTourName() + " sizin tur agentliyə əlavə olundu.");
    }

    public  void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Müştəri "+customer.getCustomerName()+" sizin tur agentliyə əlavə olundu.");
    }

    public void displayTour() {
        System.out.println(agencyName + " tərəfindən təklif olunan turlar:");
        for (Tour tour : tours) {
            tour.displayTour();
        }
    }

    public void displayCustomer(){
        System.out.println(agencyName + " agentliyinin müştəriləri:");
        for (Customer customer : customers){
            customer.displayCustomer();
        }
    }
}