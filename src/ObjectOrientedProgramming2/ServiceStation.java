package ObjectOrientedProgramming2;

public class ServiceStation {
    private void updateTyre(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            updateTyre(car);
            car.checkEngine();
        } else if (truck != null) {
            updateTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            updateTyre(bicycle);
        }
    }
}