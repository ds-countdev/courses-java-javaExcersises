package poo_interfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Resume extends Sheet implements Printer{

    private Person personName;
    private final String career;
    private final List<String> experience;

    public Resume(String content, Person personName, String career) {
        super(content);
        this.personName = personName;
        this.career = career;
        this.experience = new ArrayList<>();
    }

    public Resume addExperience(String exp){
        experience.add(exp);
        return this;
    }

    @Override
    public String printer() {
        var stringBuilder =
        new StringBuilder("Name: ").append(personName).append("\n")
                .append("Resume: ").append(this.content).append("\n")
                .append("Career: ").append(this.career).append("\n")
                .append("Experience: \n");
        for (String exp : experience) stringBuilder.append("- ").append(exp).append("\n");

        return stringBuilder.toString();
    }
}
