public enum ExceptionEnum {
    N1 ("NumberFormatException"),
    N2 ("2NumberFormatException");
    private String error;

    ExceptionEnum(String error){
        this.error = error;
    }

    public String getTitle() {
        return error;
    }
}
