package TextBasedAdventureGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String name;
    Room room;

    public Player() {

    }
    public Player(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room that = room;
        return room == o;
    }
}
