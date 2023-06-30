import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Сделать структуру класса Ноутбук для магазина техники - выделить поля и методы.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
//Например: “Введите цифру, соответствующую необходимому критерию:
//Далее нужно запросить минимальные значения для указанных критериев
// - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//Класс сделать в отдельном файле
//
//приветствие
//Выбор параметра
//выбор конкретнее
//вывод подходящих
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> brands = new HashMap<>();
        Map<Integer, String> model = new HashMap<>(); // empty
        HashMap<Integer, String> processor = new HashMap<>();
        HashMap<Integer, Integer> memory = new HashMap<>();
        Map<Integer, Integer> ram = new HashMap<>();
        Map<Integer, String> typeOS = new HashMap<>();
        Map<Integer, Double> inches = new HashMap<>();

        enter();
        System.out.println(getAll());
    }
    // 3. Метод enter() используется для запроса критерия фильтрации и мин. значения
    public static void enter() {
        System.out.println("Добрый день!\n Подберите ноутбук по параметрам:\n" +
                            "1 - Память\n2 - Оперативна память\n3 - диагональ экрана");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(true){
            if(input == 1){
                System.out.print("Введите минимальное значение памяти: ");
                int input1 = sc.nextInt();
                check(input1);
                //if (input1 > getAll(input1))
            }
            if(input == 2){
                System.out.print("Введите минимальное значение RAM: ");
                int input1 = sc.nextInt();

            }
            if(input == 3){
                System.out.print("Введите минимальное значение диагонали: ");
                int input1 = sc.nextInt();
            }
            else enter();
        }
    }

    public static Map<Integer, Integer> check(int a){
        int i = 1;
        Map<Integer, Integer> mem = new HashMap<>();
        System.out.println(getAll().values());
        for (Integer item : getAll().values()) {
            if(a > item){
                mem.put(i, item);
                i++;
            } else {
                mem.put(i, item);
                i++;
            }
        }
        System.out.println(mem);
        return mem;
    }
    // 4. Метод должен идти по ноутбукам и сравнивает их хар-ки с заданными критериями.
    public static HashMap<Integer, Integer> getAll() {
        Notebook[] notebooks = Laps();

        HashMap<Integer, Integer> memory = new HashMap<>();
        System.out.println("Список всех значений памяти:");
        for (int i = 0; i < Laps().length; i++) {
            Notebook notebook = notebooks[i];
            memory.put(i + 1, notebook.getMemory());
        }
        return memory;

    }


    // 2. В методе main() создаются экземпляры класса Notebook
    public static Notebook[] Laps() {
        Map<Integer, Notebook> notebooks = new HashMap<>();

        Notebook lap1 = new Notebook();
        lap1.setBrand("Asus");
        lap1.setModel("Laptop 15 D543MA-DM1369");
        lap1.setProcessor("Intel Pentium N5030");
        lap1.setInches(15.6);
        lap1.setMemory(1000);
        lap1.setRam(4);
        lap1.setTypeOS(null);
        lap1.setPrice(22_199);
        notebooks.put(1, lap1);

        Notebook lap2 = new Notebook();
        lap2.setBrand("Honor");
        lap2.setModel("MagicBook X 15");
        lap2.setProcessor("Intel Core i3-10110U");
        lap2.setInches(15.6);
        lap2.setMemory(256);
        lap2.setRam(8);
        lap2.setTypeOS("Windows");
        lap2.setPrice(27_999);
        notebooks.put(2, lap2);

        Notebook lap3 = new Notebook();
        lap3.setBrand("Huawei");
        lap3.setModel("MateBook D 14");
        lap3.setProcessor("Intel Core i3-1115G4");
        lap3.setInches(14.0);
        lap3.setMemory(256);
        lap3.setRam(8);
        lap3.setTypeOS("Windows");
        lap3.setPrice(36_999);
        notebooks.put(3, lap3);

        Notebook lap4 = new Notebook();
        lap4.setBrand("Xiaomi");
        lap4.setModel("RedmiBook 15");
        lap4.setProcessor("Intel Core i5-11320H");
        lap4.setInches(15.6);
        lap4.setMemory(512);
        lap4.setRam(8);
        lap4.setTypeOS("Windows");
        lap4.setPrice(49_999);
        notebooks.put(4, lap4);

        Notebook lap5 = new Notebook();
        lap5.setBrand("Apple");
        lap5.setModel("MacBook Air");
        lap5.setProcessor("Apple M1");
        lap5.setInches(13.3);
        lap5.setMemory(256);
        lap5.setRam(8);
        lap5.setTypeOS("macOS");
        lap5.setPrice(86_799);
        notebooks.put(5, lap5);

        return new Notebook[]{lap1, lap2, lap3, lap4, lap5};
    }
}
