public class Cat{

    public Cat(String name, int age){

        this.m_Name = name;
        this.m_Age = age;

        System.out.println("Ce chat ce nomme " + this.m_Name + " et il a  " + this.m_Age +" ans");

    }

    private String m_Name;
    private int m_Age;

}