# Реализации множества в Java: HashSet, LinkedHashSet и TreeSet

## Описание проекта

Этот проект демонстрирует использование различных реализаций множества в Java, а именно `HashSet`, `LinkedHashSet` и `TreeSet`. Мы храним экземпляры персонажей аниме из популярного сериала "Невероятные приключения ДжоДжо" в этих множествах и выполняем различные операции, чтобы понять их поведение и характеристики.

## Классы

### JJBACharacters

Этот класс представляет персонажей из "Jojo's Bizzare Adventures", с атрибутами, такими как имя, уровень силы, возраст и стенд.

### Main

Это основной класс, где мы создаем экземпляры `HashSet`, `LinkedHashSet` и `TreeSet`, заполняем их объектами JJBACharacters и выводим их, чтобы наблюдать порядок и уникальность.

## Наблюдения

- `HashSet` не поддерживает никакого порядка элементов и позволяет добавить null элемент.
- `LinkedHashSet` поддерживает порядок вставки элементов.
- `TreeSet` сортирует элементы в естественном порядке или в соответствии с предоставленным компаратором. В этом проекте мы использовали компаратор для сортировки персонажей по их уровню силы.

## Фрагмент кода

```java
Set<JJBACharacters> hashSetJJBACharacters = new HashSet<>();
hashSetJJBACharacters.add(new JJBACharacters("Jotaro Jujo", 9000, 17, "Star Platinum"));
// ... куча других элементов
output(hashSetJJBACharacters);

Set<JJBACharacters> linkedHashSetJJBACharacters = new LinkedHashSet<>();
linkedHashSetJJBACharacters.add(new JJBACharacters("Josuke Higashikata", 8500, 16, "Crazy Diamond"));
// ... куча других элементов
output(linkedHashSetJJBACharacters);

Set<JJBACharacters> treeSetJJBACharacters = new TreeSet<>(Comparator.comparingInt(JJBACharacters::getPowerLevel));
treeSetJJBACharacters.add(new JJBACharacters("Giorno Giovanna", 9000, 15, "Gold Experience"));
// ... куча других элементов
output(treeSetJJBACharacters);
```

## Вывод

Программа выведет элементы `HashSet`, `LinkedHashSet` и `TreeSet` в консоль, демонстрируя свойства порядка и уникальности каждой реализации множества.
