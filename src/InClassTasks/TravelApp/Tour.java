package InClassTasks.TravelApp;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour(int tourId, String tourName, double price, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.tourPackage = tourPackage;
        this.isReserved = false;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourId=" + tourId +
                ", tourName='" + tourName + '\'' +
                ", price=" + price +
                ", tourPackage=" + tourPackage +
                ", isReserved=" + isReserved +
                '}';
    }

    public void displayTour() {
        System.out.println("Tour ID: " + tourId +
                        ", tour name: " + tourName +
                        ", price=" + price +
                        ", tour package: " + tourPackage +
                        ", reserved: " + (isReserved ? "Yes" : "No"));
    }

    public void reserveTour() {
        if (isReserved) {
            System.out.println("Tour has already reserved");
        } else {
            isReserved = true;
            System.out.println(getTourName() + " tour is reserved");
        }
    }

    public void cancelReservation() {
        if (!isReserved) {
            System.out.println("Tour is not reserved");
        } else {
            System.out.println(getTourName() + " tour cancellation is done");
        }
    }
}