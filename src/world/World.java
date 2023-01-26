package world;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import items.Item;
import items.Key;
import items.Potion;

import java.util.Arrays;
import java.util.HashMap;

import enums.KeyID;
import enums.LocationName;

public class World {

        private List<Location> worldLocations = new ArrayList<>();
        private Map<LocationName, ArrayList<Item>> worldItems = new HashMap<>();
        private Map<LocationName, ArrayList<LocationName>> locationPaths = new HashMap<>();

        private Location currentLocation;

        public World() {
                this.generateWorld();
        }

        private void generateWorld() {
                this.generatePaths();
                this.generateWorldItems();
                this.generateLocationsWithPathsAndItems();
        }

        public String getCurrentSituation() {
                String situation = "Aktueller Ort: " + this.currentLocation.getName() + "\n";
                if (!this.currentLocation.isAlreadyVisited()) {
                        situation += this.currentLocation.getDescription() + "\n";
                        this.currentLocation.setVisied();
                }

                return situation;
        }

        private void generatePaths() {
                this.locationPaths.put(LocationName.GATE_PATH,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.ENTRY_HALL)));
                this.locationPaths.put(LocationName.ENTRY_HALL,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.GATE_PATH,
                                                LocationName.BASEMENT1_WEST,
                                                LocationName.BASEMENT1_EAST)));
                this.locationPaths.put(LocationName.BASEMENT1_WEST, new ArrayList<LocationName>(
                                Arrays.asList(LocationName.ENTRY_HALL, LocationName.PANTRY,
                                                LocationName.BALLROOM)));
                this.locationPaths.put(LocationName.PANTRY,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.BASEMENT1_WEST)));
                this.locationPaths.put(LocationName.BALLROOM, new ArrayList<LocationName>(
                                Arrays.asList(LocationName.BASEMENT1_WEST, LocationName.THRONE_COURT)));
                this.locationPaths.put(LocationName.THRONE_COURT,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.BALLROOM,
                                                LocationName.ROYAL_PRISON1,
                                                LocationName.ROYAL_PRISON2, LocationName.KINGS_THRONE)));
                this.locationPaths.put(LocationName.ROYAL_PRISON1,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.THRONE_COURT)));
                this.locationPaths.put(LocationName.ROYAL_PRISON2,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.THRONE_COURT)));
                this.locationPaths.put(LocationName.KINGS_THRONE,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.THRONE_COURT)));
                this.locationPaths.put(LocationName.BASEMENT1_EAST,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.ENTRY_HALL,
                                                LocationName.SMALL_ROOM,
                                                LocationName.OGRE_ROOM)));
                this.locationPaths.put(LocationName.OGRE_ROOM,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.BASEMENT1_EAST,
                                                LocationName.TREASURY)));
                this.locationPaths.put(LocationName.TREASURY,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.OGRE_ROOM)));
                this.locationPaths.put(LocationName.SMALL_ROOM,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.BASEMENT1_EAST,
                                                LocationName.WALL_ROOM)));
                this.locationPaths.put(LocationName.WALL_ROOM,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.SMALL_ROOM,
                                                LocationName.DRAGON_ROOM)));
                this.locationPaths.put(LocationName.DRAGON_ROOM,
                                new ArrayList<LocationName>(Arrays.asList(LocationName.WALL_ROOM)));
        }

        private void generateWorldItems() {
                this.worldItems.put(LocationName.GATE_PATH, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.ENTRY_HALL, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.BASEMENT1_WEST, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.PANTRY,
                                new ArrayList<Item>(Arrays.asList(new Potion(), new Potion())));
                this.worldItems.put(LocationName.BALLROOM, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.THRONE_COURT, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.ROYAL_PRISON1,
                                new ArrayList<Item>(Arrays.asList(new Key(KeyID.ROYAL_PRISON2_KEY.id))));
                this.worldItems.put(LocationName.ROYAL_PRISON2,
                                new ArrayList<Item>(Arrays.asList(new Key(KeyID.THRONE_KEY.id))));
                this.worldItems.put(LocationName.KINGS_THRONE,
                                new ArrayList<Item>(Arrays.asList(new Key(KeyID.DRAGON_KEY.id))));
                this.worldItems.put(LocationName.BASEMENT1_EAST, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.OGRE_ROOM, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.TREASURY,
                                new ArrayList<Item>(Arrays.asList(new Potion(), new Potion(), new Potion())));
                this.worldItems.put(LocationName.SMALL_ROOM, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.WALL_ROOM, new ArrayList<Item>(Arrays.asList()));
                this.worldItems.put(LocationName.DRAGON_ROOM, new ArrayList<Item>(Arrays.asList()));
        }

        private void generateLocationsWithPathsAndItems() {

                this.generateAndSetCurrentLocation();

                this.worldLocations.add(new Location(LocationName.ENTRY_HALL.label,
                                "Ein leerer Raum, vor dir jeweils links und rechts Treppen, die nach unten führen.",
                                this.locationPaths.get(LocationName.ENTRY_HALL),
                                this.worldItems.get(LocationName.ENTRY_HALL)));

                this.worldLocations.add(new Location(LocationName.BASEMENT1_WEST.label,
                                "Du kommst unten an in einem schlecht beleuchteten Raum. Es gibt zwei Türen, einer führt nach weiter nach norden, der andere nach links. Es kommen Goblins auf dich zu!.",
                                this.locationPaths.get(LocationName.BASEMENT1_WEST),
                                this.worldItems.get(LocationName.BASEMENT1_WEST)));

                this.worldLocations.add(new Location(LocationName.BASEMENT1_EAST.label,
                                "Du kommst unten an in einem schlecht beleuchteten Raum. Es kommen Goblins auf dich zu!.",
                                this.locationPaths.get(LocationName.BASEMENT1_EAST),
                                this.worldItems.get(LocationName.BASEMENT1_EAST)));

                this.worldLocations.add(new Location(LocationName.PANTRY.label,
                                "Du befindest dich in einer Speisekammer wieder, die aber sonst nirgends hinführt.",
                                this.locationPaths.get(LocationName.PANTRY), this.worldItems.get(LocationName.PANTRY)));

                this.worldLocations.add(new Location(LocationName.BALLROOM.label,
                                "Ein großer langer Gang erwartet dich, der nur geradeaus führt. Und da rennen schon die nächsten Gegner auf dich zu.",
                                this.locationPaths.get(LocationName.BALLROOM),
                                this.worldItems.get(LocationName.BALLROOM)));

                this.worldLocations.add(new Location(LocationName.THRONE_COURT.label,
                                "Ein quadratischer Raum mit je einer Tür in jede Richting. Leider wachen hier 3 Oger, die dich bemerkt haben.",
                                this.locationPaths.get(LocationName.THRONE_COURT),
                                this.worldItems.get(LocationName.THRONE_COURT)));

                this.worldLocations.add(new Location(LocationName.ROYAL_PRISON1.label,
                                "Ein Gefängnis, in welchem sich 2 Oger befinden. Hinter dir die einzige Tür, durch die du durchgekommen bist.",
                                this.locationPaths.get(LocationName.ROYAL_PRISON1),
                                this.worldItems.get(LocationName.ROYAL_PRISON1)));

                this.worldLocations.add(new Location(LocationName.ROYAL_PRISON2.label,
                                "Ein Gefängis, in welchem sich diesmal 3 Oger befinden. Hinter dir die einzige Tür, durch die du durchgekommen bist.",
                                this.locationPaths.get(LocationName.ROYAL_PRISON2),
                                this.worldItems.get(LocationName.ROYAL_PRISON2)));

                this.worldLocations.add(new Location(LocationName.KINGS_THRONE.label,
                                "Du bist im Thron des Goblinkönigs, welcher gerade auf seinem Thron sitzt, umgeben von Untertanen.",
                                this.locationPaths.get(LocationName.KINGS_THRONE),
                                this.worldItems.get(LocationName.KINGS_THRONE)));

                this.worldLocations.add(new Location(LocationName.SMALL_ROOM.label,
                                "Du befindest dich in einem Raum, in dem sich eine Treppe nach unten befindet.",
                                this.locationPaths.get(LocationName.SMALL_ROOM),
                                this.worldItems.get(LocationName.SMALL_ROOM)));

                this.worldLocations.add(new Location(LocationName.WALL_ROOM.label,
                                "Unten angelangt wartet vor dir eine große Wand und eine goldene Türe. Dahinter hörst du eine laute Kreatur.",
                                this.locationPaths.get(LocationName.WALL_ROOM),
                                this.worldItems.get(LocationName.WALL_ROOM)));

                this.worldLocations.add(new Location(LocationName.DRAGON_ROOM.label,
                                "Eine große Halle, in welcher sich ein Drache befindet. Dahinter siehst du eine versiegelte Tür, hinter welcher sich Mihiro befindet.",
                                this.locationPaths.get(LocationName.DRAGON_ROOM),
                                this.worldItems.get(LocationName.DRAGON_ROOM)));

                this.worldLocations.add(new Location(LocationName.OGRE_ROOM.label,
                                "Ein Kerker, in welchem sich 3 Oger befinden. Geradeaus eine Tür aus Silber.",
                                this.locationPaths.get(LocationName.OGRE_ROOM),
                                this.worldItems.get(LocationName.OGRE_ROOM)));

                this.worldLocations.add(new Location(LocationName.TREASURY.label,
                                "Du befindest dich in einer Schatzkammer wieder. Die einzige Tür ist die, welche du zum Reinkommen verwendet hast.",
                                this.locationPaths.get(LocationName.TREASURY),
                                this.worldItems.get(LocationName.TREASURY)));
        }

        private void generateAndSetCurrentLocation() {
                this.currentLocation = new Location(LocationName.GATE_PATH.label,
                                "Du bist durch einen Wald gelaufen Richtung Burg. Das Tor ist nicht bewacht. Merkwürdig... Aber es scheint keinen anderen Weg reinzugeben.",
                                this.locationPaths.get(LocationName.GATE_PATH),
                                this.worldItems.get(LocationName.GATE_PATH));
                this.worldLocations.add(currentLocation);
        }

}