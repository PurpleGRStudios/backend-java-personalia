
String name;
String age;
String email;
String adres;
String phone;
String height;
String weight;
//    Definieer hier de variabelen


void main(String[] args) {
    printMenu();
    setName();
    setAge();
    setEmail();
    setAdres();
    setPhone();
    setHeight();
    setWeight();
    calculateBMI();

//        Roep hier de andere methodes aan

    printProfile();
    IO.println("Afsluiten. Tot ziens!");
}

void printMenu() {
    IO.println("======================================");
    IO.println("Welkom bij de profiel app");
    IO.println("Deze app zal het volgende uitvoeren:");
    IO.println(" 1  - Vul naam in");
    IO.println(" 2 - Vul leeftijd in");
    IO.println(" 3 - Vul email in");
    IO.println(" 4 - Vul adres in");
    IO.println(" 5 - Vul telefoonnummer in");
    IO.println(" 6 - Vul lengte in");
    IO.println(" 7 - Vul gewicht in");
//        Vul hier het menu aan

}

void printProfile() {
    IO.println();
    IO.println("----- PROFIEL -----");
    IO.println("Naam: " + name);
    IO.println("Age: " + age);
    IO.println("Email: " + email);
    IO.println("Adres: " + adres);
    IO.println("Telefoonnummer: " + phone);
    IO.println("Lengte: " + height);
    IO.println("Gewicht: " + weight);

//        Print hier de andere variabelen

//        Roep de calculateBMI() methode aan.
    IO.println("Je BMI is: " + calculateBMI());
}

void setName() {
    IO.print("Voer je volledige naam in: ");
    String input = IO.readln().trim();
    name = input;
    IO.println("Naam opgeslagen: " + name);
}

void setAge() {
    IO.println("Voer je leeftijd in: ");
    String input = IO.readln().trim();
    age = input;
    IO.println("Leeftijd opgeslagen: " + age);
}

void setEmail(){
    IO.println("Voer je email in: ");
    String input = IO.readln().toLowerCase(Locale.ROOT);
    email = input;
    IO.println("Email opgeslagen: " + email);
}

void setAdres(){
    IO.println("Voer je adres in: ");
    String input = IO.readln();
    adres = input;
    IO.println("Adres opgeslagen: " + adres);
}

void setPhone(){
    IO.println("Voer je telefoonnummer in: ");
    String input = IO.readln();
    phone = input;
    IO.println("Telefoonnummer opgeslagen: " + phone);

}

void setHeight(){
    IO.println("Voer je lengte in: ");
    String input = IO.readln();
    height = input;
    IO.println("Lengte opgeslagen: " + height);

}

void setWeight(){
    IO.println("Voer je gewicht in: ");
    String input = IO.readln();
    weight = input;
    IO.println("Gewicht opgeslagen: " + weight);
}

double calculateBMI(){
    double h = Double.parseDouble(height) / 100.0;
    double w = Double.parseDouble(weight);
    return w / (h * h);
}
//        Schrijf hier de andere methodes






