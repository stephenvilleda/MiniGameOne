package TextBasedAdventureGame;

import java.util.ArrayList;

public class Room {
    private String roomID;
    private String roomName;
    private String roomDescription;
    private String roomVisited;
    private String exits;
    private boolean visited;

    public Room(String roomID, String roomName, String roomDescription, String roomVisited, String exits, boolean visited) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomVisited = roomVisited;
        this.exits = exits;
        this.visited = visited;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomVisited() {
        return roomVisited;
    }

    public void setRoomVisited(String roomVisited) {
        this.roomVisited = roomVisited;
    }

    public String getExits() {
        return exits;
    }

    public void setExits(String exits) {
        this.exits = exits;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rooms=" +
                ", roomID='" + roomID + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                ", exits='" + exits + '\'' +
                ", visited=" + visited +
                '}';
    }
}
