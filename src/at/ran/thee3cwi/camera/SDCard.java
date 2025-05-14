package at.ran.thee3cwi.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private List<File> files = new ArrayList<>();
    private int size;

    public SDCard(int size) {
        this.size = size;
    }

    public void saveFile(File file) {
        
        files.add(file);
    }

    public List<File> getFiles() {
        return files;
    }

    public int getFreeSpace() {
        int totalSize = 0;
        for (File file : files) {
            totalSize += file.getSize();
        }
        return size - totalSize;
    }
}
