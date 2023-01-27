package kirill.battle_of_sea;

public enum Ships {
    one("firstFlour", "asdad", 1, 4),
    two("secondFlour", "vbnv", 2, 3),
    three("thirdFlour", "asdad", 3, 2),
    four("fourthFlour", "asdad", 4, 1);

    private String name;
    private String info;
    private int size;
    private int count;

    Ships(String name, String info, int size, int count) {
        this.name = name;
        this.info = info;
        this.size = size;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }
}
