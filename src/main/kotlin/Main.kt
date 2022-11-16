fun main(args: Array<String>) {

    val repository: CarRepository = CarRepository()
    repository.insert(Car(0,"Mazda"))
    repository.insert(Car(1,"Nisan"))
    repository.insert(Car(2,"Toyota"))

    repository.findById(0)
    repository.delete(0)
    repository.findById(0)

    repository.findById(1)
    repository.update(1,Car(1,"Tesla"))
    repository.findById(1)
}
