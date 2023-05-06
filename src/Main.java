import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /** University, School, Car жана Person деген класс тузунуз
         Алардын свойстваларын ойлоп табыныз
         Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
         Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
         Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз */
        Person person=new Person();
        person.setName("Asylbek ake");
        person.setAge(27);
        person.setGroup("Java");

        Person person1=new Person();
        person1.setName("Baktulan");
        person1.setAge(23);
        person1.setGroup("Java");

        Person person2=new Person();
        person2.setName("Adilet");
        person2.setAge(15);
        person2.setGroup("JS");

        Person [] people={person,person1,person2};

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName()+"\n"+people[i].getAge()+"\n"+people[i].getGroup());
        }
        Car car=new Car();
        car.setBrand("Mersedes");
        car.setModel("S class");
        car.setYearOfIssue(2019);
        car.setPrice(15000);

        Car car1=new Car();
        car1.setBrand("BMW");
        car1.setModel("X-6");
        car1.setYearOfIssue(2020);
        car1.setPrice(20000);

        Car car2=new Car();
        car2.setBrand("Audi");
        car2.setModel(" Audi 100");
        car2.setYearOfIssue(2000);
        car2.setPrice(10000);
        Car[] cars={car,car1,car2};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand()+"\n"+cars[i].getModel()+"\n"+cars[i].getYearOfIssue()+"\n"+cars[i].getPrice());

        }

        University university=new University();
        university.setName("KEU");
        university.setKesipter("Ecomnomist");
        university.setKesypetrdinSany(12);

        University university1=new University();
        university1.setName("Politeh");
        university1.setKesipter("Programmist");
        university1.setKesypetrdinSany(10);

        University university2=new University();
        university2.setName("Finteh");
        university2.setKesipter("Financy");
        university2.setKesypetrdinSany(2);
        University [] universities={university,university1,university2};
        for (int i = 0; i < universities.length; i++) {
            System.out.println(universities[i].getName()+"\n"+universities[i].getKesipter()+"\n"+universities[i].getKesypetrdinSany());

        }

        School school=new School();
        school.setName("Turusbek");
        school.setAdres("Toktogul");
        school.setOkuuchulardynSany(2000);

        School school1=new School();
        school1.setName("Bokonbaev");
        school1.setAdres("Toktogul");
        school1.setOkuuchulardynSany(5000);

        School[] schools=new School[]{school,school1};
        for (int i = 0; i < schools.length; i++) {
            System.out.println(schools[i].getName()+"\n"+schools[i].getAdres()+"\n"+schools[i].getOkuuchulardynSany());

        }



        }





    }
