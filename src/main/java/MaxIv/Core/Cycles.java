package MaxIv.Core;

public class Cycles {

    //    Типы Циклов в Java
    public void CycleWile(){
        int count = 5;
        //        count >= 0  Условие, которое должно возвращать boolean
            while (count > 0){
                System.out.println("True, count = " +count );      // Логика которая срабатывает при True
                count--;                                     // Изменяем переменную
        }
        System.out.println("False, count = " + count );

    }
    public void CycleWileTrue(){
        int count = 5;
        while (true){     // Условие всегда True ОБЯЗАТЕЛЬНО СОЗДАТЬ Оператор ВЫХОДА
            System.out.println("True, count = " +count );
            count--;
            if (count == 0){           // Условие выхода
                System.out.println("Выход из цикла , count = " + count );
                break;  //  Оператор выхода
            }

        }
    }

    public  void CycleDoWhile(){
        int count = 5;

        do {   // Тело цикла
            System.out.println("count = " + count);
            count --;
        } while (count > 0 );// Условие работы цикла
        System.out.println("Выход из цикла , count = " + count );

    }
    public void CycleFor(){
        for (int i = 0; i < 5 ; i++) {  // Условие работы (Стартовое условие , условие океончания , изменяющаяся переменная при каждой итерации цикла)
            System.out.println("Переменная i = "+i);  // Тело Цикла
        }
        System.out.println("Цикл закончился ");
    }
    public void CycleForEach(){
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        for ( int a  : arr) {
            System.out.println(a);

        }
    }


}
