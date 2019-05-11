[[zur�ck](../README.md)]

# sew4-design-patterns-faydin-tgm
sew4-design-patterns-faydin-tgm created by GitHub Classroom


## **Factory Pattern**
Der Factory Pattern wird in diesem Dokument behandelt.

#### Erkl�rung:
Mit dem Factory Pattern kann man Klassen erstellen, ohne zu spezifizieren, wekche konkrete Klassen man instantiert. Au�erdem kann man vermeiden, das eine Klasse zu abh�ngig von konkreten Subklassen ist und somit der Code der Superklasse, bei �nderung einer Subklasse, ver�ndert werden muss. 
Benutzt wird es, wenn eine Methode eines von mehreren m�glichen Klassen zur�ckgibt, die die selbe Superklasse haben, wenn man nicht wei�, welches Klassenobjekt man brauchen wird und wenn man nicht will, dass der Client/User jede Unterklasse kennt, sondern nur die, die auch gebraucht werden.
Die Objekt Erstellung wird beim Factory Pattern verkapselt, bzw. vom unver�nderbaren Code getrennt und nur an einer bestimmten Klasse gemacht.

#### Problembeschreibung
Klassen, die von vielen konkreten Unterklassen abh�ngig sind, k�nnen beim Hinzuf�gen von weiteren konkreten Unterklassen Probleme verursachen.

Wenn man eine Klasse hat, die Objekte zur Laufzeit dynamisch bereitstellen soll, ist es schlecht, wenn man konkrete Klassen (und den "new" Operator) benutzt. Wenn man dies n�hmlich so macht, ist es so, dass die Superklasse von sehr vielen Unterklassen abh�ngig ist. Somit m�sste man die Superklasse �ndern, wenn man neue Unterklassen zur Auswahl hinzuf�gt oder bestehende Unterklassen �ndert. Es gilt das Prinzip: "Klassen sollten nicht modifizierbar, sondern erweiterbar sein". Man sollte also nicht den Code in der Superklasse �ndern m�ssen, sondern diese nur erweitern. Daher will man nicht, dass die Superklasse jede Unterklasse kennt.

#### L�sung
Mit dem Factory Pattern kann man dieses Problem l�sen. Der Factory Pattern baut auf das The Dependency Inversion / Abh�ngigkeit Umkehrung Prinzip auf, welches besagt: "Depend upon abstractions. Do not depend upon concrete classes.". 
Man sollte also abh�ngig von abstrakten Klassen sein, statt von konkreten Klassen. Indem an abstrakte Klassen verwendet, kann man die Unterklassen entscheiden lassen, welche Klassen instantiert werden.

#### UML
![alt text](../UML/Factory_UML.png "Factory Pattern - UML Diagramm")

#### Code Beispiel
Ich habe das Beispiel aus dem Buch Head First Design Patterns genommen, um den Factory Pattern zu erkl�ren.
Das Beispiel ist f�r die Erkl�rung gek�rzt worden. Alle Klassen sind als Java Dateien erh�ltlich.

Klasse PizzaStore:
```java
public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
	
	   pizza = createPizza(type); //Wie Hier zu sehen ist, wird die Pizza nicht in PizzaStore erstellt, somit ist PizzaStore nicht von den Unterklassen abh�ngig. 
	
		pizza.prepare();  //Dies ist der Teil, der sich nicht ver�ndert.
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	abstract Pizza createPizza(String type); //Stattdessen wird eine abstrakte Methode aufgerufen. 
}
```

Hier sind die Factories, die von PizzaStore erben:
```java
public class NYStylePizzaStore extends PizzaStore {
	//orderPizza() wird schon von PizzaStore geerbt, da es nicht abstract ist.
	
	public Pizza createPizza(String type) {		//die createPizza() muss allerdings �berschrieben werden, da es abstract ist.
		if (type.equals("cheese") {	// Hier l�sst man die Unterklasse entscheiden, was f�r eine konkrete Pizza erstellt wird.
			pizza = NYStyleCheesePizza();
		} else if (type.equals("pepperoni"){
			pizza = NYStylePepperoniPizza(); 
		} else if (type.equals("clam"){
			pizza = NYStyleClamPizza(); 
		} else if (type.equals("veggie"){
			pizza = NYStyleVeggiePizza(); 						
	}
}

public class ChicagoStylePizzaStore extends PizzaStore {	//Das selbe auch hier
	public Pizza createPizza(String type) {
		if (type.equals("cheese") {
			pizza = ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni"){
			pizza = ChicagoStylePepperoniPizza(); 
		} else if (type.equals("clam"){
			pizza = ChicagoStyleClamPizza(); 
		} else if (type.equals("veggie"){
			pizza = ChicagoStyleVeggiePizza(); 						
	}
}
```

Dies sind die konkreten Pizza Klassen, die von der abstrakten Klasse Pizza erben:
```java
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
```

Abstrakte Klasse Pizza:
```java
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
 
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
```

Testklasse:
```java
public class Testklasse {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("You ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("You ordered a " + pizza.getName() + "\n");
	}
}
```

### Quellen
* "Head First Design Patterns" von Eric Freeman, Elisabeth Robson, Bert Bates und Kathy Sierra
