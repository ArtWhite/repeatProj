public class Player {

    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10);
    }
    public void writeNumber (){
        System.out.println("Я предполагаю " + number);
    }
}
