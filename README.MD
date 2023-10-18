### Проект "Аниме Персонажи"

#### Описание
Этот проект включает в себя создание и управление объектами класса `AnimeCharacter`. Класс представляет собой модель аниме-персонажа с атрибутами, такими как имя, уровень мощности и название аниме-сериала.

#### Класс `AnimeCharacter`
##### Атрибуты:
- `name`: Имя персонажа аниме.
- `powerLevel`: Уровень мощности персонажа.
- `anime`: Название аниме-сериала, в котором появляется персонаж.

##### Методы:
- Конструктор: Инициализирует новый объект класса с заданными атрибутами.
- `getName()`: Возвращает имя персонажа.
- `getPowerLevel()`: Возвращает уровень мощности персонажа.
- `getAnime()`: Возвращает название аниме-сериала.
- `setPowerLevel(int powerLevel)`: Устанавливает новый уровень мощности персонажа.
- `toString()`: Возвращает строковое представление объекта.

#### Пример использования
```java
public class Main {
    public static void main(String[] args) {
        AnimeCharacter character1 = new AnimeCharacter("Jotaro Kujo", 9000, "JoJo's Bizarre Adventure");
        AnimeCharacter character2 = new AnimeCharacter("Killua Zoldyck", 10000, "Hunter x Hunter");
        AnimeCharacter character3 = new AnimeCharacter("Denji", 4444, "Chainsaw Man");
        character3.setPowerLevel(1111);
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);
    }
}
```

#### Результат
Объекты класса `AnimeCharacter` успешно созданы и модифицированы. Информация о персонажах выводится в консоль в удобном для чтения формате.
