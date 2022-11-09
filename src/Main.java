public class Main {
    public static void main(String[] args){
        Human maxim = new Human("Максим", "Минск",1988,
                "бренд-менеджер");

        System.out.println(maxim);

        Human anya = new Human("Аня","Москва",1993,
                "методист образовательных программ");

        System.out.println(anya);

        Human katya = new Human("Катя","Калининград",1992,
                "продакт-менеджер");

        System.out.println(katya);

        Human artyom = new Human("Артём","Москва",1995,
                "директор по развитию бизнеса");

        System.out.println(artyom);
        System.out.println();

        Car lada = new Car("Lada","Granta",1.7f,"желтый",2015,"Россия");

        System.out.println(lada);

        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0f,
                "Черный",2020,"Германия");

        System.out.println(audi);

        Car bmw = new Car("BMW","Z8",3.0f,
                "Черный",2021,"Германия");

        System.out.println(bmw);

        Car kia = new Car("KIA","Sportage 4-го поколения",2.4f,
                "Красный",2018,"Южная Корея");

        System.out.println(kia);

        Car hyundai = new Car("Hyundai","Avante",1.6f,
                "Оранжевый",2016,"Южная Корея");

        System.out.println(hyundai);

    }
}