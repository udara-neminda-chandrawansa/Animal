public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks!");
    }

    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
    }
}
