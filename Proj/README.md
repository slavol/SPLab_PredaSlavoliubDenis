Store Inventory Manager - Preda Slavoliub-Denis

Acest proiect reprezintă o aplicație RESTful realizată în Spring Boot, care oferă funcționalități
de gestionare a produselor dintr-un magazin. Proiectul permite adăugarea, modificarea, ștergerea
și vizualizarea produselor. Datele sunt stocate într-o bază de date H2.

Am ales această temă deoarece este simplă, ușor de înțeles și evidențiază conceptele fundamentale
învățate în cadrul laboratorului: REST controllers, serviciu, repozitoriu, operații CRUD și
persistența datelor în baza de date.

Funcționalități implementate:
- Adăugarea unui produs nou
- Ștergerea unui produs existent
- Modificarea detaliilor unui produs
- Vizualizarea tuturor produselor
- Vizualizarea unui produs după ID

Modelul Product:
- id: Integer
- name: String
- price: Double
- quantity: Integer

Baza de date:
- Baza de date H2
- Tabelul: product (id, name, price, quantity)

Endpoint-uri:
/products (GET)           -> returnează toate produsele
/products/{id} (GET)      -> returnează produsul cu ID-ul dat
/products (POST)          -> adaugă un produs nou
/products/{id} (PUT)      -> actualizează un produs
/products/{id} (DELETE)   -> șterge un produs

Motivația alegerii temei:
Proiectul este simplu, practic și demonstrează utilizarea corectă a unui API REST,
folosirea Spring Boot, lucrul cu servicii și repozitorii, precum și manipularea datelor.

Proj/
├── README.md
└── store-inventory/
├── src/main/java/com/example/store/
│      ├── StoreInventoryApplication.java
│      ├── controllers/
│      │       └── ProductController.java
│      ├── entities/
│      │       └── Product.java
│      ├── services/
│      │       └── ProductService.java
│      └── persistence/
│              └── ProductRepository.java
├── src/main/resources/application.properties
└── build.gradle

Pornirea aplicatiei:

Windows:
    gradlew.bat bootRun

Linux/MacOS:
    cd Proj/store-inventory
    export JAVA_HOME=$(/usr/libexec/java_home -v 21)\nexport PATH=$JAVA_HOME/bin:$PATH
    gradlew.bat bootRun

Accesarea in aplicatie:
    http://localhost:8080/index.html