package projects.buildings;

public class House extends Building{
    private int citizenCount = 0;

    public int getCitizenCount() {
        return citizenCount;
    }

    public void setCitizenCount(int citizenCount) {
        this.citizenCount = citizenCount;
    }
}
