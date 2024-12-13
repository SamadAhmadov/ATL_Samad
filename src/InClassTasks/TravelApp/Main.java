package InClassTasks.TravelApp;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TravelAgency agency = new TravelAgency("Dream Tours");

        Tour tour1 = new Tour(1, "Sunny Beach Holiday", 200.0, TourPackage.BEACH_HOLIDAY);
        Tour tour2 = new Tour(2, "Urban City Adventure", 150.0, TourPackage.CITY_TOUR);
        Tour tour3 = new Tour(3, "Mountain Tracking", 300.0, TourPackage.MOUNTAIN_ADVENTURE);
        Tour tour4 = new Tour(4, "Titanic Adventures", 1000.00, TourPackage.CRUISE_TRIP);
        Tour tour5 = new Tour(4, "Camel Riding", 1000.00, TourPackage.DESERT_SAFARI);

        agency.addTour(tour1);
        agency.addTour(tour2);
        agency.addTour(tour3);
        agency.addTour(tour4);
        agency.addTour(tour5);

        agency.displayTour();

//      agency.addCustomer(new Customer(1, "Samad", Arrays.asList(tour1)));
        Customer customer1 = new Customer(1, "Samad", List.of(tour1));
        Customer customer2 = new Customer(2, "Tofiq", List.of(tour2,tour3));
        Customer customer3 = new Customer(3, "Kanan", List.of(tour4));

        customer1.reserveTour(tour1);
        customer2.reserveTour(tour2);
        customer3.reserveTour(tour4);

        agency.addCustomer(customer1);
        agency.addCustomer(customer2);
        agency.addCustomer(customer3);
        agency.displayCustomer();
        tour1.reserveTour();
        tour1.cancelReservation();
    }
}