/*
 * Copyright (c) Dark Knight 2018.
 */

package com.dark.knight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileFolderService {

    private  static final Logger LOG = LoggerFactory.getLogger(FileFolderService.class);

    private String folderPath;
    private String fileName;
    private Path path;

//    getter and setter
    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public FileFolderService(Path path) {
        this.path = path;
    }

    public Path createFolder() throws IOException {
//        TODO
        return Files.createDirectory(path);
    }

    public Path createFile() throws IOException {
//        TODO
       return Files.createFile(path);
    }

    /**
     * checks to existing the path from file or folder
     *
     * @return boolean can not null
     */
    public boolean isPathExists() {

        return Files.exists(this.path);
    }
}
