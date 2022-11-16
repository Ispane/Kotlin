class CarRepository {

    val CarCollection = mutableListOf<Car>()

    fun insert(Car: Car) {
        Car.ID = CarCollection.size
        println(Car.ID)
        CarCollection.add(Car)
        println("${Car.Mark} added")
    }

    fun findById(ID: Int): Int?{
        var CarIndex: Int? = null
        for(i in 0..CarCollection.size)
        {
            if(CarCollection[i].ID==ID)
            {
                CarIndex = i
                println("Car ${CarCollection[i].Mark} was found")
            }
            else
            {
                CarIndex = null
                println("Car with this ID was not found")
            }
            break
        }
        return CarIndex
    }

    fun update(ID: Int, car:Car){
        var findingCar: Int? = findById(ID)
        if(findingCar != null)
        {
            car.ID=ID
            CarCollection[findingCar]=car
        }
    }

    fun delete(ID: Int){
        var findingCar: Int? = findById(ID)
        if (findingCar != null) {
            CarCollection.removeAt(findingCar)
        }
    }

}