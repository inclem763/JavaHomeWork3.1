public class Main  {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 5_000; //Стоимость билета
        int miles = service.calculate(price); //Ожидается получить 250 миль
        System.out.println(miles);
    }

}