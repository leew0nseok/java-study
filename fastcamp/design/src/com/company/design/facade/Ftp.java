package com.company.design.facade;

public class Ftp {
    private String host;
    private int port;
    private String path;

    public Ftp(String host, int post, String path){
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("FTP HOST : "+ host + " Port : " + port +" �� �����մϴ�.");
    }

    public void moveDirectory(){
        System.out.println("FTP path : " + path + "�� �̵��մϴ�.");
    }

    public void disConnect(){
        System.out.println("FTP ������ ���� �մϴ�.");
    }
}
