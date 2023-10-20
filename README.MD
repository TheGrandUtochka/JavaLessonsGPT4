### Проект "Персонажи JoJo's Bizarre Adventure Stardust Crusaders"

#### Описание
Этот проект представляет собой пример использования LinkedList в Java для хранения и манипуляции объектами. В данном случае, объекты представляют собой персонажей аниме "JoJo's Bizarre Adventure: Stardust Crusaders".

### AnimeCharacter
Базовый класс, который содержит основные атрибуты персонажа аниме, такие как имя, уровень мощности и возраст.

### JJBACharacter
Класс, наследуемый от `AnimeCharacter`, добавляет атрибут "stand" для персонажей аниме "JoJo's Bizarre Adventure".

## Основные Функции
- Создание объектов `JJBACharacter`.
- Добавление объектов в `LinkedList`.
- Вывод содержимого `LinkedList`.
- Удаление объектов из `LinkedList` по индексу.

## Примеры Использования
```java
LinkedList<JJBACharacter> JJBACharacterList = new LinkedList<>();
JJBACharacterList.add(new JJBACharacter("Jotaro Kujo", 9000, 17, "Star Platinum"));
// ... (добавление других персонажей)
JJBACharacterList.remove(2);  // Удаление персонажа по индексу
```
#### Результат
Программа демонстрирует базовое использование LinkedList для хранения и манипуляции объектами, а также принципы ООП, такие как наследование.