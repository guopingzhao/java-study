package top.zgpv_15;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("test");
        File newDir = new File("a");

        if (!dir.isDirectory()) dir.mkdirs();

        File file = new File(dir, "xxx_001_[tttt]_test.txt");
        if (!file.isFile()) file.createNewFile();
        System.out.println(newDir.exists());
        if (!dir.renameTo(newDir)) delete(dir);
        System.out.println(newDir.length());
        System.out.println(newDir.canExecute());
        System.out.println(newDir.canRead());
        System.out.println(newDir.canWrite());
        System.out.println(newDir.isHidden());
        System.out.println(newDir.getName());
        System.out.println(newDir.getAbsolutePath());
        System.out.println(newDir.getPath());
        System.out.println(newDir.getParent());

        Date date = new Date(newDir.lastModified());
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sDate.format(date));

        Pattern pattern = Pattern.compile("[^_]_([^_]+)_[^_]+(.+)");

        List<File> sl = Arrays.asList(Objects.requireNonNull(newDir.listFiles((dir1, name) -> new File(dir1, name).isFile() && Pattern.matches(".+\\.txt$", name))));

        for (File f : sl) {
            String name = f.getName();
            Matcher m = pattern.matcher(name);
            if(m.find()) {
                String newName = m.group(1) + "_" + m.group(2);
                f.renameTo(new File(f.getParentFile(), newName));
            }
        }

        System.out.println(sl);
        delete(newDir);

    }

    public static boolean delete(File file) {

        if (!file.exists()) return false;

        if (file.isFile()) return file.delete();

        List<File> ls = Arrays.asList(file.listFiles());

        for (File l : ls) {
            delete(l);
        }
        return file.delete();
    }
}
