public class App {
    public static void main(String[] args) {
        Author georgeOrwell =  new Author("Дожрдж", "Оруэлл");
        Author duglasAdams = new Author("Дуглас", "Адамс");
        Book oneNineFourEight = new Book("1984", georgeOrwell, 1948);
        Book theHitchhikerGuideToTheGalaxy = new Book("Автостопом по Галактике", duglasAdams, 1979);
        System.out.println("Название - " + oneNineFourEight.getTitle());
        System.out.println("Автор - " + oneNineFourEight.getAuthor());
        System.out.println("Год издания - " + oneNineFourEight.getYear());
        System.out.println("Название - " + theHitchhikerGuideToTheGalaxy.getTitle());
        System.out.println("Автор - " + theHitchhikerGuideToTheGalaxy.getAuthor());
        System.out.println("Год издания - " + theHitchhikerGuideToTheGalaxy.getYear());
        theHitchhikerGuideToTheGalaxy.setYear(1900);
        System.out.println("Изменёный год создания - " + theHitchhikerGuideToTheGalaxy.getYear());
    }
}
