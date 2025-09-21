package gestion_cabinet_avocat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cabinet cabinet = new Cabinet();
        int choice = 0;

        do {
            System.out.println("=== MENU CABINET D'AVOCAT ===");
            System.out.println("1. ajouter un client");
            System.out.println("2. affichertous les client");
            System.out.println("3. rechercher un client par nom");
            System.out.println("4. ouvrir un dossier");
            System.out.println("5.afficher tous les dossiers");
            System.out.println("6. quitter le programme");
            System.out.print("votre choix: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid . entrer un number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id;
                    try {
                        id = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid ID. au qun client.");
                        scanner.nextLine();
                        break;
                    }
                    System.out.print("Nom: ");
                    String name = scanner.nextLine();
                    System.out.print("Prenom: ");
                    String firstName = scanner.nextLine();
                    System.out.print("telephone: ");
                    String phone = scanner.nextLine();
                    cabinet.addClient(new Client(id, name, firstName, phone));
                    break;

                case 2:
                    cabinet.displayClients();
                    break;

                case 3:
                    System.out.print("Client ID: ");
                    int clientId;
                    try {
                        clientId = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Identifiant client invalide. Cas non ajouté.");
                        scanner.nextLine();
                        break;
                    }
                    System.out.print("Case Type: ");
                    String caseType = scanner.nextLine();
                    System.out.print("Status: ");
                    String status = scanner.nextLine();
                    cabinet.openDossier(clientId, caseType, status);
                    break;

                case 4:
                    cabinet.displayDossiers();
                    break;

                case 5:
                    System.out.print("Nom à rechercher: ");
                    String searchName = scanner.nextLine();
                    Client result = cabinet.findClient(searchName);
                    if (result != null) {
                        result.afficher();
                    } else {
                        System.out.println("Client non trouvé.");
                    }
                    break;

                case 6:
                    System.out.println("Au revoir!");
                    break;

                default:
                    System.out.println("Choix invalide. Réessayez.");
            }
        } while (choice != 6);

        scanner.close();
    }
}