package mx.diego.proyect.backyard;

import mx.diego.proyect.home.Person;

class Dog {

    protected String name;
    protected String race;

    String playing(Person person){
        return person.throwBall().concat(this.name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
