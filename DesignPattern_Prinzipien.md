[[zurück](README.md)]

# sew4-design-patterns-faydin-tgm
sew4-design-patterns-faydin-tgm created by GitHub Classroom

## **Design Patterns erklärt:**
Design Patterns sind Vorlagen, bzw. Lösungsschablonen, die oft vorkommende Programmierprobleme lösen. Man kann auch ohne Design Patterns diese Probleme umgehen, allerdings zählt das Anwenden von Design Patterns als beste, oder zumindestens weitgehend akzeptierte, Lösung.

## **Prinzipien von Design Patterns**
Dies sind die bisher angewandten Prinzipien:
1. Kapseln Sie das, was variiert
2. Ziehen Sie die Komposition, bzw. Kapselung, der Vererbung vor.
3. Programmieren Sie auf eine Schnittstelle, nicht auf eine Implementierung.
4. Streben Sie für Objekte, die interagieren, nach Entwürfen mit lockerer Bindung
5. Klassen sollten für Erweiterung offen, aber für Veränderung geschlossen sein.
6. "Umkehrung der Abhängigkeiten" Prinzip (Dependency Inversion Principle):   
   Stützen Sie sich auf Abstraktionen. Stützen Sie sich nicht auf konkrete Klassen.

### **Zuordnung zu den gelernten Design Patterns**
Grundsächlich gilt das erste Prinzip bei allen Design Patterns.

* __Strategy Pattern__:

   Beim Strategy Pattern werden die ersten drei Prinzipien angewandt.
   Man nimmt also den Teil vom Code, der sich ändert, und trennt es vom unveränderbaren. Außerdem verwendet man Interfaces oder abstrakte Klassen, um eine Familie von Algorithmen zu erstellen.
  
  [Mehr zum Strategy Pattern](StrategyPattern/DesignPattern_Strategy.md)
  
* __Observer Pattern__:

  Beim Observer gilt zusätzlich das 4. Prinzip. Man hat zwischen Observern und Subjects eine lockere Kopplung. Damit kann man neue Observer registrieren, ohne etwas beim Subject zu ändern.
  
  [Mehr zum Observer Pattern](ObserverPattern/DesignPattern_Observer.md)
  
* __Decorator Pattern__:
  
  Beim Decorator Pattern steht vorallem das 5. Prinzip im Hauptfokus. Statt viele Unterklassen für verschiedene Arten der Superklasse zu haben, kann man auch, bei Anwenden dieses Design Patterns, diese Superklasse durch durch konkrete Dekorierer, diese Eigenschaften zuweisen. Man erweitert die Superklasse also, ohne sie zu modifizieren. Dieses Design Pattern baut auch vor allem auf die Polymorphie auf.
  
  [Mehr zum Decorator Pattern](DecoratorPattern/DesignPattern_Decorator.md)
  
  
* __Factory Pattern__:

  Beim Factory Pattern ist vor allem das 6. Prinzip, also das "Umkehrung der Abhängigkeiten“" Prinzip, wichtig. Durch das nutzen dieses Prinzips kann man eine Klasse weniger abhängig von ihren Unterklassen machen. Dies erfolgt durch die Verwendung von abstrakten Klassen. Man trennt auch das veränderbare vom unveränderbaren.
  
  [Mehr zum Factory Pattern](FactoryPattern/DesignPattern_Factory.md)
  
* __Abstract Factory Pattern__:

  Der abstract Factory Pattern ähnelt dem Factory Pattern. Dieses Design Pattern verwendet aber auch den Strategy Pattern, um eine Gruppe von verwandten und miteinander abhängigen Klassen zu erstellen, ohne konkrete Klassen zu spezifizieren.
  
  [Mehr zum Abstract Factory Pattern](AbstractFactoryPattern/DesignPattern_AbstractFactory.md)
  