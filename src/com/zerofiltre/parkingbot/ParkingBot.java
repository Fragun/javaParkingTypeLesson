package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Bicycle;
import com.zerofiltre.parkingbot.model.Car;
import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.service.ParkingService;

public class ParkingBot {

  static ParkingService parkingService = new ParkingService();

  /**
   * Ceci est la méthode Main
   *
   * @param args : Tableau de données entrées lors du lancement de l'application
   */
  public static void main(String[] args) {
    processVehicles();
  }

  private static void processVehicles() {
    Vehicle vehicle = new Vehicle();
    vehicle.setRegistrationNumber("AJ-144-AK");
    Ticket vehiculeTicket = parkingService.processIncomingVehicle(vehicle);
    System.out.println(vehiculeTicket);

    Vehicle bicyble = new Bicycle();
    bicyble.setRegistrationNumber("ZZ-125-LM");
    Ticket bicycleTicket = parkingService.processIncomingVehicle(bicyble);
    System.out.println(bicycleTicket);

    Vehicle car = new Car();
    car.setRegistrationNumber("AZ-155-AA");
    Ticket carTicket = parkingService.processIncomingVehicle(car);
    System.out.println(carTicket);
  }

}
