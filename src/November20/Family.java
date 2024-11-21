package November20;

public class Family {
    private Human Father;
    private Human Mother;
    private Human [] children;

    public Family () {}

    public Family(Human father, Human mother, Human[] children) {
        Father = father;
        Mother = mother;
        this.children = children;
    }

    public Human getFather() {
        return Father;
    }

    public void setFather(Human father) {
        Father = father;
    }

    public Human getMother() {
        return Mother;
    }

    public void setMother(Human mother) {
        Mother = mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }
}