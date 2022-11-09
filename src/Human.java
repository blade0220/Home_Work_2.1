public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = validOrDefault(name, "Информация не указана");
        this.town = validOrDefault(town, "Информация не указана");
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.jobTitle = validOrDefault(jobTitle, "Информация не указана");
    }



    private String validOrDefault(String value, String defaultValue){
        if (value == null || value.isBlank()) {
            return defaultValue;
        }else {
            return value;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города "  + town + ". Я родился(лась) в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

}
