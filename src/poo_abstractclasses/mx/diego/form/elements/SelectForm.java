package poo_abstractclasses.mx.diego.form.elements;

import poo_abstractclasses.mx.diego.form.elements.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm{

    private List<Option> options;

    public SelectForm(String name)  {
        super(name);
        this.options = new ArrayList<Option>();
    }
    public SelectForm(String name, List<Option> options) {
        this(name);
        this.options = options;
    }

    public SelectForm addOptions(Option option){
        this.options.add(option);
        return this;
    }

    @Override
    public String drawHtml() {
        StringBuilder stringBuilder = new StringBuilder("<select ");
        stringBuilder.append("name='")
                .append(this.name)
                .append("'>");
        for(Option option : options){
            stringBuilder.append("\n <option value='").append(option.getValue()).append("'");
                    if (option.isSelect()) {
                        stringBuilder.append(" selected");
                        this.value = option.getValue();
                    }
                    stringBuilder.append(">")
                    .append(option.getName()).append("</option>");
        }
        stringBuilder.append("</select>");
        return stringBuilder.toString();
    }
}
