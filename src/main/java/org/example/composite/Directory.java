package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuyou
 * @since 2022/7/26 18:29
 */
public class Directory extends FileSystemNode{
    private List<FileSystemNode> fileSystemNodes = new ArrayList<>();
    public Directory(String path) {
        super(path);
    }

    @Override
    public int countNumOfFiles() {
        int num = 0;

        for (FileSystemNode fileSystemNode : fileSystemNodes) {
            num += fileSystemNode.countNumOfFiles();
        }
        return num;
    }

    @Override
    public long countSizeOfFiles() {
        long size = 0;
        for (FileSystemNode fileSystemNode : fileSystemNodes) {
            size += fileSystemNode.countSizeOfFiles();
        }
        return size;
    }

    public void addNode(FileSystemNode fileSystemNode) {
        fileSystemNodes.add(fileSystemNode);
    }

    public void removeNode(FileSystemNode fileSystemNode) {
        int size = fileSystemNodes.size();
        int i = 0;
        for (; i < size; i++) {
            if (fileSystemNodes.get(i).getPath().equalsIgnoreCase(fileSystemNode.getPath())) {
                break;
            }
        }
        if (i < size) {
            fileSystemNodes.remove(i);
        }
    }
}
