package TextBasedAdventureGame;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    static ArrayList<Room> rooms = new ArrayList<>();
    static Player player = new Player();
    static Room room;

    public static void main(String[] args) {

        // reading the rooms.txt file and placing information in an ArrayList<Room>
        try {
            File file = new File("rooms.txt");
            Scanner readFile = new Scanner(file);

            while (readFile.hasNext()) {
                String roomId = readFile.nextLine();
                String roomName = readFile.nextLine();
                String roomDescription = readFile.nextLine();
                String roomVisited = readFile.nextLine();
                String exits = readFile.nextLine();
                Boolean visited = Boolean.parseBoolean(readFile.nextLine());
                rooms.add(new Room(roomId, roomName, roomDescription, roomVisited, exits, visited));
            }
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println(rooms.get(i).toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // name for player
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);
        player = new Player(scanner.next(), rooms.get(0));
        System.out.println(rooms.get(0).getRoomDescription());




        // Game loop
        boolean gameIsOn = true;
        while (gameIsOn) {
            move();
            System.out.println("Type Q or Quit to exit");
        }
    }




    // move method that will control game flow
    public static void move() {
        Scanner scanner = new Scanner(System.in);
        String direction = scanner.next();
        if (direction.equalsIgnoreCase("q") | direction.equalsIgnoreCase("quit")) {
            System.out.println("Thank you for playing " + player.getName());
            System.exit(0);
        }
        if (direction.equalsIgnoreCase("n") | direction.equalsIgnoreCase("north") | direction.equalsIgnoreCase("up") | direction.equalsIgnoreCase("u")) {
            if (player.getRoom().equals(rooms.get(0))) {
                player.setRoom(rooms.get(2));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(2))) {
                player.setRoom(rooms.get(5));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(5))) {
                player.setRoom(rooms.get(7));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                    System.out.println("game over");
                    System.exit(0);
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else {
                System.out.println("You cannot move that way");
            }
        }

        if (direction.equalsIgnoreCase("e") | direction.equalsIgnoreCase("east") | direction.equalsIgnoreCase("right") | direction.equalsIgnoreCase("r")) {
            if (player.getRoom().equals(rooms.get(2))) {
                player.setRoom(rooms.get(1));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(3))) {
                player.setRoom(rooms.get(2));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(5))) {
                player.setRoom(rooms.get(4));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(6))) {
                player.setRoom(rooms.get(5));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else {
                System.out.println("You cannot move that way");
            }
        }

        if (direction.equalsIgnoreCase("s") | direction.equalsIgnoreCase("south") | direction.equalsIgnoreCase("down") | direction.equalsIgnoreCase("d")) {
            if (player.getRoom().equals(rooms.get(7))) {
                player.setRoom(rooms.get(5));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(5))) {
                player.setRoom(rooms.get(2));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(2))) {
                player.setRoom(rooms.get(0));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else {
                System.out.println("You cannot move that way");
            }
        }

        if (direction.equalsIgnoreCase("w") | direction.equalsIgnoreCase("west") | direction.equalsIgnoreCase("left") | direction.equalsIgnoreCase("l")) {
            if (player.getRoom().equals(rooms.get(1))) {
                player.setRoom(rooms.get(2));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(2))) {
                player.setRoom(rooms.get(3));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(4))) {
                player.setRoom(rooms.get(5));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else if (player.getRoom().equals(rooms.get(5))) {
                player.setRoom(rooms.get(6));
                if (player.getRoom().isVisited()) {
                    System.out.println(player.getRoom().getRoomVisited());
                } else {
                    System.out.println(player.getRoom().getRoomDescription());
                }
                player.getRoom().setVisited(true);
            } else {
                System.out.println("You cannot move that way");
            }
        }
    }
}
