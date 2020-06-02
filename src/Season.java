enum Season {
    SPRING("Wiosna", new String[]{"mar", "kwi", "maj"}),

    SUMMER("Lato", new String[]{"cze", "lip", "sie"}),

    AUTUMN("Jesien", new String[]{"wrz", "paz", "lis"}),

    WINTER("Zima", new String[]{"gru", "sty", "lut"});

    private final String description;
    private final String months[];


    Season(String description, String months[]) {
        this.description = description;
        this.months = months;
    }


    @Override
    public String toString() {
        return description + " - " + months[0] + "," + months[1] + "," + months[2];
    }
}