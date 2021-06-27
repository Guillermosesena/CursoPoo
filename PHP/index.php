<?php
    require_once('Car.php');
    require_once('uberX.php');
    require_once('uberPool.php');
    require_once('Account.php');
    require_once('uberVan.php');

    $uberX = new UberX("FEW868",new Account("Andres Herrera","FEW687"),"Chevrolet","Spark");
    $uberX->setPassenger(4);
    $uberX->PrintDataCar();

    $uberPool = new UberPool("GEW868",new Account("Juan","RWW677"),"Dogde","Attitute");
    $uberPool->setPassenger(4);
    $uberPool->PrintDataCar();

    $uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
    $uberVan->setPassenger(6);
    $uberVan->printDataCar();
?>