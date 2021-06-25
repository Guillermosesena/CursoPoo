<?php
class Car
{
    public $id;
    public $license;
    public $driver;
    public $passegers;

    public function __constructor($license, $driver){
        $this->license = license;
        $this->driver = driver;
    }


    public function PrintDataCar(){
        echo "License: " + $license + " Name: " $driver->name + " Document: " $driver->document"; 
      }
    
}
?>

