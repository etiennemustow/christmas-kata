public class Player {
    private String name;
    private String character;
    private String modifier;

    public String getModifier() {
        return modifier;
    }

    public Player(String name, String character) {
        this.name = name;
        this.character = character;
    }

    public Player(String name, String character, String modifier) {
        this.name = name;
        this.character = character;
        this.modifier = modifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
