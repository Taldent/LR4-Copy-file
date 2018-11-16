public class Main {

    public static void main (String[] args){
        String src = "D:\\Study\\IT\\SecondYear\\text.txt";
        String dst = "D:\\Study\\IT\\SecondYear\\text1.txt";
        FileManager fileManager;
        try{
            fileManager =new FileManager();
            fileManager.copyFile(src,dst);
            System.out.println("Копирование прошло успешно");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
