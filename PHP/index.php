<?php
    require_once('Car.php');
    require_once('uberX.php');
    require_once('uberPool.php');
    require_once('Account.php');

    $uberX = new UberX("FEW868",new Account("Andres Herrera","FEW687"),"Chevrolet","Spark");
    $uberX->PrintDataCar();

    $uberPool = new UberPool("GEW868",new Account("Juan","RWW677"),"Dogde","Attitute");
    $uberPool->PrintDataCar();
?>