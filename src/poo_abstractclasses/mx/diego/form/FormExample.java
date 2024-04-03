package poo_abstractclasses.mx.diego.form;

import poo_abstractclasses.mx.diego.form.elements.ElementForm;
import poo_abstractclasses.mx.diego.form.elements.InputForm;
import poo_abstractclasses.mx.diego.form.elements.SelectForm;
import poo_abstractclasses.mx.diego.form.elements.TextAreaForm;
import poo_abstractclasses.mx.diego.form.elements.select.Option;
import poo_abstractclasses.mx.diego.form.validator.EmailValidator;
import poo_abstractclasses.mx.diego.form.validator.LengthValidator;
import poo_abstractclasses.mx.diego.form.validator.NotNull;
import poo_abstractclasses.mx.diego.form.validator.NumberValidator;
import poo_abstractclasses.mx.diego.form.validator.ValidatorRequired;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormExample {
    public static void main(String[] args) {

        var username = new InputForm("username");
        username.addValidator(new ValidatorRequired());
        var password = new InputForm("keyword" , "password");
        password.addValidator(new ValidatorRequired())
                .addValidator(new LengthValidator(6,12));
        var email = new InputForm("email", "email");
        //email.addValidator(new ValidatorRequired())
              //  .addValidator(new EmailValidator());
        var age = new InputForm("age", "number");
        age.addValidator(new NumberValidator());

        var experience = new TextAreaForm("exp", 5, 9);

        var language = new SelectForm("language");
        language.addValidator(new NotNull());
        var java = new Option("1","Java");
        language.addOptions(java)
                .addOptions(new Option("4", "TypeScript").setSelect())
                .addOptions(new Option("2", "JavaScript"))
                .addOptions(new Option("3", "Python"));

        var wave = new ElementForm("wave"){
            @Override
            public String drawHtml() {
                return "<input disabled name='"+this.name+"' value=\"" + this.value+ "\"";
            }
        };

        wave.setValue("hi there!!! this field is disabled");
        java.setSelect(true);
        username.setValue("diego93");
        password.setValue("diego123");
        email.setValue("diegoalejandro.solano@hotmail.com");
        age.setValue("30");

        experience.setValue(" more than 10 experience years ");

        var elements = Arrays.asList(
                username,
                password,
                email,
                age,
                experience,
                language,
                wave
        );

        for (ElementForm elementForm : elements) System.out.println(elementForm.drawHtml());

        elements.forEach(element -> System.out.println(element.drawHtml()));

        elements.forEach(element -> {
            if (!element.isValid()) element.getErrors().forEach(System.out::println);
        });







    }
}
