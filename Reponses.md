# Réponses aux questions du TP 5

## Partie 1

### Exercice 1
1. ✅
2. ✅
3. Il y a seulement 1 changement à faire dans `getSalaireBrut()`: `getSalaireNet()` se base sur la fonction précédente.
4. ✅

### Exercice 2
1. ✅
2. ✅
3. ✅
4. ✅
5. Lorsque l'on déclare un objet de type `Employe` avec l'instanciation en tant que `Fabricant`, nous avons accès uniquement aux méthodes de `Employe`. La méthode `fabriquerProduits(int nbProduits)` n'est alors pas accessible et les méthodes `getSalaireBrut()` et `getSalaireNet()` restent inchangées. Cependant, déclarer en tant que `Fabricant` permet d'utiliser ces nouvelles modifications.
6. Pour ajouter une somme fixe de 100€ au salaire brut de tous les employés, il faut ajouter `+ 100` dans le return de la fonction `getSalaireBrut()` directement dans la classe `Employe`.

### Exercice 3
1. ✅
2. ✅
3. ✅
4. - L'avantage majeur est qu'il suffit d'une seule modification pour modifier le salaire des techniciens et des représentants en même temps (vu que le salaire brut des représentants dépendent du salaire brut des techniciens), ce qui est très pratique.
   - L'inconvénient majeur est que l'ont créé un nouvel objet `Technicien` à chaque appel de la fonction `getSalaireBrut()`, ce qui est très lourd au niveau de la charge mémoire.
5. ![Diagramme de classe UML](ressources/diagramme_classes_ex1.png)


## Partie 2

### Exercice 1
1. ✅
2. La construction avec builder est certes souple (possibilité d'initialiser les valeurs à la volée), mais il peut devenir plus long à écrire selon le nombre de données (notamment si on décide de tout initialiser). Exemple :
   ```java
   Employe thomas = new Employe("3", "Thomas", 2, 14.75, 230);
   // L'initialisation ci-dessus compte 59 caractères
   Employe thomas_builder = new Employe.EmployeBuilder()
          .setNrINSEE("3")
          .setNom("Thomas")
          .setEchelon(2)
          .setBase(14.75)
          .setNbHeures(230)
          .build();
   // L'initialisation ci-dessus compte 141 caractères (sans les retours à la ligne)
   // Soit une différence de 82 caractères pour une initialisation complète
   ```
   De plus, si on décide d'appliquer la méthode du builder, il faut bien prendre en compte que les valeurs non initialisées seront initialisées par leur valeur par défaut (si variable primitif) ou par une valeur nulle (si objet), ce qui peut poser des problèmes pour certaines fonctions de `Employe`.
3. ✅
