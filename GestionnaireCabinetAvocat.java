package gestion_cabinet_avocat;

public class Cabinet {
    private Client[] clients = new Client[100];
    private Dossier[] dossiers = new Dossier[100];
    private int nbClients = 0;
    private int nbDossiers = 0;

    public void addClient(Client client) {
        if (nbClients < 100 && client != null) {
            for (int i = 0; i < nbClients; i++) {
                if (clients[i].getId() == client.getId()) {
                    System.out.println("Impossible d'ajouter le client : l'ID du client existe déjà.");
                    return;
                }
            }
            clients[nbClients++] = client;
            System.out.println("Client ajouté avec succès !");
        } else {
            System.out.println("Impossible d'ajouter le client : client invalide ou liste de clients pleine.");
        }
    }

    public void displayClients() {
        if (nbClients == 0) {
            System.out.println("Aucun client disponible.");
        } else {
            for (int i = 0; i < nbClients; i++) {
                clients[i].afficher();
            }
        }
    }

    public Client findClient(String name) {
        if (name != null && !name.isEmpty()) {
            for (int i = 0; i < nbClients; i++) {
                if (clients[i].getName().equalsIgnoreCase(name)) {
                    return clients[i];
                }
            }
        }
        return null;
    }

    public void openDossier(int idClient, String caseType, String status) {
        if (nbDossiers < 100 && caseType != null && !caseType.isEmpty() && status != null && !status.isEmpty()) {
            if (nbClients == 0) {
                System.out.println("Impossible d'ajouter le cas : aucun client disponible.");
                return;
            }
            for (int i = 0; i < nbClients; i++) {
                if (clients[i].getId() == idClient) {
                    dossiers[nbDossiers++] = new Dossier(idClient, caseType, status);
                    System.out.println("Cas ajouté avec succès !");
                    return;
                }
            }
            System.out.println("Impossible d'ajouter le dossier : ID du client introuvable.");
        } else {
            System.out.println("Impossible d'ajouter le dossier : Type de dossier ou statut invalide.");
        }
    }

    public void displayDossiers() {
        if (nbDossiers == 0) {
            System.out.println("Aucun cas disponible.");
        } else {
            for (int i = 0; i < nbDossiers; i++) {
                dossiers[i].afficher();
            }
        }
    }
}