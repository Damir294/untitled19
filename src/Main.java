public class Main {
    public static void main(String[] args) {


        //Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» И.Ф Автора.
        String[][] book = new String [][] {

                {"Мастер и Маргарита", "Преступление и наказание", "Мёртвые души"},
                {"Николай", "Михаил", "Федор"},
                {"Достоевский", "Гоголь", "Булгаков"}
        };
        StringBuilder book1 = new StringBuilder();
        StringBuilder book2 = new StringBuilder();
        StringBuilder book3 = new StringBuilder();
        book1.append(book[0][0]).append(" ").append(book[1][1]).append(" ").append(book[2][2]);
        book2.append(book[0][1]).append(" ").append(book[1][2]).append(" ").append(book[2][0]);
        book3.append(book[0][2]).append(" ").append(book[1][0]).append(" ").append(book[2][1]);
        System.out.println(book1 + ", " + book2 + ", " + book3);}
}