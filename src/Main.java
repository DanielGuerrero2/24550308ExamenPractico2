import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // respuesta del usuario de que va a sacar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de piedra, papel o tijera");

        boolean play = true;
        //Si el usuario quiere seguir jugando  se seguira ejecutando el juego
        while(play)
        {
            System.out.println("Elije una opción: ");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("4. Salir");
            int option = scanner.nextInt();
            int selectionMachine = (int) (Math.random() * 3) + 1;
            switch (option) {
                case 1:
                    System.out.println("Elegiste piedra");
                    if (selectionMachine == 1) {
                        System.out.println("La máquina eligió piedra");
                        System.out.println("Empate");
                    } else if (selectionMachine == 2) {
                        System.out.println("La máquina eligió papel");
                        System.out.println("Perdiste");
                    } else {
                        System.out.println("La máquina eligió tijera");
                        System.out.println("Ganaste");
                    }
                    break;
                case 2:
                    System.out.println("Elegiste papel");
                    if (selectionMachine == 1) {
                        System.out.println("La máquina eligió piedra");
                        System.out.println("Ganaste");
                    } else if (selectionMachine == 2) {
                        System.out.println("La máquina eligió papel");
                        System.out.println("Empate");
                    } else {
                        System.out.println("La máquina eligió tijera");
                        System.out.println("Perdiste");
                    }
                    break;
                case 3:
                    System.out.println("Elegiste tijera");
                    if (selectionMachine == 1) {
                        System.out.println("La máquina eligió piedra");
                        System.out.println("Perdiste");
                    } else if (selectionMachine == 2) {
                        System.out.println("La máquina eligió papel");
                        System.out.println("Ganaste");
                    } else {
                        System.out.println("La máquina eligió tijera");
                        System.out.println("Empate");
                    }
                    break;
                case 4:
                    play = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            String response = scanner.next();
            if(response.equals("n"))
            {
                play = false;
            }
        }
    }
}