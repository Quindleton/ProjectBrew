package MemoryDust.RPGElements;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import sample.Controller;

public class GameLogic {

    Controller controller;
    Room currentRoom;

    public GameLogic(Controller controller){
        this.controller = controller;
    }
    public void initialize(){
        initializeRoom();
        initializeTeam();
    }

    private void initializeRoom() {
        currentRoom = new Room();
        currentRoom.build();
    }

    private void initializeTeam(){
        for(int i = 0; i < currentRoom.getFigments().size();i++){
            HBox figmentLine = new HBox();
            Label figmentName = new Label();
            Label figmentHealth = new Label();
            figmentHealth.setText(currentRoom.getFigments().get(i).getStats().get("hp").toString());
            figmentName.setText(currentRoom.getFigments().get(i).getName());
            figmentLine.getChildren().addAll(figmentName,figmentHealth);
            controller.figmentInfoArea.getChildren().add(figmentLine);
        }
    }
}
