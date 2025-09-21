package gestion_cabinet_avocat;
	public class Dossier {
		    private int idClient;
		    private String typeAffaire;
		    private String statut;

		    public Dossier(int id, String type, String status) {
		        idClient = id;
		        typeAffaire = type;
		        statut = status;
		    }
		    public int getIdClient() {
		        return idClient;
		    }

		    public void setIdClient(int id) {
		        idClient = id;
		    }
		    public String getTypeAffaire() {
		        return typeAffaire;
		    }
		    public void setTypeAffaire(String type) {
		        typeAffaire = type;
		    }
		    public String getStatut() {
		        return statut;
		    }
		    public void setStatut(String status) {
		        statut = status;
		    }
		    public void afficher() {
		        System.out.println("Client ID: " + idClient + " | Case Type: " + typeAffaire + " | Status: " + statut);
		    }
		}