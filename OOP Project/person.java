public abstract class person {
    private int id;
    private String name;

   

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public person() {
        this.id = 0;
        this.name = "null";
    }

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public person(person p) {
        this.id = p.id;
        this.name = p.name;
    }

    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}