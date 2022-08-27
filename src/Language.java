public enum Language {
    JAVA("JAVA"),
    JS("JS"),
    PYTHON("PYTHON");

    private final String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
