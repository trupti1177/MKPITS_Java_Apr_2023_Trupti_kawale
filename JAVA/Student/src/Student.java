class Student{

    /* Student attributes */
    String name;
    int age;
    long mobileNo;
    int level;

    //default constructor
    public Student(){

    }

    //parametrized constructor
    public Student(String name, int age, long mobileNo, int level){
        /*
         * this.variable_name always refer to class level properties
         */
        //set object properties from the arguments/parameters
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.level = level;
    }

    //accessor method to show the student details
    void displayStudent(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Mobile No: "+this.mobileNo);
        System.out.println("Level: "+this.level);
    }

    //mutator method to update the age of student by 2 years
    void updateAge(){
        this.age += 2;
    }

    //creating main method inside the Student class
    public static void main(String args[]){

        //Creating an object or instance
        Student s1=new Student("Alex",21,1234567891,10);//creating an s1 object of Student
        Student s2=new Student("Bob",37,1987654321,11);//creating an s2 object of Student

        //Call updateAge() method
        s1.updateAge();
        s2.updateAge();

        //Call displayStudent() method
        s1.displayStudent();
        s2.displayStudent();
    }
}  