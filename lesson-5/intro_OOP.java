package geekbrains.lesson_3.lesson_5;

public class intro_OOP {

    public static void main(String[] args) {


        //Task 5

        Associate[] associateArray = new Associate[5];

            associateArray[0] = new Associate("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);

            associateArray[1] = new Associate("Petrov Vasily", "Manager", "petrpetrov@mailbox.com", "892312313", 50000, 50);
            associateArray[2] = new Associate("Sidorov Nicolay", "Accounter", "nicolaysidorov@mailbox.com", "892312314", 50000, 35);

            associateArray[3] = new Associate("Medvedev Vladimir", "Director", "vladimirmedvedev@mailbox.com", "892312315", 150000, 45);

            associateArray[4] = new Associate("Smirnova Anna", "Secretary", "annasmirnova@mailbox.com", "892312316", 25000, 30);


               //Task 6
              for (int i = 0; i < associateArray.length; i++) {
            if (associateArray[i].age>40){
                associateArray[i].info();
            }
        }

    }

}

// Task 1 :
class Associate{
        String name;
        String position;
        String email;
        String cellNumber;
        double salary;
        int age;

        //Task 5

    public Associate(String name, String position, String email, String cellNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.cellNumber = cellNumber;
        this.salary = salary;
        this.age = age;
    }

    // Task 2 :
    //   public Associate() {
 //       name = "Name";
 //       position = "Position";
 //       email = "email";
 //       cellNumber = "cell Number";
//        salary = 0;
 //       age = 0;
  //  }

// Task 3 :
    void info(){
System.out.println(name + " " + position + " " + email + " " + cellNumber + " " + salary + " " + age);

    }


}