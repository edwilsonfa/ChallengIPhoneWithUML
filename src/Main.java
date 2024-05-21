import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device device = new Device();
        int option = -1;

        do {
            System.out.println("""
                    Select one option?
                    1 - Internet
                    2 - Phone
                    3 - Player
                    0 - Exit
                    """);
            try {
                option = sc.nextInt();
                int opt = -1;
                switch (option) {
                    case 1:
                        do {
                            String msg =
                                    """
                                            *** Internet ***
                                            %s
                                            %s
                                            %s
                                            0 - Exit
                                            """.formatted(opt != 1 ? "1 - Show a page?":"",
                                            opt != 2 ? "2 - Add a page?" : "",
                                            opt != 3 ? "3 - Update a page?" : "");
                            System.out.println(msg.replaceAll("(?m)^[ \t]*\r?\n", ""));
                            try {
                                opt = sc.nextInt();
                                switch (opt) {
                                    case 1 -> device.showPage();
                                    case 2 -> device.addPage();
                                    case 3 -> device.updatePage();
                                    case 0 -> {
                                        System.out.println("Encerrando...");
                                        break;
                                    }
                                    default -> System.out.println("Invalid option.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Allowed values (0,1,2,3)");
                                sc.nextLine();
                            }
                        } while (opt != 0);
                        break;

                    case 2:
                        do {
                            String msg =
                                    """
                                            *** Phone ***
                                            %s
                                            %s
                                            %s
                                            0 - Exit
                                            """.formatted(opt != 1 ? "1 - Do a call?":"",
                                            opt != 2 ? "2 - Answer a call?" : "",
                                            opt != 3 ? "3 - Start a voice mail?" : "");
                            System.out.println(msg.replaceAll("(?m)^[ \t]*\r?\n", ""));
                            try {
                                opt = sc.nextInt();
                                switch (opt) {
                                    case 1 -> device.doCall();
                                    case 2 -> device.answerCall();
                                    case 3 -> device.startVoiceMail();
                                    case 0 -> {
                                        System.out.println("Encerrando...");
                                        break;
                                    }
                                    default -> System.out.println("Invalid option.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Allowed values (0,1,2,3)");
                                sc.nextLine();
                            }
                        } while (opt != 0);
                        break;

                    case 3:
                        do {
                            String msg =
                                    """
                                            *** Player ***
                                            %s
                                            %s
                                            %s
                                            0 - Exit
                                            """.formatted(opt != 1 ? "1 - Select a music?":"",
                                            opt != 2 ? "2 - Play a music?" : "",
                                            opt != 3 ? "3 - Pause a music?" : "");
                            System.out.println(msg.replaceAll("(?m)^[ \t]*\r?\n", ""));
                            try {
                                opt = sc.nextInt();
                                switch (opt) {
                                    case 1 -> device.selectMusic();
                                    case 2 -> device.playMusic();
                                    case 3 -> device.pauseMusic();
                                    case 0 -> {
                                        System.out.println("Encerrando...");
                                        break;
                                    }
                                    default -> System.out.println("Invalid option.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Allowed values (0,1,2,3)");
                                sc.nextLine();
                            }
                        } while (opt != 0);
                        break;

                    case 0:
                        return;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Allowed values (0,1,2,3)");
                sc.nextLine();
            }
        } while (option != 0);

        sc.close();

    }
}