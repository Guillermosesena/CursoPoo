from car import Car

if __name__ == "__main__":
    print("Hola mundo _")
    car = Car()
    car.license = "WFE963"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car();
    car2.license = "FDW977"
    car2.driver = "Juan"
    print(vars(car2))
