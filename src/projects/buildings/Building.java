package projects.buildings;

public abstract class Building {
    private String title = null;
    private String address = null;
    private int builtIn = 0;
    private String architectName = null;
    private boolean isCultural = false;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(int builtIn) {
        this.builtIn = builtIn;
    }

    public String getArchitectName() {
        return architectName;
    }

    public void setArchitectName(String architectName) {
        this.architectName = architectName;
    }

    public boolean isCultural() {
        return isCultural;
    }

    public void setCultural(boolean cultural) {
        isCultural = cultural;
    }

    @Override
    public String toString() {
        return "This is a Building";
    }

    void display(){
        System.out.println(this.toString());
    }
}
