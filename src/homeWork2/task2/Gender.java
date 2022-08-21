package homeWork2.task2;

public enum Gender {
    MALE("cholivik"),
    FEMALE("ginka");
    private String title;

    Gender(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
