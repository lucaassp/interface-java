package model.services;

public class RentalService {
  private Double pricePerDay; 
  private Double pricePerHour;

  private BrazilTaxService taxService;

  public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
    this.pricePerDay = pricePerDay;
    this.pricePerHour = pricePerHour;
    this.taxService = taxService;
  }
}
