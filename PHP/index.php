<?php
    require_once('Car.php');
    require_once('Account.php');

    $car = new Car("PDW55", new Account("Andres Herrera", "AFS843"));
    $car->PrintDataCar();
?>