package LTM.Model;

import java.io.Serializable;
 
public class FileModel implements Serializable {
    private static final long serialVersionUID = 1L;
 
    private String sourceDirectory;
    private String filename;
    private long fileSize;
    private int piecesOfFile;
    private int lastByteLength;
    private byte[] dataBytes;
    private String status;
    // Constructor

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
    public void setDataBytes(byte[] dataBytes) {
        this.dataBytes = dataBytes;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setLastByteLength(int lastByteLength) {
        this.lastByteLength = lastByteLength;
    }
    public void setPiecesOfFile(int piecesOfFile) {
        this.piecesOfFile = piecesOfFile;
    }
    public void setSourceDirectory(String sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getDataBytes() {
        return dataBytes;
    }

    public long getFileSize() {
        return fileSize;
    }

    public String getFilename() {
        return filename;
    }

    public int getLastByteLength() {
        return lastByteLength;
    }

    public int getPiecesOfFile() {
        return piecesOfFile;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getSourceDirectory() {
        return sourceDirectory;
    }

    public String getStatus() {
        return status;
    }

}