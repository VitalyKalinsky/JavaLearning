package projects.sortThing;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Locale;

public class SortThing {
    private static final File filePath = new File("D:\\Downloads");
    static Path fileFromMove = null;
    static Path fileToMove = null;

    public static void main(String[] args) throws IOException {
        String[] filesList = filePath.list();
        for (String file : filesList) {
            //"достаём" файл их папки
            fileFromMove = Paths.get("D:\\Downloads\\" + file);
            //проверка расширений
            String exhibition = (file.substring(file.lastIndexOf(".") + 1)).toLowerCase(Locale.ROOT);
            //проверяем папка ли это или файл с помощью нахождения точки
            if (file.contains(".")) {
                //картинки
                if (exhibition.equals("png") || exhibition.equals("jpeg") ||
                        exhibition.equals("jpg") || exhibition.equals("mp4") ||
                        exhibition.equals("avi") || exhibition.equals("gif")) {
                    System.out.println("Moving file " + "D:\\Downloads\\" + file);
                    fileToMove = Paths.get("D:\\Downloads\\Pictures\\" + file);
                }

                //установщики
                else if (exhibition.equals("exe") || exhibition.equals("torrent")) {
                    System.out.println("Moving file " + "D:\\Downloads\\" + file);
                    fileToMove = Paths.get("D:\\Downloads\\Setups\\" + file);
                }

                //музыка
                else if (exhibition.equals("mp3") || exhibition.equals("wav") || exhibition.equals("aac")) {
                    System.out.println("Moving file " + "D:\\Downloads\\" + file);
                    fileToMove = Paths.get("D:\\Downloads\\Music\\" + file);
                }

                //програмные штуки
                else if (exhibition.equals("xml") || exhibition.equals("py") || exhibition.equals("java")) {
                    System.out.println("Moving file " + "D:\\Downloads\\" + file);
                    fileToMove = Paths.get("D:\\Downloads\\Programming\\" + file);
                }

                //всё остальное
                else {
                    System.out.println("Moving file " + "D:\\Downloads\\" + file);
                    fileToMove = Paths.get("D:\\Downloads\\Other\\" + file);
                }
                try {
                    Files.move(fileFromMove, fileToMove);
                } catch (FileAlreadyExistsException e) {
                    System.out.println("File is already exists");
                    Files.delete(fileFromMove);
                    
                } catch (NoSuchFileException ex) {
                    System.out.println("OK");
                } catch( FileSystemException nfe){
                    System.out.println("Файл "+ file +" занят");
                }
            }
        }
    }
}
