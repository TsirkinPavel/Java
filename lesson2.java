//Лекция2 + Семинар2


// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.logging.Level;
// import java.util.logging.Logger;

// import javax.management.RuntimeErrorException;

// public class lesson2 {
//     public static void main(String[] args) {
// 1 универсальный метод проверки для разных ОС

// String pathProject = System.getProperty("user.dir");// метод getProperty
// класса System, возвращает путь,
// // от куда запускается программа
// String pathFile = pathProject.concat("/file.txt");
// File f3 = new File(pathFile);
// System.out.println(f3.getAbsolutePath());// возвращает абсолютный путь файла
// // /Users/sk/vscode/java_projects/file.txt
// // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

2 Метод try/catch

FileReader fr = null;
try {
fr = new FileReader("file.txt");
System.out.println("выполнился код чтения");
// int x = 2/0;
} catch (FileNotFoundException e) {
e.printStackTrace();
System.out.println("выполняется код обработки исключения");
} catch (ArithmeticException e) {
System.out.println("Обработка деления на ноль");
} finally { // в 95% случаев использутся для кода ниже
try {
fr.close();
} catch (IOException e) {
throw new RuntimeException(); // принудительное завершение программы по
исключению
// например RuntimeException()или любому другому
}
//System.out.println("проверка проведена"); //или просто что-то можем вывести
на экран
}
}
}
    }
}

