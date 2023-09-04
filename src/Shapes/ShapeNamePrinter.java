package Shapes;

public class ShapeNamePrinter {
    Shape shape;
    //я вибачаюсь але мені не зовсім зрозуміло в завданні :
    // "повинен бути клас, що приймає фігуру, та виводить її назву. Клас повинен працювати саме з базовим класом Shape"
    //класс має приймати і виводити в консоль при створенні? тобто в конструкторі додати вивід, чи просто реалізувати такий метод
    //я вирішив зробити метод
    public ShapeNamePrinter(Shape shape) {
        this.shape = shape;
    }

    public void printShapeName(Shape shape){
        System.out.println();
    }
}
