package core;

import java.util.ArrayList;

public class Board {

    private ArrayList<Player> players;
    private ArrayList<Village> villages;
    private ArrayList<Region> regions;                                         
    private BagResources bagResources;
    private BagOrders bagOrders;
    private int nbTurn;
    private int currentPlayer;

    public Board() {
        nbTurn = 1;
        currentPlayer = 0;
        players = new ArrayList<>();
        villages = new ArrayList<>();
        regions = new ArrayList<>();
        bagResources = new BagResources();
        bagOrders = new BagOrders();
    }

    //Initialisation du plateau
    public void initVillagesAndRegions() {
        
        //Initialisation des villages
        Village village1 = new Village(1, Village.Type.temple);
        Village village2 = new Village(2, Village.Type.house);
        Village village3 = new Village(3, Village.Type.temple);
        Village village4 = new Village(4, Village.Type.house);
        Village village5 = new Village(5, Village.Type.temple);
        Village village6 = new Village(6, Village.Type.monastery);
        Village village7 = new Village(7, Village.Type.monastery);
        Village village8 = new Village(8, Village.Type.house);
        Village village9 = new Village(9, Village.Type.temple);
        Village village10 = new Village(10, Village.Type.monastery);
        Village village11 = new Village(11, Village.Type.temple);
        Village village12 = new Village(12, Village.Type.temple);
        Village village13 = new Village(13, Village.Type.monastery);
        Village village14 = new Village(14, Village.Type.monastery);
        Village village15 = new Village(15, Village.Type.house);
        Village village16 = new Village(16, Village.Type.temple);
        Village village17 = new Village(17, Village.Type.monastery);
        Village village18 = new Village(18, Village.Type.temple);
        Village village19 = new Village(19, Village.Type.house);
        Village village20 = new Village(20, Village.Type.house);
        
        //Initialisation des routes
        village1.addRoad(Road.soil, village2);
        village1.addRoad(Road.stone, village7);
        village1.addRoad(Road.ice, village8);
        village2.addRoad(Road.soil, village1);
        village2.addRoad(Road.stone, village3);
        village3.addRoad(Road.stone, village2);
        village3.addRoad(Road.ice, village6);
        village3.addRoad(Road.soil, village4);
        village4.addRoad(Road.soil, village3);
        village4.addRoad(Road.ice, village5);
        village5.addRoad(Road.ice, village4);
        village5.addRoad(Road.soil, village11);
        village5.addRoad(Road.stone, village6);
        village6.addRoad(Road.stone, village5);
        village6.addRoad(Road.ice, village3);
        village6.addRoad(Road.soil, village7);
        village7.addRoad(Road.soil, village6);
        village7.addRoad(Road.ice, village10);
        village7.addRoad(Road.stone, village1);
        village8.addRoad(Road.ice, village1);
        village8.addRoad(Road.soil, village9);
        village9.addRoad(Road.soil, village8);
        village9.addRoad(Road.ice, village14);
        village9.addRoad(Road.stone, village15);
        village10.addRoad(Road.stone, village11);
        village10.addRoad(Road.ice, village7);
        village10.addRoad(Road.soil, village14);
        village11.addRoad(Road.stone, village10);
        village11.addRoad(Road.soil, village5);
        village11.addRoad(Road.ice, village12);
        village12.addRoad(Road.ice, village11);
        village12.addRoad(Road.stone, village18);
        village12.addRoad(Road.soil, village13);
        village13.addRoad(Road.soil, village12);
        village13.addRoad(Road.ice, village17);
        village13.addRoad(Road.stone, village14);
        village14.addRoad(Road.stone, village13);
        village14.addRoad(Road.soil, village10);
        village14.addRoad(Road.ice, village9);
        village15.addRoad(Road.stone, village9);
        village15.addRoad(Road.soil, village16);
        village16.addRoad(Road.soil, village15);
        village16.addRoad(Road.ice, village20);
        village16.addRoad(Road.stone, village17);
        village17.addRoad(Road.stone, village16);
        village17.addRoad(Road.soil, village18);
        village17.addRoad(Road.ice, village13);
        village18.addRoad(Road.soil, village17);
        village18.addRoad(Road.stone, village12);
        village18.addRoad(Road.ice, village19);
        village19.addRoad(Road.ice, village18);
        village19.addRoad(Road.soil, village20);
        village20.addRoad(Road.soil, village19);
        village20.addRoad(Road.ice, village16);
        
        //Affection villages
        villages.add(village1);
        villages.add(village2);
        villages.add(village3);
        villages.add(village4);
        villages.add(village5);
        villages.add(village6);
        villages.add(village7);
        villages.add(village8);
        villages.add(village9);
        villages.add(village10);
        villages.add(village11);
        villages.add(village12);
        villages.add(village13);
        villages.add(village14);
        villages.add(village15);
        villages.add(village16);
        villages.add(village17);
        villages.add(village18);
        villages.add(village19);
        villages.add(village20);
             
        //Initialisation des Régions
        Region region1 = new Region(1);
        Region region2 = new Region(2);
        Region region3 = new Region(3);
        Region region4 = new Region(4);
        Region region5 = new Region(5);
        Region region6 = new Region(6);
        Region region7 = new Region(7);
        Region region8 = new Region(8);
        
        //Ajout des régions voisines
        region1.addNeighbor(region2);
        region1.addNeighbor(region4);
        region2.addNeighbor(region1);
        region2.addNeighbor(region4);
        region2.addNeighbor(region3);
        region3.addNeighbor(region2);
        region3.addNeighbor(region4);
        region3.addNeighbor(region5);
        region3.addNeighbor(region6);
        region4.addNeighbor(region1);
        region4.addNeighbor(region2);
        region4.addNeighbor(region3);
        region4.addNeighbor(region5);
        region5.addNeighbor(region4);
        region5.addNeighbor(region3);
        region5.addNeighbor(region6);
        region5.addNeighbor(region7);
        region6.addNeighbor(region3);
        region6.addNeighbor(region5);
        region6.addNeighbor(region7);
        region6.addNeighbor(region8);
        region7.addNeighbor(region5);
        region7.addNeighbor(region6);
        region7.addNeighbor(region8);
        region8.addNeighbor(region7);
        region8.addNeighbor(region8);
        
        //Affectation Régions
        regions.add(region1);
        regions.add(region2);
        regions.add(region3);
        regions.add(region4);
        regions.add(region5);
        regions.add(region6);
        regions.add(region7);
        regions.add(region8);
        
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Village> getVillages() {
        return villages;
    }
    
    public Village getVillageById(int id){
        
        Village result = null;
        
        for (Village village : villages) {
            if(village.getId() == id){
                result = village;
            }
        }
        
        return result;
    }

    public int getNbTurn() {
        return nbTurn;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public BagResources getBagResources() {
        return bagResources;
    }

    public BagOrders getBagOrders() {
        return bagOrders;
    }
    
    public void addPlayer(Player p){
        players.add(p);
    }
    
    public void executeActions(){        
        for (int i = 0; i < 6; i++) {
            for(Player p : players){
                switch(p.getAction(i)){
                    case stone: 
                        System.out.println("Déplacement chemin de pierre");
                        p.move(p.getPosition().getDestVillage(Road.stone));
                        break;
                    case soil: 
                        System.out.println("Déplacement chemin de terre");
                        p.move(p.getPosition().getDestVillage(Road.soil));
                        break;
                    case ice: 
                        System.out.println("Déplacement chemin de glace");
                        p.move(p.getPosition().getDestVillage(Road.ice));
                        break;
                    case offering: 
                        System.out.println("Offrande");
                        break;
                    case transaction: 
                        System.out.println("Transaction");
                        break;
                    case pause: 
                        System.out.println("Pause");
                        break;
                    case delegation: 
                        System.out.println("Délégation");
                        break;
                }
            }
        }
    }

}
