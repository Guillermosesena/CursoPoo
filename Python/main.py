from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo _")

    car = Car("WFE963",Account("Andres Herrera","SFEW66"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("WFE53",Account("Juab","FDW977"))
    print(vars(car2))
    print(vars(car2.driver))
