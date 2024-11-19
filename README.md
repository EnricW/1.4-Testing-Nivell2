# Testing 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte està format per 10 exercicis que exploren l'ús de JUnit i AssertJ a Java:

### Nivell 1 ⭐
#### Exercici 1: La llibreria
L'exercici se centra en l'aplicació pràctica del testing amb JUnit per verificar exhaustivament el funcionament d'una col·lecció de llibres en Java.

Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca. La classe ha de permetre afegir llibres, recuperar la llista de llibres, obtenir un llibre específic per la seva posició, afegir un llibre en una posició específica i eliminar un llibre per títol. Verifica el seu correcte funcionament amb JUnit:

- Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.
- Confirmen que la llista té una mida esperada després d'inserir diversos llibres.
- Asseguren que la llista conté un llibre específic en la seva posició correcta.
- Verifiquen que no hi ha títols de llibres duplicats a la llista.
- Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
- Asseguren que afegir un llibre modifica correctament la llista.
- Confirmen que eliminar un llibre disminueix la mida de la llista.
- Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.

#### Exercici 2: Calcula lletra del DNI
L'exercici se centra en l'aplicació del testing parametritzat amb JUnit per verificar una classe que calcula la lletra del DNI, emfatitzant l'ús de @ParameterizedTest per automatitzar múltiples casos de prova amb diferents números de DNI predefinits i validar que el càlcul de la lletra és correcte per a tots ells.

Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre. Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.

#### Exercici 3: ArrayIndexOutOfBoundsException
L'exercici introdueix el testing d'excepcions amb JUnit, centrant-se específicament en com verificar que una classe llança correctament una ArrayIndexOutOfBoundsException utilitzant assertThrows() o expected, demostrant així el tractament i validació d'errors en Java.

Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException. Verifica el seu correcte funcionament amb un test jUnit.

### Nivell 2 ⭐⭐
#### Exercicis: AssertJ
Aquest conjunt d'exercicis se centra en l'aprenentatge de la biblioteca AssertJ per a testing en Java, cobrint les seves assercions fluides (fluent assertions) per a:

- Comparació de valors enters amb isEqualTo() i isNotEqualTo()
- Comparació de referències d'objectes amb isSameAs() i isNotSameAs()
- Comparació d'arrays amb containsExactly() o isEqualTo()
- Testing d'ArrayList utilitzant:
- - containsExactly() per ordre específic
- - containsExactlyInAnyOrder() per contingut desordenat
- - containsOnlyOnce() i doesNotContain() per unicitat i absència
- Testing de Map amb containsKey()
- Testing d'excepcions amb assertThatThrownBy() o assertThatExceptionOfType()
- Testing d'Optional amb isEmpty()

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/1.4-Testing-Nivell2.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
