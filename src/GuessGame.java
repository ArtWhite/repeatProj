/**
 * Класс игры(игра не закончится пока число не будет угадано)
 */
public class GuessGame {
    Player p1, p2, p3;
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        boolean p1isRight = false,
                p2isRight = false,
                p3isRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я думаю о числе от 0 до 9...");
        /**
         * Цикл для бесконечного угадывания чисел
         */
        while (true){
            System.out.println("Число для угадывания - " +
            targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            //guessp1 = p1.number;
            System.out.println("Игрок предполагает - " +
                    p1.number);
            //guessp2 = p2.number;
            System.out.println("Игрок предполагает - " +
                    p2.number);
            //guessp3 = p3.number;
            System.out.println("Игрок предполагает - " +
                    p3.number);

            if(p1.number == targetNumber){
                p1isRight = true;
            }
            if(p2.number == targetNumber){
                p2isRight = true;
            }
            if(p3.number == targetNumber){
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight){
                System.out.println("У нас победитель!" +
                        "\n" +
                        "Игрок 1 прав? " +
                        p1isRight +
                        "\n" +
                        "Игрок 2 прав? " +
                        p2isRight +
                        "\n" +
                        "Игрок 3 прав? " +
                        p3isRight +
                        "\n" +
                        "Игра окончена!");
                break;
            } else {
                System.out.println("Игрокам придется повторить попытку!");
            }
        }



    }
}
