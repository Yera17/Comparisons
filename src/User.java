class User implements Comparable<User> {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(name, age);
    }

    @Override
    public int compareTo(User o) {
        return o.age - age;
    }
}