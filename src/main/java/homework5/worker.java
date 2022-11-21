package homework5;

public class worker {
    String name;
    String job_title;
    String email;
    String phone;
    int salary;
    int age;



    public worker(String name, String job_title, String email, String phone, int salary, int age) {
        this.name = name;
        this.job_title = job_title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, job_title, email, phone, salary, age);}

    public void print(){
        System.out.println(this);
    }


    public static void main(String[] args)  {

        worker[] persArray = new worker[5];
        persArray[0] = new worker("Klim Konstantinov", "General manager", "kk@empire.ru", "+79997777777", 500000, 40);
        persArray[1] = new worker("Slava Shinin", "Technical Director", "ss@empire.ru", "+79997777776", 300000, 38);
        persArray[2] = new worker("Ergun Pechlivan", "Chief Engineer", "ep@empire.ru", "+79997777775", 200000, 42);
        persArray[3] = new worker("Sergey Petrov", "Lead Engineer", "sp@empire.ru", "+79997777774", 150000, 38);
        persArray[4] = new worker("Elena Spiridina", "Administrative director", "es@empire.ru", "+79994445896", 170000, 48);


        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}