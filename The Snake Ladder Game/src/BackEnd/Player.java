package BackEnd;

public class Player {
    private String name;
    private int current_position;

    public Player(){
        this.name = "Unkown Player";
        this.current_position = 1;
    }

    public Player(String name_input){
        this.name = name_input;
        this.current_position = 1;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return current_position;
    }

    public void setCurrentPosition(int current_position_input) {
        this.current_position = current_position_input;
    }

}
